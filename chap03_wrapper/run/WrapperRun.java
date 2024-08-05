package com.kh.chap03_wrapper.run;

// Wrapper Ŭ����
public class WrapperRun {

	/*
	 * * Wrapper Ŭ����
	 * "�⺻ �ڷ���" �� "��ü ����" �� �������ִ� Ŭ������
	 * > �� �⺻�ڷ����� �´� Wrapper Ÿ���� ������ ������
	 * 
	 * [ ���� ]
	 * �⺻�ڷ���   <-->   WrapperŬ����  
	 * boolean          Boolean (���� �빮�ڶ� Ŭ���� Ÿ��)
	 * char             Character
	 * byte			    Byte
	 * short		    Short
	 * int 				Integer
	 * long				Float
	 * double			Double					
	 */
	
	public static void main(String[] args) {
		
		// �� Wrapper Ŭ������ �ʿ��Ѱ�?
		int num1 = 10;
		int num2 = 15;
		
		// num1 �� num2 �� ��ġ�մϱ�?
		// System.out.println(num1 == num2);
		// System.out.println(num1.equals(num2));
		// > �Ϲ� �⺻ �ڷ������� ���� �ڷ����� ������ �޼ҵ带 Ȱ���ϰ� ���� ��
		//	Wrapper Ŭ���� Ÿ������ ��ȯ�ؼ� ����� �� �ִ�.
		
		// �⺻ �ڷ��� --> Wrapper �ڷ���(Boxing)
		// 1. ��ü ���� ������ ���� �̿��ϴ� ��� (������ ȣ��)
		Integer i1 = new Integer(num1); // num1 --> i1
		Integer i2 = new Integer(num2); // num2 --> i2
		
		System.out.println(i1); // 10
		System.out.println(i2/*. toString() �ּҰ��� ��°� �ƴ϶� �ּҰ� ���� ���� �����*/); // 15
		
		System.out.println(i1 == i2); //false (�ּҰ���)
		System.out.println(i1.equals(i2)); // false
		
		System.out.println(i1.hashCode());// 10
		System.out.println(i2.hashCode());// 15
		// > ���빰 �������� �ؽ��ڵ� ����
		
		// ��Һ񱳸� �ϰ�ʹٸ�?
		// System.out.println(i1 < i2);
		System.out.println(i1.compareTo(i2)); // -1
		// > compareTo �޼ҵ� ���� Object Ŭ�������� �����Ǵ� �޼ҵ�
		//  �� ���� ���� �� �ִ� �޼ҵ�
		//  a.compareTo(b) : a�� b���� ũ�� 1, b �� ũ�� -1, ������ 0 ����
		
		// 2. ��ü�� �������� �ʰ� ��ٷ� �����ϴ� ��� (AutoBoxing)
		Integer i3 = num1; // 10
		Integer i4 = num2; // 15
		
		// > ���ǻ���
		//  AutoBoxing �� �ȵǴ� ��� ����!! (Ư�����̽�)
		Integer i5 = new Integer("123"); 
		// > ���ڿ��� Integer �� �ٲٰ� ���� ��
		
		// Wrapper �ڷ��� --> �⺻ �ڷ��� (UnBoxing)
		// 1. �ش� �� Wrapper Ŭ������ ���ǵ� xxxValue() �޼ҵ带 Ȱ���ϴ� ���
		int num3 = i3.intValue(); // i3 --> num3
		int num4 = i4.intValue(); // i4 --> num4
		
		//System.out.println(num3.equals(num4));
		System.out.println(num3 == num4);
		
		// 2. �޼ҵ� ������ �̿����� �ʰ� ��ٷ� �����ϴ� ��� (AutoUnBoxing)
		int num5 = i1;
		int num6 = i2;
		
		System.out.println("------------------");
		
		// �⺻ �ڷ��� <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // "1015.3"
		
		// 1. String --> �⺻ �ڷ���
		// > "�Ľ��Ѵ�." (parsing)
		// [ ǥ���� ] 
		// �ش�WrapperŬ������.parseXxx(��ȯ�ҹ��ڿ�);
		int i = Integer.parseInt(str1); // "10" --> 10
		double d = Double.parseDouble(str2); // "15.3" --> 15.3
		
		
		// �Ľ� �� ���ǻ���
		// Integer.parseInt("12.3");
		// ������ �ٲܰԿ� �ߴµ� ���ڿ��� ���̴� ���� 12.3 double�̶� ������
		//Float.parseFloat("abc~"); // ���� ���� ����
		// > ���Ŀ� ���� �ʴ� ���ڿ��� �������� ���
		//   NumberFormatException ������ �߻���!!
		
		
		System.out.println(i + d); // 25.3
		
		// 2. �⺻ �ڷ��� --> String
		// 2_1. String Ŭ������ ���ǵ� valueOf �޼ҵ带 Ȱ���ϴ� ���
		// [ ǥ���� ]
		// String.valueOf(��ȯ�ұ⺻�ڷ�����) : String
		String strI = String.valueOf(i); // 10 --> "10"
		String strD = String.valueOf(d); // 15.3 --> "15.3"
		
		// 2_2. "" (�� ���ڿ�) �� �����ϴ� ���
		String result = 10 + "";
		
	}

}
