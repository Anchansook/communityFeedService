package com.fastcampus.community_feed.post.domain.content;

//% 컨텐츠들마다 내용에 대한 유효성 검사를 다양하게 하기 위한 추상화

public abstract class Content {

	String contentText;

	public Content(String contentText) {
		checkText(contentText);
		this.contentText = contentText;
	}

	protected abstract void checkText(String contentText);

	// getter
	public String getContentText() {
		return contentText;
	}
	
}
