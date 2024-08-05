package com.kh.chap03_wrapper.run;

// Wrapper 클래스
public class WrapperRun {

	/*
	 * * Wrapper 클래스
	 * "기본 자료형" 을 "객체 형태" 로 포장해주는 클래스들
	 * > 각 기본자료형에 맞는 Wrapper 타입이 별도로 존재함
	 * 
	 * [ 종류 ]
	 * 기본자료형   <-->   Wrapper클래스  
	 * boolean          Boolean (앞이 대문자라서 클래스 타입)
	 * char             Character
	 * byte			    Byte
	 * short		    Short
	 * int 				Integer
	 * long				Float
	 * double			Double					
	 */
	
	public static void main(String[] args) {
		
		// 왜 Wrapper 클래스가 필요한가?
		int num1 = 10;
		int num2 = 15;
		
		// num1 과 num2 가 일치합니까?
		// System.out.println(num1 == num2);
		// System.out.println(num1.equals(num2));
		// > 일반 기본 자료형에서 참조 자료형의 유용한 메소드를 활요하고 싶을 때
		//	Wrapper 클래스 타입으로 변환해서 사용할 수 있다.
		
		// 기본 자료형 --> Wrapper 자료형(Boxing)
		// 1. 객체 생성 구문을 통해 이용하는 방법 (생성자 호출)
		Integer i1 = new Integer(num1); // num1 --> i1
		Integer i2 = new Integer(num2); // num2 --> i2
		
		System.out.println(i1); // 10
		System.out.println(i2/*. toString() 주소값을 찍는게 아니라 주소값 안의 값을 찍어줌*/); // 15
		
		System.out.println(i1 == i2); //false (주소값비교)
		System.out.println(i1.equals(i2)); // false
		
		System.out.println(i1.hashCode());// 10
		System.out.println(i2.hashCode());// 15
		// > 내용물 기준으로 해시코드 리턴
		
		// 대소비교를 하고싶다면?
		// System.out.println(i1 < i2);
		System.out.println(i1.compareTo(i2)); // -1
		// > compareTo 메소드 또한 Object 클래스에서 제공되는 메소드
		//  두 값을 비교할 수 있는 메소드
		//  a.compareTo(b) : a가 b보다 크면 1, b 가 크면 -1, 같으면 0 리턴
		
		// 2. 객체를 생성하지 않고 곧바로 대입하는 방법 (AutoBoxing)
		Integer i3 = num1; // 10
		Integer i4 = num2; // 15
		
		// > 주의사항
		//  AutoBoxing 이 안되는 경우 주의!! (특이케이스)
		Integer i5 = new Integer("123"); 
		// > 문자열을 Integer 로 바꾸고 싶을 때
		
		// Wrapper 자료형 --> 기본 자료형 (UnBoxing)
		// 1. 해당 그 Wrapper 클래스에 정의된 xxxValue() 메소드를 활용하는 방법
		int num3 = i3.intValue(); // i3 --> num3
		int num4 = i4.intValue(); // i4 --> num4
		
		//System.out.println(num3.equals(num4));
		System.out.println(num3 == num4);
		
		// 2. 메소드 따위는 이용하지 않고 곧바로 대입하는 방법 (AutoUnBoxing)
		int num5 = i1;
		int num6 = i2;
		
		System.out.println("------------------");
		
		// 기본 자료형 <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // "1015.3"
		
		// 1. String --> 기본 자료형
		// > "파싱한다." (parsing)
		// [ 표현법 ] 
		// 해당Wrapper클래스명.parseXxx(변환할문자열);
		int i = Integer.parseInt(str1); // "10" --> 10
		double d = Double.parseDouble(str2); // "15.3" --> 15.3
		
		
		// 파싱 시 주의사항
		// Integer.parseInt("12.3");
		// 정수로 바꿀게요 했는데 문자열에 보이는 값이 12.3 double이라서 오류남
		//Float.parseFloat("abc~"); // 위와 같은 이유
		// > 형식에 맞지 않는 문자열을 제시했을 경우
		//   NumberFormatException 오류가 발생함!!
		
		
		System.out.println(i + d); // 25.3
		
		// 2. 기본 자료형 --> String
		// 2_1. String 클래스에 정의된 valueOf 메소드를 활요하는 방법
		// [ 표현법 ]
		// String.valueOf(변환할기본자료형값) : String
		String strI = String.valueOf(i); // 10 --> "10"
		String strD = String.valueOf(d); // 15.3 --> "15.3"
		
		// 2_2. "" (빈 문자열) 을 접합하는 방법
		String result = 10 + "";
		
	}

}
