package com.fastcampus.community_feed.user.domain;

import java.util.Objects;

import com.fastcampus.community_feed.common.domain.PositivelntegerCounter;

public class User {
	private final Long id;
	private final UserInfo userInfo; //& 객체 테스트
	private final PositivelntegerCounter followingCounter; //& 객체 테스트
	private final PositivelntegerCounter followerCounter; //& 객체 테스트

	public User(Long id, UserInfo userInfo) {
		if (userInfo == null) throw new IllegalArgumentException();

		this.id = id;
		this.userInfo = userInfo;
		// 각각으로 사용을 해야하기 때문에 새 객체를 생성하여 설정
		this.followingCounter = new PositivelntegerCounter();
		this.followerCounter = new PositivelntegerCounter();
	}

	// 팔로우
	public void follow(User targetUser) {
		if (targetUser.equals(this)) throw new IllegalArgumentException();

		followingCounter.increase();
		targetUser.increaseFollowerCount();
	}

	// 언팔로우
	public void unfollow(User targetUser) {
		if (this.equals(targetUser)) throw new IllegalArgumentException();

		followingCounter.decrease();
		targetUser.decreaseFollowerCount();
	}

	// targetUser.followerCounter.increase(); 
	// .점을 타고타고 가는 것을 줄이기 위한
	private void increaseFollowerCount() {
		followerCounter.increase();
	}

	private void decreaseFollowerCount() {
		followerCounter.decrease();
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
