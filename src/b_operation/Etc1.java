package b_operation;
import java.util.Scanner;

public class Etc1 {

	public static void main(String[] args) {
		/*
		 * ��Ʈ ������ |, &, ^, ~, <<, >> ��Ʈ ������ �����Ѵ�.
		 * 
		 * ��Ÿ ������
		 * 
		 * - .(���� ������) : Ư�� ���� ���� ���� �ִ� ����� ��Ī�� �� ����Ѵ�.- 
		 * -   (type) : ����ȯ
		 * - ?:(���׿�����): ���ǽ� ? ���ǽ��� ���� ��� ������ ����: ���ǽ��� ������ ��� ������ ����
		 */
		// 1byte : 01010101

		System.out.println(10 | 15); // | : �Ѵ� 0�� ��� �׿� 1
		// 10 : 00001010
		// 15 : 00001111
		//
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y; //int result = x;
		System.out.println(result);
		
//		//�ֹε�Ϲ�ȣ ���ڸ��� ù��° ���ڰ� 1�̸� ���� 2�� ����
		int regNo = 3;
		String gender = regNo == 1 ? "����" : "����";
		System.out.println("����� ������" + gender + "�Դϴ�.");
		
		gender = regNo == 1 ? "����" : (regNo == 2 ? "����" : "Ȯ�κҰ�");
		System.out.println("����� ������" + gender + "�Դϴ�.");
//		
//		// 2���� ���ڸ� �Է��ϰ�, �� �� �� ū ���ڸ� ������ּ���.
		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° ����>");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("�ι�° ����>");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(num1 < num2 ? num2 : num1);
		
		//���ڸ� �Է¹ް�, �� ���ڰ� 1�̳� 3�̸� ���ڸ�, 2�� 4�� ���ڸ� ������ּ���.
		//�� ���� ���ڸ� �Է��ϸ� Ȯ�κҰ��� ����� �ּ���.
		System.out.println("����>");
		int num1 = Integer.parseInt(sc.nextLine());
		
		gender = num1 == 1 || num1 == 3 ? "����"
				:(num1 == 2) || num1 == 4 ? "����":"Ȯ�κҰ�";
		System.out.println(gender);			
	}

}