package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * �迭
		 * - �������� ���� �ϳ��� ������ �����ؼ� ����ϴ� ���̴�.
		 * - ������ Ÿ���̴�.
		 * - �ε����� ���� �����Ѵ�.
		 * - ���̸� ���� �� �� ����.
		 */

		int[] array; //�迭�� �ּҸ� ������ ������ ���������.
		array = new int[5]; // �迭�� �����ǰ� �� �ּҰ� ����ȴ�.
		//�迭 �ʱ�ȭ�� �⺻���� ����ȴ�.
		/*
		 * �⺻�� : ���� �������� �ʾ��� �� ����Ǵ� ��
		 * byte, short, int, long : 0
		 * float, double : 0.0
		 * char = ''(0)
		 * boolean : false
		 * ������ : null
		 */
		
		/*
		 * ���� = �ּ�
		 * �ּ�{0, 0, 0, 0, 0)
		 */
		
		array = new int[]{1, 2, 3, 4, 5};
		
//		array = {1, 2, 3, 4, 5}; // ����� �ʱ�ȭ�� ���ÿ� �ؾ��Ѵ�.
		
		int[] array2 = {1, 2, 3, 4, 5};
		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
//		for(int i = 0; i < array.length; i++){
//			System.out.println(array[i]);
//		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i + 1) * 10;
			System.out.println(array[i]);
		}
		
		//10���� ������ ������ �� �ִ� �迭�� ���� �� �ʱ�ȭ ���ּ���.
		
		int[] random = new int[10];
		
		//�迭�� ��� �ε����� 1~100������ ������ ���� �������ּ���.
		
		for(int i = 0; i < random.length; i++){
			random[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(random));
		
		//�迭�� ����� ��� ���� �հ�� ����� �����ּ���.
		int sum = 0;
		
//		for(int i n= 0; i < random.length; i++){
//			sum += random[i];
//		}
		double avg = Math.round((double)sum / random.length * 10) / 10.0;
		System.out.println("sum : " + sum + " / avg : " + avg);
		
		//�迭�� ����� ���� �ּҰ��� �ִ밪�� ������ּ��� 
		int min = random[0];
		int max = random[0];
		for (int i = 0; i < random.length; i++) {
			if (random[i] < min) {
				min = random[i];
			}
			if (max < random[i]) {
				max = random[i];
			}
		}
		// System.out.println("min : " + min + " / max : " + max);
		//
		int[] shuffle = new int[10];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
//		System.out.println(Arrays.toString(shuffle));

		// �迭�� ���� �����ּ���.
		// ���� �ε����� 0�� �ε����� �ڸ��� �ٲ��ּ���.(�������ݺ�)

		for (int i = 0; i < shuffle.length * 10; i++) {
			int random1 = (int) (Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random1];
			shuffle[random1] = temp;
		}
		
//		System.out.println(Arrays.toString(shuffle));

		//1~10 ������ �������� 500�� �����ϰ�, �� ���ڰ� ������ Ƚ���� ������ּ���.

		int[] counts = new int[10];
		
		for(int i = 0; i < 500; i++) {
			int random1 = (int)(Math.random() * 10)+1;
			counts[random1 - 1]++;
		}
		System.out.println(Arrays.toString(counts));
	}

}
