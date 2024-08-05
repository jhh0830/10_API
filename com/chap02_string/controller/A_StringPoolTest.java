package com.kh.com.chap02_string.controller;

public class A_StringPoolTest {
	
	/*
	 * * String Ŭ����
	 * �ڹٿ��� ���ڿ��� �ٷ�� �뵵�� Ŭ����
	 * String name = "ȫ�浿"
	 * ���ڿ� ���ͷ��� ��ٷ� �����ϰų�, new ������ ����
	 * ��ü ������ �����ϴ�.
	 * java.lang ����Ű ���� ���ǵǾ�����
	 * 
	 *  > String �� "�Һ�Ŭ����" (������ �ʴ� Ŭ����) ��.
	 *    ���� �����ϴ� ���� ������ ���� ����ִ� �������� �������� ����
	 * 
	 */
	// 1. �����ڸ� ���� ���ڿ��� ���
	public void method1() {
		
		String str1 = new String("hello"); // String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1/*toString()*/);
		System.out.println(str2);
		// > String Ŭ������ toString() �޼ҵ��� ���
		//   ���� ����ִ� ���ڿ��� ��ȯ�ϵ��� "�������̵�" �Ǿ� ����
		
		System.out.println(str1.equals(str2));
		// > String Ŭ������ equals() �޼ҵ�
		//   ���� ����ִ� ���ڿ� �񱳸� �ϵ��� "�������̵�" �Ǿ� ����
		
		// * equals() �޼ҵ�� ���� "�ּҰ� ����񱳿�" �޼ҵ���!!
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// > String Ŭ������ hashCode() �޼ҵ��� ���
		//   �ּҰ� �����  �ƴ� ���ڿ� ������� �ؽ��ڵ尪�� ����
		//   ��ȯ���ֵ��� "�������̵�" �Ǿ�����
		
		// ���� �ּҰ��� ���ؼ� �˰�ʹٸ�?
		// System.indentityHashCode(����������);
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str1));
		// > ���� �ּҰ��� �ؽ��ڵ带 �˷���
		
		
	}
	
	// 2. ���ڿ��� ���ͷ��� ����
	public void method2() {
		
		
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1 == str2); // true
		
		// > ���ڿ� ��ü ���� �� "���ͷ�" �� �̿��ؼ� �����Ѵٸ�
		// �޸��� Heap ������ "String pool (���Ǯ)" ����
		// �� ���ڿ� ���빰�� �ö󰡰� ��
		// > String Pool �� Ư¡ : ������ ������ ���ڿ��� ���� �Ұ�
		
		System.out.println(str1);
		System.out.println(str2/*.toString() */);
		
		System.out.println(str1.equals(str2)); 
		// ���� ������ ���ڿ��� ���Ƽ� true ���� �ּҰ��� ���Ƽ� true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}
	
	// 3. �Һ�Ŭ���� Ư¡
			public void method3() {
				String str= "hello";
				System.out.println(System.identityHashCode(str));
				
				str = "goodbye";
				System.out.println(System.identityHashCode(str));
				
				str+= "abc";
				// str = str + abc;
				System.out.println(System.identityHashCode(str));
				// ������ ���ϴ� ���� �ּҸ� �Ű��ִ°Ŷ� �ּҰ��� �ٲ��.
				// �ð��� ������ �ּҰ��̶� ������ ���� hello/goodbye�� ������ �÷��Ͱ� �����ش�.
				
				// * ������
				// �Һ��̶�� �ؼ� ������ �ƿ� �ȵǴ°� �ƴ϶�
				// �� ���� ��� ������ �ڸ����� ������ �ȵǴ� ������ ��!!
				// > �Ź� ���ο� �ּҰ��� �����ϰ� ��
				// > ������ ���Ǯ�� ������ ���� ���ڿ�����
				//   ���� �ð��� ������ �����������Ͱ� �˾Ƽ� ��������
				
			}
			
			
			// 4. �Һ�Ŭ���� ������ �����ϴ� Ŭ����
			public void method4() {
				/*
				// * ������ String ��ü
				// ������ ������ �� ���� �޸� ������ �Ҵ��� ��� �Ͼ�� ��
				// > ���� ���� �̽��� �߻�!!
				
				// * StringBuilder, StringBuffer ��ü
				// 1) StringBuilder ����
				StringBuilder sb = new StringBuilder();
				System.out.println("sb : " +sb );
				System.out.println(sb.hashCode());
				
				// ���ڿ��� ���̾��ִ� �޼ҵ�
				// [ ǥ���� ]
				// sb.append(���������ڿ�);
				sb.append("Hello");
				System.out.println("sb : "+ sb);
				System.out.println(sb.hashCode());
				*/
				
				// 2) StringBuffer ����
				StringBuffer sb = new StringBuffer();
				System.out.println("sb : " + sb);
				System.out.println(sb.hashCode());
				
				// ���ڿ��� ���̾��ִ� �޼ҵ� (append)
				sb.append("Goodbye"); // " " + "Goodbye"
				System.out.println("sb : " +sb);
				System.out.println(sb.hashCode());

				
				// > ������ �� �������� �� ������ �״�� �Ͼ
				//    (�Ź� ���ο� ���� �Ҵ����� ����, �Һ��� �ƴ�)
				
				// > ������
				// StringBuilder : �ӵ��� ���� �� ����, ���� ���ÿ� ó�� ����
				// StringBuffer : �ӵ��� ���� ����, ���� ���ÿ� ó���� �� ����
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
