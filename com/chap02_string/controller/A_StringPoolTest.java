package com.kh.com.chap02_string.controller;

public class A_StringPoolTest {
	
	/*
	 * * String 클래스
	 * 자바에서 문자열을 다루는 용도의 클래스
	 * String name = "홍길동"
	 * 문자열 리터럴을 곧바로 대입하거나, new 구문을 통해
	 * 객체 생성이 가능하다.
	 * java.lang 패지키 내에 정의되어있음
	 * 
	 *  > String 은 "불변클래스" (변하지 않는 클래스) 다.
	 *    값을 수정하는 순간 기존의 값이 담겨있던 공간에서 수정되지 않음
	 * 
	 */
	// 1. 생성자를 통해 문자열을 담기
	public void method1() {
		
		String str1 = new String("hello"); // String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1/*toString()*/);
		System.out.println(str2);
		// > String 클래스의 toString() 메소드의 경우
		//   실제 담겨있는 문자열을 반환하도록 "오버라이딩" 되어 있음
		
		System.out.println(str1.equals(str2));
		// > String 클래스의 equals() 메소드
		//   실제 담겨있는 문자열 비교를 하도록 "오버라이딩" 되어 있음
		
		// * equals() 메소드는 원레 "주소값 동등비교용" 메소드임!!
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// > String 클래스의 hashCode() 메소드의 경우
		//   주소값 기반이  아닌 문자열 기반으로 해시코드값을 만들어서
		//   반환해주도록 "오버라이딩" 되어있음
		
		// 정말 주소값에 대해서 알고싶다면?
		// System.indentityHashCode(참조변수명);
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str1));
		// > 실제 주소값의 해시코드를 알려줌
		
		
	}
	
	// 2. 문자열을 리터럴로 생성
	public void method2() {
		
		
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1 == str2); // true
		
		// > 문자열 객체 생성 시 "리터럴" 을 이용해서 생성한다면
		// 메모리의 Heap 영역의 "String pool (상수풀)" 공간
		// 에 문자열 내용물이 올라가게 됨
		// > String Pool 의 특징 : 동일한 내용의 문자열이 존재 불가
		
		System.out.println(str1);
		System.out.println(str2/*.toString() */);
		
		System.out.println(str1.equals(str2)); 
		// 위와 같지만 문자열이 같아서 true 위는 주소값이 같아서 true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}
	
	// 3. 불변클래스 특징
			public void method3() {
				String str= "hello";
				System.out.println(System.identityHashCode(str));
				
				str = "goodbye";
				System.out.println(System.identityHashCode(str));
				
				str+= "abc";
				// str = str + abc;
				System.out.println(System.identityHashCode(str));
				// 내용이 변하는 순간 주소를 옮겨주는거라서 주소값이 바뀐다.
				// 시간이 지나면 주소값이랑 연결이 끝난 hello/goodbye는 가비지 컬렉터가 지워준다.
				
				// * 총정리
				// 불변이라고 해서 수정이 아예 안되는게 아니라
				// 그 값이 담긴 기존의 자리에서 수정이 안되는 개념일 뿐!!
				// > 매번 새로운 주소값을 참조하게 됨
				// > 기존의 상수풀의 연결이 끊긴 문자열들은
				//   일정 시간이 지나면 가비지컬텍터가 알아서 정리해줌
				
			}
			
			
			// 4. 불변클래스 성질을 보완하는 클래스
			public void method4() {
				/*
				// * 기존의 String 객체
				// 내용이 수정될 때 마다 메모리 공간의 할당이 계속 일어나게 됨
				// > 성능 저하 이슈가 발생!!
				
				// * StringBuilder, StringBuffer 객체
				// 1) StringBuilder 사용법
				StringBuilder sb = new StringBuilder();
				System.out.println("sb : " +sb );
				System.out.println(sb.hashCode());
				
				// 문자열을 연이어주는 메소드
				// [ 표현법 ]
				// sb.append(연이을문자열);
				sb.append("Hello");
				System.out.println("sb : "+ sb);
				System.out.println(sb.hashCode());
				*/
				
				// 2) StringBuffer 사용법
				StringBuffer sb = new StringBuffer();
				System.out.println("sb : " + sb);
				System.out.println(sb.hashCode());
				
				// 문자열을 연이어주는 메소드 (append)
				sb.append("Goodbye"); // " " + "Goodbye"
				System.out.println("sb : " +sb);
				System.out.println(sb.hashCode());

				
				// > 기존의 그 공간에서 값 수정이 그대로 일어남
				//    (매번 새로운 곳을 할당하지 않음, 불변이 아님)
				
				// > 차이점
				// StringBuilder : 속도가 조금 더 빠름, 일을 동시에 처리 못함
				// StringBuffer : 속도가 조금 느림, 일을 동시에 처리할 수 있음
				/*
				String str = "";
				
				while(true) {
					str += "a";
					
				}*/
				/*
				StringBuilder str = new StringBuilder();
				while(true) {
					str.append("a");
				}
				*/
				
			}
			
			
}
