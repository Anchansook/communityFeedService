package com.fastcampus.community_feed.common.domain;

//% 팔로우, 좋아요 수 카운트 공통 사용

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

	// getter
	public int getCount() {
		return count;
	}
	
}
