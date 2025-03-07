package com.fastcampus.community_feed.user.domain;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UserInfoTest {

	@Test
	void givenNameAndProfileImage_whenCreated_thenThrowNothing() {
		// given
		String name = "abcd";
		String profileImageUrl = "";

		// when
		// then
		assertDoesNotThrow(() -> new UserInfo(name, profileImageUrl));
	}

	@Test
	void givenNameAndProfileImage_whenCreated_thenThrowError() {
		// given
		String name = "";
		String profileImageUrl = "";

		// when
		// then
		assertThrows(IllegalArgumentException.class, () -> new UserInfo(name, profileImageUrl));
		
	}
	
}
