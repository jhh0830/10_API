package com.kh.chap01_math.run;



/*
 * * API (Application Programming Interface)
 * 개발에 자주 사용되는 클래스 및 인터페이스의 묶음의 "사용법" 을 나타냄
 * (개발자 문서)
 * 
 * * 라이브리러
 * 개발에 자주 사용되는 클래스 및 인터페이스 코드 묶음
 * 
 * * 자바 기본 API
 * https://docs.oracle.com/en/java/javase/11/docs/api/index.html
 * 
 * * 수업시간에 다뤄볼 종류
 * Math 클래스
 * String 클래스
 * Wrapper 클래스
 * Date 클래스
 */
// import java.lang.*;
// >샹략 가능, 보이진 않지만 항상 이미 import 가 되어있다.

public class MathRun {

	public static void main(String[] args) {
		// Math (수학과 관련) 클래스 에서 제공하고 있는 유용한 기능들
		
		// * Math 클래스
		// 수학과 관련된 필드들, 메소드들이 정의되어있는 클래스
		// 모든 필드와 메소드들이 static 형식임!! ("싱글톤 패턴")
		// 객체생성 후 접근해서 쓸 필요가 없음
		// java.lang 패키지 내에 존재함
		
		// 필드
		// 1. 파이 : 원주율 (상수필드로 정의됨)
		System.out.println("파이 : " + Math.PI);
		
		// 메소드
		// Math m = new Math();
		// > 모든 메소드들이 static 메소드이기 
		// 떄문에 애초에 객체 생성 자체를 막아둔 것 (private)
		
		// 메소드명(매개변수) : 반환형
		// 1. Math.ceil(double) : double 
		// > 올림 연산 처리
		double num1 = 4.349;
		System.out.println("올림 : "+ Math.ceil(num1)); // 5.0 < -- double으로 반환하는거라 소수점을 살림
		
		// 2. Math.round(double) : long 
		// > 반올림 연산 처리
		System.out.println("반올림 : " + Math.round(num1)); // 4 <-- long으로 반환된거라 아래 소수점을 날림
		
		// 3. Math.floor(double) : double
		// > 버림 연산 처리
		System.out.println("버림 : " + Math.floor(num1)); // 4.0 < -- double으로 반환하는거라 소수점을 살림
		
		// 4. Math.abs(int/double/long/float) : int/double/long/float
		// > 절대값을 구하는 연산 처리
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));
		// > 오버로딩을 적용해서 만든 메소드
		
		// 5. Math.min(int, int) : int 
		// > 최소값을 구하는 연산 처리
		System.out.println("최소값 : " + Math.min(5, 10));
		
		// 6. Math.max(int, int) : int
		// > 최대값을 구하는 연산 처리
		System.out.println("최대값 : " + Math.max(5, 10));
		
		
		// 7. Math.sqrt(double) : double
		// > 제곱근 (루트) 을 구하는 연산 처리
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 8. Math.pow(double, double) : double
		// > 제곱 연산 처리
		System.out.println("2의 10 제곱 : " + Math.pow(2, 10));
		
		
	}

}
