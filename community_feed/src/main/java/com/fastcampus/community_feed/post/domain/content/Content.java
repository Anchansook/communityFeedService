package com.fastcampus.community_feed.post.domain.content;

import com.fastcampus.community_feed.post.common.DatetimeInfo;

//% 컨텐츠들마다 내용에 대한 유효성 검사를 다양하게 하기 위한 추상화

public abstract class Content {

	String contentText;
	final DatetimeInfo datetimeInfo;

	// 생성자
	public Content(String contentText) {
		checkText(contentText);
		this.contentText = contentText;
		this.datetimeInfo = new DatetimeInfo();
	}

	// 내용 수정
	public void updateContent(String updateContent) {
		checkText(updateContent);
		this.contentText = updateContent;
		this.datetimeInfo.updateEditDatetime();
	}

	// 내용 확인하는 추상화 메서드 (다른 곳에서 다양하게 사용하기 위한)
	protected abstract void checkText(String contentText);

	// getter
	public String getContentText() {
		return contentText;
	}
	
}
