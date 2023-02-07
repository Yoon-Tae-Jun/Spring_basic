package com.fastcampus.ch2;

import java.util.Calendar;

// ������� �Է��ϸ� ������ �˷��ִ� ���α׷�
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
		char yoil = " �Ͽ�ȭ�������".charAt(dayOfWeek);
		
		System.out.printf("%s�� %s�� %s��\n%c�����Դϴ�.", year, month, day, yoil);
	}
}