package com.kh.com.chap02_string.controller;

import java.util.StringTokenizer;

// 문자열을 분리하는 방법
public class C_SringTokenizerTest {

	public void method1() {
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
		// 방법1)
		// 문자열, split(String 구분자) : String[]
		String[] arr = str.split(",");
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		// 배열의 경우 for문을 다음과 같이도 쓸 수 있다.
		// > 향상된 for문, foreach문
		
		// [ 표현법 ]
		// for(변수선언문 : 배열명)
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		
		// 방법2)
		// java.util 패키지의 StringTokenizer 클래스를 이용하는 방법
		// [ 표현법 ]
		// StringTokenizer stn = new StringTokenizer(분리할문자열 , 구분자);
		StringTokenizer stn = new StringTokenizer(str,",");
		

		System.out.println("현재 분리된 문자열의 갯수 : "+ stn.countTokens());
		/*
		System.out.println(stn.nextToken()); // Java
		System.out.println(stn.nextToken()); // Oracle
		System.out.println(stn.nextToken()); // JDBC
		System.out.println(stn.nextToken()); // HTML
		System.out.println(stn.nextToken()); // Server
		System.out.println(stn.nextToken()); // Spring
		System.out.println(stn.countTokens());
		*/
		/*
		System.out.println(stn.nextToken());
		// > NoSuchElementException 오류 발생
		// 현재 남아있는 stn 토큰 갯수의 범위를 벗어났으면
		// 더이상 뽑을 데이터가 없는데 왜 뽑니? 라고 알려주는것
		*/
		
		// 반복문을 활용해보기
		/*
		for(int i = 0; i < stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// > stn.countTokens() 메소드는
		// 현재 실제 남아있는 토큰의 갯수만 세서 반환해줌
		
		
		// 해결방법1. 보조해주는 변수를 활용하기
		/*
		int count = stn.countTokens(); // 6 
		
		for(int i =0; i< count; i++) {
			System.out.println(stn.countTokens());
		}*/
		
		// 해결방법2.
		// stn 공간에 남이있는 토근이 있을 동안에만 반복을 돌리는 방법
		while(stn.hasMoreTokens()) {
			// > stn.hasMoreTokens() : boolean
			//   토큰이 남아있다면 true, 아니면 false 반환
			
			System.out.println(stn.nextToken());
		}
		
		
	}
}
