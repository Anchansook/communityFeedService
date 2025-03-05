package com.fastcampus.community_feed.post.common;

import java.time.LocalDateTime;

//% 게시물에서 공통으로 사용할 시간 클래스

public class DatetimeInfo {

	// final을 붙이면 불변이 되므로 생략
	private boolean isEdited;
	private LocalDateTime dateTime;

	// 생성자
	public DatetimeInfo() {
		// 처음 생성 시 매개변수로 받아오는 것이 아닌 수정 전이므로 false, 현재 시각으로
		this.isEdited = false;
		this.dateTime = LocalDateTime.now();
	}

	// 업데이트
	public void updateEditDatetime() {
		this.isEdited = true;
		this.dateTime = LocalDateTime.now();
	}

	// getter
	public boolean isEdited() {
		return isEdited;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
}