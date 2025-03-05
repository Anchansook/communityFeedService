package com.fastcampus.community_feed.post.domain.comment;

//% 팔로우, 좋아요 수 증가 공통 사용

public class PositivelntegerCounter {

	private int count;

	public PositivelntegerCounter() {
		this.count = 0;
	}

	public void increase() {
		this.count++;
	}

	public void decrease() {
		if (count <= 0) return;

		this.count--;
	}
	
}
