package com.fastcampus.community_feed.post.domain;

import com.fastcampus.community_feed.post.domain.content.PostContent;
import com.fastcampus.community_feed.user.domain.User;

//% 게시글 

public class Post {

	private final Long id;
	private final User author;
	private final PostContent content;

	public Post(Long id, User author, PostContent content) {
		// 작성자가 없다면 에러 
		if (author == null) throw new IllegalArgumentException();

		this.id = id;
		this.author = author;
		this.content = content;
	}
	
}
