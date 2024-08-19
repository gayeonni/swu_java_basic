package api.util;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// new 키워드로 객체를 생성하지 않음에 주의
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 월은 1월이 0부터 11이 12월까지
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일이 숫자 1
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY: strWeek = "월"; break;
		case Calendar.TUESDAY: strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.THURSDAY: strWeek = "목"; break;
		case Calendar.FRIDAY: strWeek = "금"; break;
		case Calendar.SATURDAY: strWeek = "토"; break;
		case Calendar.SUNDAY: strWeek = "일"; break;
		default: strWeek = "일"; break;
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일입니다.");
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + strWeek + "요일입니다.");
	}

}
