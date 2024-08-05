package com.kh.com.chap02_string.controller;

import java.util.StringTokenizer;

// ���ڿ��� �и��ϴ� ���
public class C_SringTokenizerTest {

	public void method1() {
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
		// ���1)
		// ���ڿ�, split(String ������) : String[]
		String[] arr = str.split(",");
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		// �迭�� ��� for���� ������ ���̵� �� �� �ִ�.
		// > ���� for��, foreach��
		
		// [ ǥ���� ]
		// for(�������� : �迭��)
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		
		// ���2)
		// java.util ��Ű���� StringTokenizer Ŭ������ �̿��ϴ� ���
		// [ ǥ���� ]
		// StringTokenizer stn = new StringTokenizer(�и��ҹ��ڿ� , ������);
		StringTokenizer stn = new StringTokenizer(str,",");
		

		System.out.println("���� �и��� ���ڿ��� ���� : "+ stn.countTokens());
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
		// > NoSuchElementException ���� �߻�
		// ���� �����ִ� stn ��ū ������ ������ �������
		// ���̻� ���� �����Ͱ� ���µ� �� �̴�? ��� �˷��ִ°�
		*/
		
		// �ݺ����� Ȱ���غ���
		/*
		for(int i = 0; i < stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// > stn.countTokens() �޼ҵ��
		// ���� ���� �����ִ� ��ū�� ������ ���� ��ȯ����
		
		
		// �ذ���1. �������ִ� ������ Ȱ���ϱ�
		/*
		int count = stn.countTokens(); // 6 
		
		for(int i =0; i< count; i++) {
			System.out.println(stn.countTokens());
		}*/
		
		// �ذ���2.
		// stn ������ �����ִ� ����� ���� ���ȿ��� �ݺ��� ������ ���
		while(stn.hasMoreTokens()) {
			// > stn.hasMoreTokens() : boolean
			//   ��ū�� �����ִٸ� true, �ƴϸ� false ��ȯ
			
			System.out.println(stn.nextToken());
		}
		
		
	}
}
