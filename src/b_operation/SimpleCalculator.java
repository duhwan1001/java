package b_operation;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// �ΰ��� ���ڿ� �����ڸ� �Է¹޾� �������� �˷��ִ� ���α׷��� ������ּ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ����>");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("������>");
		String op = sc.nextLine();
		System.out.println("�ι�° ����>");
		int y = Integer.parseInt(sc.nextLine());
		
		int result = op.equals("+") ? x + y
				: op.equals("-") ? x - y
				: op.equals("*") ? x - y
				: op.equals("/") ? x - y
				: x % y;
		System.out.println(x + " " + op + " " + y + " = " + result);
	}

}
