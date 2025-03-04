package com.fastcampus.community_feed.post.domain.content;

//% 콘텐츠 유효성 검사 추상화 클래스를 확장한 댓글 관리

public class CommentContent extends Content {

	private static final int MAX_COMMENT_LENGTH = 100;

	public CommentContent(String content) {
		super(content);
	}

	@Override
	protected void checkText(String contentText) {
		if (contentText == null || contentText.isEmpty())
			throw new IllegalArgumentException();

		if (contentText.length() > MAX_COMMENT_LENGTH)
			throw new IllegalArgumentException();
	}
	
}
