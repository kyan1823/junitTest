package com.kyan;

public class Unit1 {
//	public static void main(String[] args) {
//		System.out.println(process(1,1)); //可以构建圆形或正方形
//		System.out.println(process(4,8)); //可以构建椭圆
//		System.out.println(process(8,2)); //可以构建矩形
//		System.out.println(process(7,6)); //可以构建长方形
//	}
	
	public static String process(int x,int y) {
		int rs;
		if(x <= 0 || y <= 0) {
			return "输入不符合要求";
		}
		
		rs = compare(x,y);
	
	
		if(x == y){
			return "可以构建圆形或正方形";
		}else if(2 < rs && rs <= 5) {
			return "可以构建椭圆";
		}else if(rs > 5) {
			return "可以构建矩形";
		}else if(0 < rs && rs <= 2) {
			return "可以构建长方形";
		}
		return "";
	}

	public static int compare(int x,int y) {
		if (x > y) {
			return x - y;
		}
		return y - x;
	}
}