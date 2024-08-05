package com.kh.chap01_math.run;



/*
 * * API (Application Programming Interface)
 * ���߿� ���� ���Ǵ� Ŭ���� �� �������̽��� ������ "����" �� ��Ÿ��
 * (������ ����)
 * 
 * * ���̺긮��
 * ���߿� ���� ���Ǵ� Ŭ���� �� �������̽� �ڵ� ����
 * 
 * * �ڹ� �⺻ API
 * https://docs.oracle.com/en/java/javase/11/docs/api/index.html
 * 
 * * �����ð��� �ٷﺼ ����
 * Math Ŭ����
 * String Ŭ����
 * Wrapper Ŭ����
 * Date Ŭ����
 */
// import java.lang.*;
// >���� ����, ������ ������ �׻� �̹� import �� �Ǿ��ִ�.

public class MathRun {

	public static void main(String[] args) {
		// Math (���а� ����) Ŭ���� ���� �����ϰ� �ִ� ������ ��ɵ�
		
		// * Math Ŭ����
		// ���а� ���õ� �ʵ��, �޼ҵ���� ���ǵǾ��ִ� Ŭ����
		// ��� �ʵ�� �޼ҵ���� static ������!! ("�̱��� ����")
		// ��ü���� �� �����ؼ� �� �ʿ䰡 ����
		// java.lang ��Ű�� ���� ������
		
		// �ʵ�
		// 1. ���� : ������ (����ʵ�� ���ǵ�)
		System.out.println("���� : " + Math.PI);
		
		// �޼ҵ�
		// Math m = new Math();
		// > ��� �޼ҵ���� static �޼ҵ��̱� 
		// ������ ���ʿ� ��ü ���� ��ü�� ���Ƶ� �� (private)
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		// 1. Math.ceil(double) : double 
		// > �ø� ���� ó��
		double num1 = 4.349;
		System.out.println("�ø� : "+ Math.ceil(num1)); // 5.0 < -- double���� ��ȯ�ϴ°Ŷ� �Ҽ����� �츲
		
		// 2. Math.round(double) : long 
		// > �ݿø� ���� ó��
		System.out.println("�ݿø� : " + Math.round(num1)); // 4 <-- long���� ��ȯ�ȰŶ� �Ʒ� �Ҽ����� ����
		
		// 3. Math.floor(double) : double
		// > ���� ���� ó��
		System.out.println("���� : " + Math.floor(num1)); // 4.0 < -- double���� ��ȯ�ϴ°Ŷ� �Ҽ����� �츲
		
		// 4. Math.abs(int/double/long/float) : int/double/long/float
		// > ���밪�� ���ϴ� ���� ó��
		int num2 = -10;
		System.out.println("���밪 : " + Math.abs(num2));
		// > �����ε��� �����ؼ� ���� �޼ҵ�
		
		// 5. Math.min(int, int) : int 
		// > �ּҰ��� ���ϴ� ���� ó��
		System.out.println("�ּҰ� : " + Math.min(5, 10));
		
		// 6. Math.max(int, int) : int
		// > �ִ밪�� ���ϴ� ���� ó��
		System.out.println("�ִ밪 : " + Math.max(5, 10));
		
		
		// 7. Math.sqrt(double) : double
		// > ������ (��Ʈ) �� ���ϴ� ���� ó��
		System.out.println("4�� ������ : " + Math.sqrt(4));
		
		// 8. Math.pow(double, double) : double
		// > ���� ���� ó��
		System.out.println("2�� 10 ���� : " + Math.pow(2, 10));
		
		
	}

}
