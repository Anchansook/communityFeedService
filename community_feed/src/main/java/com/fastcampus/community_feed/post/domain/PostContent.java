package com.fastcampus.community_feed.post.domain;

//% 게시물 관리

public class PostContent {

	private final String content;

	public PostContent(String content) {
		// 게시글 내용이 없거나 5자 미만, 500자 초과라면 에러
		if (content == null || content.length() < 5 || content.length() > 500)
			throw new IllegalArgumentException();

		this.content = content;
	}
	
}
