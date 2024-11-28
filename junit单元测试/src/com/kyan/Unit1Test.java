package com.kyan;

import static org.junit.Assert.*;

import org.junit.Test;

public class Unit1Test {

	private Unit1 u1 = new Unit1();
	
	@Test
	public void testProcess1() {
		assertEquals("可以构建圆形或正方形",u1.process(1, 1));
	}
	@Test
	public void testProcess2() {
		assertEquals("可以构建椭圆",u1.process(4,8));
	}
	@Test
	public void testProcess3() {
		assertEquals("可以构建矩形",u1.process(8,2));
	}
	@Test
	public void testProcess4() {
		assertEquals("可以构建长方形",u1.process(7,6));
	}
	@Test
	public void testProcess5() {
		assertEquals("输入不符合要求",u1.process(-1,-1));
	}
	@Test
	public void testProcess6() {
		assertEquals("输入不符合要求",u1.process(-1,5));
	}
	@Test
	public void testProcess7() {
		assertEquals("输入不符合要求",u1.process(5,-1));
	}

}
