package com.fastcampus.community_feed.post.domain.comment;

import com.fastcampus.community_feed.post.domain.Post;
import com.fastcampus.community_feed.post.domain.content.Content;
import com.fastcampus.community_feed.user.domain.User;

//% 댓글 객체

public class Comment {

	private final Long id;
	private final Post post;
	private final User author;
	private final Content content;

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
	}
	
}
