package com.kh.com.chap02_string.controller;

import java.util.Scanner;

// ���ڿ��� ���õ� ������ �޼ҵ��
public class B_StringMethodTest {
	public void method1() {
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		
		String str1 = "Hell World";
		
		// 1. ���ڿ�.charAt(int index) : char
		// > ���ڿ����� ���޹��� index ��ġ�� �����ϳ����� �̾Ƽ� ����
		
		char ch = str1.charAt(3); // '1'
		System.out.println("ch : " + ch);
		
		// 2. ���ڿ�equals(String str) : boolean
		// > ���ڿ��� ���޹��� str �� ���빰�� ��ġ�ϴ��� ����� �� ��� ����
		//   (���� Object �� �ּҰ� ����񱳿����� ��������µ�,
		//    ���빰 ����� �뵵�� �������̵� �� ���� ���� ����)
		System.out.println("equals : " + str1.equals("Hello World"));
		
		// 3. ���ڿ�.length() : int 
		// > ���ڿ��� ���� ����
		System.out.println("str1 �� ���� : " + str1.length());
		
		// 4. ���ڿ�.concat(String str) : String
		// > ���ڿ��� ���޵� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ����
		String str2 = str1.concat("!!!");
		// String str2 = str1 + "!!!";
		System.out.println("str2 : " + str2);
	
		// 5_1. ���ڿ�.substring(int beginIndex) : String
		// > ���ڿ��� beginIndex ��ġ���� ���� �������� ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(6));
		
		// 5_2. ���ڿ�.substring(int beginIndex, int endIndex) : String
		// > ���ڿ��� beginIndex ��ġ���� ���� endIndex - 1 ������
		//   ���ڿ��� �����ؼ� ���� (endIndex�� ���� x)
		System.out.println(str1.substring(0, 6));
		// > �����ε��� �޼ҵ���
		
		// 6. ���ڿ�.replace(char old, char new) : String
		// > ���ڿ������� old ���ڸ� new ���ڷ� ��ȯ�� ���ڿ��� ����
		String str3= str1.replace('l','c');
		System.out.println("str3 : " + str3);
		
		// ��)
		String personId = "851212-1234567"; // �ֹι�ȣ
		System.out.println(personId.substring(0, 8).concat("******"));
		
		// 7. ���ڿ�.trim() : String
		// > ���ڿ��� ��, �� ������ ������ ���ڿ��� ����
		String str4 = "        JA        VA     ";
		System.out.println("trim : " + str4.trim());
		
		// str4 ���� ��� ������ �����ϰ� �ʹٸ�?
		// str4.replace("","");
		// > trim�� �յ� ���鸸 �����ֱ� ������,
		//   ���ڿ� ��ü������ ������ �� ����� �ʹٸ�
		//   replace �޼ҵ带 Ȱ���� �� �ִ�. (�����ε�)
		
		
		// 8. ���ڿ�.contains(String str) : boolean
		// > ���ڿ��κ��� str �� ���ԵǾ��ִ��� �˻� �� ����
		System.out.println("contains : " + str4.contains("ja")); 
		//��ҹ��� ������ "ja" �� false "JA"�� true��.
		
		// 9_1. ���ڿ�.toUpperCase() : String
		// > ���ڿ��� ��� �� �빮�ڷ� ���� �� ���ڿ� ����
		System.out.println("upper : " + str1.toUpperCase());
		
		// 9_2. ���ڿ�.toLowerCase() : String
		// > ���ڿ��� ��� �� �ҹ��ڷ� ���� �� ���ڿ� ����
		System.out.println("lower : " +str1.toLowerCase());
		
		// �Ѵ� ������ �ش� 
		
		// ��) 
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻðڽ��ϱ�? (y/n)");
		//char answer = sc.nextLine().charAt(0); //'Y' 'y' 'N' 'n'
		// if(answer == 'Y' || answer == 'y')
		
		
		char anser = sc.nextLine().toUpperCase().charAt(0); // 'Y' / 'N'
		// > �޼ҵ� ü�̴� : �޼ҵ带 ���̼��� ��� ȣ���ϴ� ����
		//  �׻� ��ȯŸ�� �� ȣ�� ���� �Ű澲��!!
		
		if(anser == 'Y') {
			System.out.println("�����մϴ�");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		*/
		
		// ���ڿ� --> char[]
		/*
		char[] arr = new char[str1.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str1.charAt(i);
		}
			
			*/
		
		// 10. ���ڿ�.toCharArray() : char[]
		// > ���ڿ��� �� ���ڵ��� char[] �迭�� �Ű� ���� �� �� �迭�� ����
		char[] arr = str1.toCharArray();
		
		System.out.println(arr[0]); // 'H'
		
		// char[] --> ���ڿ�
		
		char[] arr2 = {'a','p','p','l','e'};
		/*
		String result = "";
		for(int i = 0; i<arr2.length; i++) {
			result += arr2[i];
		}
		*/
		
		// 11. static valueOF(char[] data) : String
		// > ���޵� char[] �� ��� ���ڵ��� �ϳ��� ���ڿ��� ���ļ� ����
		String result = String.valueOf(arr2);
		System.out.println(result);
		
		
	}
	
	//����
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String chat = sc.nextLine();
		String[] filter = {"�Ź߲�","������","���ھ�","ȣ����","�ú�����","�����","��ī","�ֿ�","�ֹֽ�","���ڼ�"};
		
		for(int i = 0; i< filter.length;i++) {
			// �ش��� �弳�� ���̸� �˾Ƴ���
			int size = filter[i].length();
			// �弳�� ���̸�ŭ * ���
			/*
			String str="";
			for(int j=0; j< size; j++) {
				str +="*";
			}*/
			// �弳�� ���� -1 ��ŭ * ���
			String str = filter[i].charAt(0) + ""; 
			// String str == filter.charAt�� ������ �ƴϴ� ��� ���ڿ��� ���ڿ��� ������ش�.
			for(int j=0; j< size -1; j++) {
				str +="*";
			}
			
			
			chat = chat.replace(filter[i], str);
		}
		
		System.out.println("��� : " + chat);
		
		
		/*
		String fk = sc.nextLine();
		
		
		String[] arr = {"�Ź߲�","������","���ھ�","ȣ����","�ú�����","�����","��ī","�ֿ�","�ֹֽ�","���ڼ�"};
		
		char[] str = fk.toCharArray();
		// �弳 ���͸� ���α׷�
		// ����ڷκ��� ä�� �޽����� ���� �Է� �޴´�
		
		// �� �޽��� ���� �� �弳�� �ִٸ� ���͸��� ����� ����ϼ���
		// * ���͸� �ؾ��ϴ� �弳 ��ϵ� (String �迭�� ��ƵѰ�)
		// "�Ź߲�", "������", "���ھ�","ȣ����","�ú�����, "�����","��ī","�ֿ�","�ֹֽ�","���ڼ�"
		
		// ���࿹��)
		// �Է� : �̷� �Ź߲����� ������ ȣ�����!!!
		// ��� : �̷� xxx���� xxx xxxx��!!!
		
		// + ���̵� up
		// ��� : �̷� ��**���� ��** ȣ***��!!
		
		for(String a : arr) {
			if(fk.contains(a)) {
				for(int j = 0; j < a.length(); j++) {
					fk = fk.replace(a.charAt(j),'*');
				}
			}
		}
		
		
		System.out.println("��� : " + fk);
		
		*/
		
		
	}
	
		
	
}
