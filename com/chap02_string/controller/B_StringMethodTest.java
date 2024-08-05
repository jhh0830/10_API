package com.kh.com.chap02_string.controller;

import java.util.Scanner;

// 문자열과 관련된 유용한 메소드들
public class B_StringMethodTest {
	public void method1() {
		
		// 메소드명(매개변수) : 반환형
		
		String str1 = "Hell World";
		
		// 1. 문자열.charAt(int index) : char
		// > 문자열에서 전달받은 index 위치의 문자하나만을 뽑아서 리턴
		
		char ch = str1.charAt(3); // '1'
		System.out.println("ch : " + ch);
		
		// 2. 문자열equals(String str) : boolean
		// > 문자열과 전달받은 str 이 내용물이 일치하는지 동등비교 후 결과 리턴
		//   (원래 Object 에 주소값 동등비교용으로 만들어졌는데,
		//    내용물 동등비교 용도로 오버라이딩 된 꼴을 쓰고 있음)
		System.out.println("equals : " + str1.equals("Hello World"));
		
		// 3. 문자열.length() : int 
		// > 문자열의 길이 리턴
		System.out.println("str1 의 길이 : " + str1.length());
		
		// 4. 문자열.concat(String str) : String
		// > 문자열과 전달된 또 다른 문자열을 하나로 합쳐서 리턴
		String str2 = str1.concat("!!!");
		// String str2 = str1 + "!!!";
		System.out.println("str2 : " + str2);
	
		// 5_1. 문자열.substring(int beginIndex) : String
		// > 문자열의 beginIndex 위치에서 부터 끝까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(6));
		
		// 5_2. 문자열.substring(int beginIndex, int endIndex) : String
		// > 문자열의 beginIndex 위치에서 부터 endIndex - 1 까지의
		//   문자열을 추출해서 리턴 (endIndex는 포함 x)
		System.out.println(str1.substring(0, 6));
		// > 오버로딩된 메소드임
		
		// 6. 문자열.replace(char old, char new) : String
		// > 문자열에서의 old 문자를 new 문자로 변환한 문자열을 리턴
		String str3= str1.replace('l','c');
		System.out.println("str3 : " + str3);
		
		// 예)
		String personId = "851212-1234567"; // 주민번호
		System.out.println(personId.substring(0, 8).concat("******"));
		
		// 7. 문자열.trim() : String
		// > 문자열의 앞, 뒤 공백을 제거한 문자열을 리턴
		String str4 = "        JA        VA     ";
		System.out.println("trim : " + str4.trim());
		
		// str4 에서 모든 공백을 제거하고 싶다면?
		// str4.replace("","");
		// > trim은 앞뒤 공백만 지워주기 떄문에,
		//   문자열 전체적으로 공백을 다 지우고 싶다면
		//   replace 메소드를 활용할 수 있다. (오버로딩)
		
		
		// 8. 문자열.contains(String str) : boolean
		// > 문자열로부터 str 이 포함되어있는지 검사 후 리턴
		System.out.println("contains : " + str4.contains("ja")); 
		//대소문자 구분함 "ja" 는 false "JA"는 true다.
		
		// 9_1. 문자열.toUpperCase() : String
		// > 문자열을 모두 다 대문자로 변경 후 문자열 리턴
		System.out.println("upper : " + str1.toUpperCase());
		
		// 9_2. 문자열.toLowerCase() : String
		// > 문자열을 모두 다 소문자로 변경 후 문자열 리턴
		System.out.println("lower : " +str1.toLowerCase());
		
		// 둘다 영문만 해당 
		
		// 예) 
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시겠습니까? (y/n)");
		//char answer = sc.nextLine().charAt(0); //'Y' 'y' 'N' 'n'
		// if(answer == 'Y' || answer == 'y')
		
		
		char anser = sc.nextLine().toUpperCase().charAt(0); // 'Y' / 'N'
		// > 메소드 체이닝 : 메소드를 연이서서 계속 호출하는 개념
		//  항상 반환타입 및 호출 순서 신경쓰기!!
		
		if(anser == 'Y') {
			System.out.println("종료합니다");
		} else {
			System.out.println("종료하지 않습니다.");
		}
		*/
		
		// 문자열 --> char[]
		/*
		char[] arr = new char[str1.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str1.charAt(i);
		}
			
			*/
		
		// 10. 문자열.toCharArray() : char[]
		// > 문자열의 각 문자들을 char[] 배열에 옮겨 담은 후 그 배열을 리턴
		char[] arr = str1.toCharArray();
		
		System.out.println(arr[0]); // 'H'
		
		// char[] --> 문자열
		
		char[] arr2 = {'a','p','p','l','e'};
		/*
		String result = "";
		for(int i = 0; i<arr2.length; i++) {
			result += arr2[i];
		}
		*/
		
		// 11. static valueOF(char[] data) : String
		// > 전달된 char[] 에 담긴 문자들을 하나의 문자열로 합쳐서 리턴
		String result = String.valueOf(arr2);
		System.out.println(result);
		
		
	}
	
	//숙제
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String chat = sc.nextLine();
		String[] filter = {"신발끈","개나리","수박씨","호루라기","시베리아","십장생","조카","주옥","쌍쌍바","십자수"};
		
		for(int i = 0; i< filter.length;i++) {
			// 해당의 욕설의 길이를 알아내기
			int size = filter[i].length();
			// 욕설의 길이만큼 * 찍기
			/*
			String str="";
			for(int j=0; j< size; j++) {
				str +="*";
			}*/
			// 욕설의 길이 -1 만큼 * 찍기
			String str = filter[i].charAt(0) + ""; 
			// String str == filter.charAt는 같은게 아니다 고로 빈문자열로 문자열로 만들어준다.
			for(int j=0; j< size -1; j++) {
				str +="*";
			}
			
			
			chat = chat.replace(filter[i], str);
		}
		
		System.out.println("결과 : " + chat);
		
		
		/*
		String fk = sc.nextLine();
		
		
		String[] arr = {"신발끈","개나리","수박씨","호루라기","시베리아","십장생","조카","주옥","쌍쌍바","십자수"};
		
		char[] str = fk.toCharArray();
		// 욕설 필터링 프로그램
		// 사용자로부터 채팅 메시지를 한줄 입력 받는다
		
		// 그 메시지 내용 중 욕설이 있다면 필터링한 결과를 출력하세요
		// * 필터링 해야하는 욕설 목록들 (String 배열로 담아둘것)
		// "신발끈", "개나리", "수박씨","호루라기","시베리아, "십장생","조카","주옥","쌍쌍바","십자수"
		
		// 실행예시)
		// 입력 : 이런 신발끈같은 개나리 호루라기야!!!
		// 결과 : 이런 xxx같은 xxx xxxx야!!!
		
		// + 난이도 up
		// 결과 : 이런 신**같은 개** 호***야!!
		
		for(String a : arr) {
			if(fk.contains(a)) {
				for(int j = 0; j < a.length(); j++) {
					fk = fk.replace(a.charAt(j),'*');
				}
			}
		}
		
		
		System.out.println("결과 : " + fk);
		
		*/
		
		
	}
	
		
	
}
