package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * �񱳿�����
		 * - <, >, <=, >= , ==, !=
		 * - ���ڿ��� : equals()
		 */
		
		int x = 10;
		int y = 15;
		boolean b = x < y; //�񱳿����� �������� boolean�̴�.
		System.out.println(b);
		b = x <= y - 15; // ������� �� �񱳿��� ����.
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2; //���ڿ��� ������ �ƴ� �ּҸ� ���� ��.
		System.out.println(b);
		
		//String�� ������ ���ϱ� ���ؼ��� equals()�޼��带 ����Ѵ�.
		b = str1.equals(str2);
		System.out.println(b);
		b = !str1.equals(str2);
		System.out.println(b);
		
		//������ ������� �ڵ�� �ۼ����ּ���.
		// 1. x�� y���� ũ��.	
		boolean c = x > y;
		System.out.println(c);
		// 2. x + 5�� y�� ����.
		c = y == x + 5;
		System.out.println(c);
		// 3. y�� Ȧ���̴�.
		b = y % 2 == 1;
		System.out.println(b);
		// 4. "�⺻��"��"������"�� �ٸ���.
		b = !"�⺻��".equals("������");
		System.out.println(b);
	}

}
