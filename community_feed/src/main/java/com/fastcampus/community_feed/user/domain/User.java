package com.fastcampus.community_feed.user.domain;

import java.util.Objects;

public class User {
	private final Long id;
	private final UserInfo userInfo;

	public User(Long id, UserInfo userInfo) {
		this.id = id;
		this.userInfo = userInfo;
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

	// 잠시 확인용 다음 공부 때 지워~
}
