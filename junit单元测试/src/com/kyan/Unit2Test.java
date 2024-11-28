package com.kyan;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

public class Unit2Test {

	private Unit2 u2 = new Unit2();
	@Test
	public void testCheck1() {
		assertThat(u2.check(2018, 1), equalTo("2018年1月份的天数是31天"));
	}
	@Test
	public void testCheck2() {
		assertThat(u2.check(2018, 4), equalTo("2018年4月份的天数是30天"));
	}
	@Test
	public void testCheck3() {
		assertThat(u2.check(2020, 2), equalTo("2020年2月份的天数是29天"));
	}
	@Test
	public void testCheck4() {
		assertThat(u2.check(2000, 2), equalTo("2000年2月份的天数是29天"));
	}
	@Test
	public void testCheck5() {
		assertThat(u2.check(2018, 2), equalTo("2018年2月份的天数是28天"));
	}

}
