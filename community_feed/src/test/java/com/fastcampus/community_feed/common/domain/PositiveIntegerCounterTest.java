package com.fastcampus.community_feed.common.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//% 카운트 테스트

public class PositiveIntegerCounterTest {

	// 카운트 증가 테스트
	@Test
	void givenCreated_whenIncrease_thenCountIsOne() {
		// given
		PositivelntegerCounter counter = new PositivelntegerCounter();

		// when
		counter.increase();

		// then
		assertEquals(1, counter.getCount());
	}

	// 카운트 감소 테스트
	@Test
	void givenCreatedAndIncreased_whenDecrease_thenCountIsZero() {
		// given
		PositivelntegerCounter counter = new PositivelntegerCounter();
		counter.increase();

		// when
		counter.decrease();

		// then
		assertEquals(0, counter.getCount());
	}

	// 음수 방지 테스트
	@Test
	void givenCreated_whenDecrease_thenCountIsZero() {
		// given
		PositivelntegerCounter counter = new PositivelntegerCounter();

		// when
		counter.decrease();

		// then
		assertEquals(0, counter.getCount());
	}
	
}
