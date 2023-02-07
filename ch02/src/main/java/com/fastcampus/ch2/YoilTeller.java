package com.fastcampus.ch2;

import java.util.Calendar;

// 년월일을 입력하면 요일을 알려주는 프로그램
public class YoilTeller {
	public static void main(String[] args) {
		String year = args[0];
		String month = args[1];
		String day = args[2];
		
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1,dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		char yoil = " 일월화수목금토".charAt(dayOfWeek);
		
		System.out.printf("%s년 %s월 %s년\n%c요일입니다.", year, month, day, yoil);
	}
}
