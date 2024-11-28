package com.kyan;

public class Unit4 {
	public static String StringCheck(String s) {
		if(s.startsWith("ab")) {
			s = s.replace("ab","ef");
			return "替换前缀后的字符串为:" + s;
		}else if(s.endsWith("cd")) {
			s = s.replaceAll("cd","gh");
			return "替换cd后的字符串为:" + s;
		}else {
			s = s.toUpperCase();
			return "大写字母的字符串为:" + s;
		}

	}
}
