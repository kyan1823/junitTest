package com.kyan;

public class Unit3 {
	
	public  static String EmailCheck(String email,String password) {
		String emailRegex = "^[a-zA-Z]{5}@(163|126)\\.(com|com\\.cn)$";
		if(!email.matches(emailRegex)) {
			 return "邮箱地址不符合要求";
		}
		String passwordRegex = "^\\d{6,}$";
		if(!password.matches(passwordRegex)) {
			 return "密码不符合要求";
		}
		return "信息正确";
		
	}
	
//	public static void main(String[] args) {
//		System.out.println(EmailCheck("admin@gmail.com","123456"));
//	}

}
