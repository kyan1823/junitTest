package com.kyan;

public class Unit2 {
	
	public String check(int year,int month) {
		int days = day(year,month);
		if(days == -1) {
			System.out.println("月份输入不正确");
		}
		return year+"年"+month+"月份的天数是"+days+"天";
	}
	
	public int day(int y, int m) {
		if(0 >= m && m > 12) {
			return -1;
		}else {
			switch(m){
				case 1,3,5,7,8,10,11:			
					return 31;

				case 4,6,9,12:
					return 30;
				
				case 2:
					if(y % 4 == 0 && y % 100 != 0 || y % 1000 == 0) {
						return 29;
					}else {
						return 28;
					}
			}
		}
		return -1;
	} 
}
