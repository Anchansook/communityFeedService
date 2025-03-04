package com.fastcampus.community_feed.post.domain.content;

//% 콘텐츠 유효성 검사 추상화 클래스를 확장한 게시물 관리

public class PostContent extends Content {

	private static final int MIN_POST_LENGTH = 5;
	private static final int MAX_POST_LENGTH = 500;

	public PostContent(String content) {
		super(content);
	}

	//& 확인해보니 추상화에 선언한 접근제어자랑 동일하거나 더 넓은 범위로 줘야 함.
	//& 하지만 애초에 추상화 메서드에 private을 해버리면 안됨!
	@Override
	protected void checkText(String contentText) {

		if (contentText == null || contentText.isEmpty()) 
			throw new IllegalArgumentException();

		if (contentText.length() < MIN_POST_LENGTH)
			throw new IllegalArgumentException();

		if (contentText.length() > MAX_POST_LENGTH)
			throw new IllegalArgumentException();

	}
	
}
