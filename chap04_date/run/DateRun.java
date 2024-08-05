package com.kh.chap04_date.run;


import java.text.SimpleDateFormat;
import java.util.Date;

// ��¥�� ���õ� Ŭ������
public class DateRun {
	
	/*
	 * * Date Ŭ����
	 * ��¥�� �ð��� ���� ������ ���� �� �ִ� Ŭ����
	 * java.util ��Ű�� �ȿ� ���ǵǾ�����
	 * > �ڹ� ���� ��â�⿡ ���ϰ� ������� �ټ� �ϼ����� �������� Ŭ����
	 * 
	 * * SimpleDateFormat ũ����
	 * Date ��ü�� ������ �� �Ը��� �´� ���ڿ� �������� ��Ȱ�� �� ���
	 * java.text ��Ű�� �ȿ� ���ǵǾ����� 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// �⺻�����ڸ� �̿��ؼ� Date ��ü ����
		Date today = new Date();
		System.out.println("�⺻������ : " + today/*.toString()*/);
		// > ���� ��¥ �� �ð��� ������ ��
		
		// ���� ���ϴ� ��¥ (2020�� 6�� 19��)�� �����ϰ� �ʹٸ�?
		// ���1) �Ű����� �����ڸ� �̿��ϴ� ���
		//Date date1 = new Date(2020, 6,19);
		//System.out.println("�Ű����������� : " + date1);
		// > deprecated : �������� ����!!
		// > ���������� ���� ������ �⵵ + 1900
		//					  ���� + 1
		// �� ����� �Ǽ� ��¥�� ���õǱ� ����!!
		
		Date date1 = new Date(2020 - 1900, 6-1,19);
		System.out.println("�Ű�����������" +date1);
		// > �⵵ - 1900, �� - 1 �� ���� �Ѱܾ� ����� ���õ�!!
		
		// ���2) �⺻�����ڷ� ��ü ���� �� setter �޼ҵ带 �̿��ϴ� ���
		Date date2= new Date(); // ���� ��¥ �� �ð�
		date2.setYear(2020);
		date2.setMonth(6);
		date2.setDate(19);
		date2.setHours(19);
		date2.setMinutes(15);
		date2.setSeconds(30);
		System.out.println("setter�޼ҵ� : " + date2);
		
		System.out.println("---------------");
		
		// �� �Ը������ ���� (����) �� ������ ���ڿ��� �ް��� �� ��
		// java.text.SimpleDateFormat ��ü �̿�
		
		// 1. ������ �����ϸ鼭 SimpleDateFormat ��ü����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E����");
		
		/*
		 * * SimpleDateFormat ���� 
		 * �⵵ : yyyy
		 * �� : MM
		 * �� : dd
		 * �� : hh
		 * �� : mm
		 * �� : ss
		 * ���� : E
		 * 
		 */
		
		// 2.sdf ��ü���� �����ϴ� format �޼ҵ� ȣ��
		// [ ǥ���� ]
		// sdf.format(Date��ü) : String
		// > �ش� ��¥ ������ ������ ������ ���ڿ��� ��ȯ��
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
	}

}
