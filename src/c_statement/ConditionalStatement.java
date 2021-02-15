package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * ���ǹ�
		 * - if��
		 * - switch ��
		 * 
		 * if��
		 * - if(���ǽ�) {} : ���ǽ��� ����� true�̸� ������ ������ �����Ѵ�.
		 * - else if(���ǽ�){} : �ټ��� ������ �ʿ��� �� if �ڿ� �߰��Ѵ�.
		 * - else{} : ����� true�� ���ǽ��� �ϳ��� ���� ��츦 ���� �߰��Ѵ�.
		 */

		int a = 1;
		
		if (a == 1){
			System.out.println("���ǽ��� �������� true�̸� ����ȴ�.");
		}
		
		if (a == 0){
			System.out.println("���ǽ��� �������� false�̸� ������� �ʴ´�.");
		}
		
		if (a == 1){
			System.out.println("a�� 1�� ��쿡 �ϰ���� ��");
		} else if(a == 2){ // �Ǵ� (���ǹ�)
			System.out.println("a�� 2�� ��쿡 �ϰ���� ��");
		} else if(a == 3){
			System.out.println("a�� 3�� ��쿡 �ϰ���� ��");
		} else { // �� �ƴ϶��
			System.out.println("�̿��� ��쿡 �ϰ���� ��");
		}
		
		//������ �ѹ������� ����ϱ� ���ؼ��� �ݵ�� else if�� ����ؾ� �Ѵ�.
		if(a < 10){
			System.out.println("a�� 10���� �۴�.");
		} else if(a < 20){
			System.out.println("a�� 20���� �۴�.");
		}
		
		//���������� 60�� �̻��̸� �հ� �׷��� ������ ���հ�
		int score = 50;
		
		if (60 <= score){
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		
		//������ ����� �ο��ϴ� ���α׷��� �����ô�.
		score = 70;
		String grade = null;
		
		if (90 <= score && score <= 100){
			grade = "A";
		} else if (80 <= score && score <= 90){
			grade = "B";
		} else if (70 <= score){
			grade = "C";
		} else if (60 <= score){
			grade = "D";
		} else if (50 <= score){
			grade = "E";
		} 
		System.out.println(score + "���� �ش��ϴ� �����" + grade + "�Դϴ�.");
		
		score = 73;
		grade = null;
		
		if (90 <= score) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (70 <= score) {
			grade = "C";
			if (67 <= score) {
				grade += "+";
			} else if (63 <= score) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "D";
			if (57 <= score) {
				grade += "+";
			} else if (53 <= score) {
				grade += "-";
			}
		} else if (50 <= score) {
			grade = "E";
			if (47 <= score) {
				grade += "+";
			} else if (43 <= score) {
				grade += "-";
			} else {
				grade = "F";
			}
		}
		System.out.println(score + "���� �ش��ϴ� �����" + grade + "�Դϴ�.");
		
		// JAVA �ڵ����� ��� = Ctrl + Shift + F
		
		/*
		 * switch ��
		 * - switch(int/String){case 1: break;}
		 * - ���ǽ��� ����� ������ ���ڿ���(JDK1.7���� ���ڿ� ���) ����Ѵ�.
		 * - ���ǽİ� ��ġ�ϴ� case�� ������ ������ �����Ѵ�.
		 */
				
		
		// ���ǽ��� int �� ���
		a = 2;
		switch(a){
		case 1:
			System.out.println("a�� 1�� ��쿡 �ϰ���� ��");
			break;
		case 2:
			System.out.println("a�� 2�� ��쿡 �ϰ���� ��");
			break;
		default:
			System.out.println("�̿��� ��� �ϰ���� ��");
		}
		
//		//���ǽ��� String �� ���
//		String b = "a";
//		switch(b){
//		case "a":
//			System.out.println("b�� \"a\"�� ��쿡 �ϰ���� ��");
//			break;
//		case "b":
//			System.out.println("b�� \"b\"�� ��쿡 �ϰ���� ��");
//			break;
//		default:
//			System.out.println("�̿��� ��쿡 �ϰ���� ��");
//		}
		
		//�־��� ���� �ش��ϴ� ������ ����غ��ô�.
		int month = 1;
		String season = null;
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
		case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		}
		System.out.println(month + "����" + season + "�Դϴ�.");
		
		score = 100;
		grade = null;
		switch (score / 10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "�� �ش��ϴ� �����" + grade + "�Դϴ�.");
		
		// if�� ���� switch���� ���� ���� : switch���� Ȱ���ϱ⿣ �������̳� if������ swith���� �ӵ��� ����
		
		// ���ڸ� �Է¹޾� �� ���ڰ� 0���� 0�� �ƴ��� ������ּ���.	
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("�����Է�>");
//		int input = Integer.parseInt(s.nextLine());
//		
//		if (input == 0){
//			System.out.println("�Է¹��� ���ڴ� 0�Դϴ�.");
//		} else {
//			System.out.println("�Է¹��� ���ڴ� 0�� �ƴմϴ�.");
//		}
		
		//���ڸ� �Է¹޾� �� ���ڰ� Ȧ������ ¦������ ������ּ���.
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("�����Է�>");
//		int input = Integer.parseInt(s.nextLine());
//		
//		if(input % 2 == 1){
//			System.out.println("Ȧ��");
//		}else{
//			System.out.println("¦��");
//		}
		
		//���� 3���� �Է¹޾� ����, ���, ����� ������ּ���.
		//����� �Ҽ��� 1�ڸ�����
		
//		Scanner g1 = new Scanner(System.in);
//		System.out.println("���� 1 �Է�>");
//		int x = Integer.parseInt(g1.nextLine());
//
//		Scanner g2 = new Scanner(System.in);
//		System.out.println("���� 2 �Է�>");
//		int y = Integer.parseInt(g2.nextLine());
//
//		Scanner g3 = new Scanner(System.in);
//		System.out.println("���� 3 �Է�>");
//		int z = Integer.parseInt(g3.nextLine());
//
//		int sum = x + y + z;
////		double avg = (x + y + z) / 3;
//		double avg = Math.round(sum / 3.0 * 10) / 10.0;
//
//		if (90 <= avg) {
//			grade = "A";
//			if (97 <= avg) {
//				grade += "+";
//			} else if (avg <= 93) {
//				grade += "-";
//			}
//		} else if (80 <= avg) {
//			grade = "B";
//			if (77 <= avg) {
//				grade += "+";
//			} else if (avg <= 73) {
//				grade += "-";
//			}
//		} else if (70 <= avg) {
//			grade = "C";
//			if (67 <= avg) {
//				grade += "+";
//			} else if (63 <= avg) {
//				grade += "-";
//			}
//		} else if (60 <= avg) {
//			grade = "D";
//			if (57 <= avg) {
//				grade += "+";
//			} else if (53 <= avg) {
//				grade += "-";
//			}
//		} else if (50 <= avg) {
//			grade = "E";
//			if (47 <= avg) {
//				grade += "+";
//			} else if (43 <= avg) {
//				grade += "-";
//			} else {
//				grade = "F";
//			}
//		}
//		System.out.println("������" + sum + "�����" + avg + "�����" + grade);
//		System.out.println("���� : " + sum + " / ��� " + avg + " / ��� " + grade);
		
		//���� �߻�
		//Math.random() : 0.0 ~ 1.0 �̸��� ������ �߻�
//		int random = (int) (Math.random() * 100) + 1;
//		System.out.println(random);
		
		//1~ 100 ������ ������ ���� 3�� �߻���Ű�� ������������ ������ּ���.
		int num1 = (int) (Math.random() * 100) + 1;
		System.out.println(num1);
		int num2 = (int) (Math.random() * 100) + 1;
		System.out.println(num2);
		int num3 = (int) (Math.random() * 100) + 1;
		System.out.println(num3);
		
		if (num1 > num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3){
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 > num3){
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + "<" + num2 + "<" + num3);
	}
}
