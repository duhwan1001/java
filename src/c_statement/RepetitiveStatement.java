package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * �ݺ���
		 * - for��
		 * - while��
		 * - do-while��
		 * 
		 * for��
		 * -for(�ʱ�ȭ; ���ǽ�; ������){}
		 * -�����ϰ� �ִ� ������� ������ Ƚ����ŭ �ݺ��ϰ� ���ִ� ����
		 */
		
		for(int i = 1; i <= 10; i++){
			//�ʱ�ȭ : ���ǽİ� �����Ŀ� ����� ���� �ʱ�ȭ
			//���ǽ� : �������� true�̸� ������ ������ �����Ѵ�.
			//������ : ������ ����/���ҽ��� �ݺ����� �����Ѵ�.
			System.out.println( i + "��° �ݺ�");
			//�ʱ�ȭ�� ������ ���ȿ��� ����� �� �ִ�.
		}
		
		//��Ģ�� �ִ� ������� ȿ�������� �ۼ��ϱ� ���� �ݺ����� ����Ѵ�.
		int sum = 0; //1���� 10���� �հ踦 ����
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i >= 1; i--){
			sum += i;
		}
		System.out.println(sum);
		
		//1���� 100���� ¦���� ���� ������ּ���.
		sum = 0;
		for(int i = 2; i <= 100; i += 2){
			sum += i;
		}
		System.out.println(sum);
		
		//1���� 100���� Ȧ���� ���� ������ּ���.
		sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 1){
				sum += i;
		}
		}
		System.out.println(sum);
		
		/*
		 * ������ ���
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ...
		 */
		
		for (int i = 2; i <= 9; i++) {
			for (int x = 1; x <= 9; x++) {
				System.out.println(x + " * " + i + "=" + x * i);
			}
		}
		/*
		 * 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
		 * ...
		 */
		
		for (int i = 1; i <= 9; i++){
			for (int j= 2; j <= 9; j++){
				System.out.print(j + " * " + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
		
		/*
		 * while��
		 * - while(���ǽ�){}
		 * - �����ϰ� �ִ� ������� ���ǽ��� �����ϴ� ���� �ݺ��ϴ� ����
		 * - �ݺ�Ƚ���� ��Ȯ���� ���� ��쿡 �ַ� ����Ѵ�.
		 */
		
		int a = 1;
		//a�� 2�� ����� ���ؾ� 1000�̻��� �Ǵ°�
		int count = 0;
		while(a < 1000){
			a *= 2;
			count++;
			System.out.println(count + ":" + a);
		}
		
		/*
		 * do-while��
		 * - do{}while(���ǽ�);
		 * - �ּ��� �ѹ��� ������ �����Ѵ�.
		 */
//		//���� ���߱� ����
//		int answer = (int)(Math.random() * 100) + 1; //1 ~ 100 ������
//		int input = 0;
//		Scanner s = new Scanner(System.in);
//		do{
//			System.out.println("1 ~ 100 ������ ���� �Է����ּ���>");
//			input = Integer.parseInt(s.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + "���� �۽��ϴ�.");
//			}else if(input < answer){
//				System.out.println(input + "���� Ů�ϴ�.");
//			}else{
//				System.out.println("�����Դϴ�.");	
//			}
//		}while(input != answer); // ������ ���� ��������.
		
		// �̸����� �ݺ���
//		outer: for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (j == 5) {
//					break; // ���� ����� �ݺ��� �ϳ��� ����������.
////					 break outer; // outer��� �̸��� �ݺ����� ����������.
//					// continue; //���� ����� �ݺ����� ���� �ݺ�ȸ���� ����������.
////					 continue outer; //outer��� �̸��� ���� �ݺ�ȸ���� ����������.
//				}
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++){
			for(int j = 5; j >= i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 5; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		
	}
}
