package com.util;

import java.sql.Date;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("년 : "+calendar.get(Calendar.YEAR));
		System.out.println("월 : "+calendar.get(Calendar.MONTH)+1); //월이 0으로 나옴 내부적으로 1~12월을 0~11로 인식하고 있음
		System.out.println("일 : "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("시간 : "+calendar.get(Calendar.HOUR));
		System.out.println("븐 : "+calendar.get(Calendar.MINUTE));
		System.out.println("초 : "+calendar.get(Calendar.SECOND));
		
		//특정날짜 설정
		calendar.set(2023,11,24);
		System.out.println("년 : "+calendar.get(Calendar.YEAR));
		System.out.println("월 : "+calendar.get(Calendar.MONTH)+1); //월이 0으로 나옴 내부적으로 1~12월을 0~11로 인식하고 있음
		System.out.println("일 : "+calendar.get(Calendar.DAY_OF_MONTH));
		
		//java.util.Date
//		Date d = new Date();
		System.out.println();

	}

}
