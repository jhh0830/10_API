package com.kh.chap04_date.run;


import java.text.SimpleDateFormat;
import java.util.Date;

// 날짜와 관련된 클래스들
public class DateRun {
	
	/*
	 * * Date 클래스
	 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
	 * java.util 패키지 안에 정의되어있음
	 * > 자바 개발 초창기에 급하게 만들어진 다소 완성도가 떨어지는 클래스
	 * 
	 * * SimpleDateFormat 크래스
	 * Date 객체의 정보를 내 입맛에 맞는 문자열 형식으로 변활할 때 사용
	 * java.text 패키지 안에 정의되어있음 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 기본생성자를 이용해서 Date 객체 생성
		Date today = new Date();
		System.out.println("기본생성자 : " + today/*.toString()*/);
		// > 현재 날짜 및 시간을 가지고 옴
		
		// 내가 원하는 날짜 (2020년 6월 19일)로 셋팅하고 싶다면?
		// 방법1) 매개변수 생성자를 이용하는 방법
		//Date date1 = new Date(2020, 6,19);
		//System.out.println("매개변수생성자 : " + date1);
		// > deprecated : 권장하지 않음!!
		// > 내부적으로 내가 전달한 년도 + 1900
		//					  월수 + 1
		// 로 계산이 되서 날짜가 셋팅되기 때문!!
		
		Date date1 = new Date(2020 - 1900, 6-1,19);
		System.out.println("매개변수생성자" +date1);
		// > 년도 - 1900, 월 - 1 한 값을 넘겨야 제대로 셋팅됨!!
		
		// 방법2) 기본생성자로 객체 생성 후 setter 메소드를 이요하는 방법
		Date date2= new Date(); // 현재 날짜 및 시간
		date2.setYear(2020);
		date2.setMonth(6);
		date2.setDate(19);
		date2.setHours(19);
		date2.setMinutes(15);
		date2.setSeconds(30);
		System.out.println("setter메소드 : " + date2);
		
		System.out.println("---------------");
		
		// 내 입맛대로의 포맷 (형식) 을 지정한 문자열을 받고자 할 때
		// java.text.SimpleDateFormat 객체 이용
		
		// 1. 형식을 지정하면서 SimpleDateFormat 객체생성
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E요일");
		
		/*
		 * * SimpleDateFormat 형식 
		 * 년도 : yyyy
		 * 월 : MM
		 * 일 : dd
		 * 시 : hh
		 * 분 : mm
		 * 초 : ss
		 * 요일 : E
		 * 
		 */
		
		// 2.sdf 객체에서 제공하는 format 메소드 호출
		// [ 표현법 ]
		// sdf.format(Date객체) : String
		// > 해당 날짜 정보로 포맷이 지정된 문자열이 반환됨
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
	}

}
