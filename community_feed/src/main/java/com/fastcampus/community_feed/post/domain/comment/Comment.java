package com.fastcampus.community_feed.post.domain.comment;

import com.fastcampus.community_feed.common.domain.PositivelntegerCounter;
import com.fastcampus.community_feed.post.domain.Post;
import com.fastcampus.community_feed.post.domain.content.Content;
import com.fastcampus.community_feed.user.domain.User;

//% 댓글 객체

public class Comment {

	private final Long id;
	private final Post post;
	private final User author;
	private final Content content;
	private final PositivelntegerCounter likeCount;

	// 생성자
	public Comment(Long id, Post post, User author, Content content) {
		// 작성자가 없을 때 에러
		if (author == null) throw new IllegalArgumentException();
		// 게시글이 없을 때 에러
		if (post == null) throw new IllegalArgumentException();
		// 내용이 없을 때 에러
		if (content == null) throw new IllegalArgumentException();

		this.id = id;
		this.post = post;
		this.author = author;
		this.content = content;
		this.likeCount = new PositivelntegerCounter(); // 매개변수로 받아오는 것이 아니라 생성 시 0으로 초기화로 시작
	}

	// 좋아요 기능
	public void like(User user) {
		// 현 유저가 게시글 작성자와 동일하다면 에러 (본인 게시글 좋아요 못 누름!)
		if (this.author.equals(user)) throw new IllegalArgumentException();

		likeCount.increase();
	}

	// 좋아요 취소
	public void unlike() {
		// 이미 검증된 유저가 좋아요를 눌렀기 때문에 취소는 따로 검증 필요 없음.
		this.likeCount.decrease();
	}

	// 댓글 수정
	public void updateComment(User user, String updateContent) {
		if (!this.author.equals(user)) throw new IllegalArgumentException();
		this.content.updateContent(updateContent);
	}
	
}
