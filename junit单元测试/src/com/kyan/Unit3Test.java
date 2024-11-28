package com.kyan;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;

public class Unit3Test extends Unit3 {

	private Unit3 u3 = new Unit3();
	
	@Test
	public void testEmailCheck1() {
		assertThat(u3.EmailCheck("admin@gmail.com","qwe123"),equalTo("邮箱地址不符合要求"));
	}
	@Test
	public void testEmailCheck2() {
		assertThat(u3.EmailCheck("admin@126.com","q123"),equalTo("密码不符合要求"));
	}
	@Test
	public void testEmailCheck3() {
		assertThat(u3.EmailCheck("admin@126.com","123456"),equalTo("信息正确"));
	}

}
