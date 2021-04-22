package study8;


import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import java.text.SimpleDateFormat;

public class Random_Calendar_Date_study {
	public void main(String[] args) {
	Random random = new Random();
	int num = random.nextInt(100)+1;
	//nextInt는 0부터 ()안에 적힌 값 -1 까지 랜덤으로 뽑아
	
	Calendar cal = Calendar.getInstance();
	
	Date now = new Date();
	
	int Year = cal.get(Calendar.YEAR);
	int Month = cal.get(Calendar.MONTH)+1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	
	Calendar cal2 = Calendar.getInstance();
	
	cal2.set(2014, 11, 24); //특정날짜 지정하기
	Date now2 = cal2.getTime(); // Date타입으로 변경
	
	cal2.add(Calendar.MONTH, 1); //1달 후
	
	cal2.add(Calendar.DATE, 1); //1일  후
	
	
	//원하는 형식을 지정해서 만들
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss (a)");
	String date = sdf.format(new Date());
	
	
	}
}