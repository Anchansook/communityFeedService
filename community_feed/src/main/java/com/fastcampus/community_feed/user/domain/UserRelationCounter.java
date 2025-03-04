package com.fastcampus.community_feed.user.domain;

//% 팔로우, 팔로잉 유저 카운트 도메인

public class UserRelationCounter {

	private int count;

	public UserRelationCounter() {
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
