package com.fastcampus.community_feed.user.domain;

import java.util.Objects;

public class User {
	private final Long id;
	private final UserInfo userInfo;
	private final UserRelationCounter followingCounter;
	private final UserRelationCounter followerCounter;

	public User(Long id, UserInfo userInfo) {
		this.id = id;
		this.userInfo = userInfo;
		// 각각으로 사용을 해야하기 때문에 새 객체를 생성하여 설정
		this.followingCounter = new UserRelationCounter();
		this.followerCounter = new UserRelationCounter();
	}

	// 팔로우
	public void follow(User targetUser) {
		if (targetUser.equals(this)) throw new IllegalArgumentException();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (id == null || getClass() != o.getClass()) return false;

		User user = (User) o;
		return Objects.equals(id, user.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

}
