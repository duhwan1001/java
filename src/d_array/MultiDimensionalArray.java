package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * ������ �迭
		 * - �迭�ȿ� �迭�� ����Ǿ� �ִ� �����̴�.	
		 */
		
		//2����
		int[][] array2;
		
		//3����
		int[][][] array3;
		
		/*
		 * ���� : �ּ�1
		 * 
		 * �ּ�1 : {�ּ�2, �ּ�3}
		 * 
		 * �ּ�2 : {��1, ��2}
		 * �ּ�3 : {��3, ��4}
		 */
		
		int[][] arr = new int[2][3]; //2ĭ¥�� �迭�ȿ� �� ĭ���� 3ĭ¥�� �迭�� �����ȴ�.
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}}; //���� ������ �迭�� ���̸� ������
		int[] arr3[] = { {1, 2, 3}
					   , {4, 5, 6}
					   , {7, 8, 9}}; //����� �ʱ�ȭ�� ���ÿ� �ؾ��Ѵ�.
		
		int[][] arr4 = new int[3][]; //�����迭
		arr4[0] = new int[3];
		arr4[1] = new int[5];
		arr4[2] = new int[10];
		
//		System.out.println(arr[0][1]);
		
//		arr[0] = 10; //���� ������ �� ����.
		arr[0] = new int[5]; //�迭�� �����ؾ� �Ѵ�.
		arr[0][0] = 10; //2������ ���� ������ �� �ִ�.
		arr[0][1] = 20;
		arr[1][0] = 100;
		
//		System.out.println(arr.length); // 1���� �迭�� ����
//		System.out.println(arr[0].length); // 2���� �迭�� ����
//		System.out.println(arr[1].length);
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
//				System.out.println(arr[i][j]); // ����� ��
				arr[i][j] = i * j; // �� ����
			}
		}
		
		int[][] scores = new int[3][5]; // int[�л���][�����]
		int[] sum = new int[scores.length]; // �հ�
		double[] avg = new double[scores.length]; // ���
		System.out.println(Arrays.toString(sum));
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//�հ�� ����� �����ּ���.
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
//				scores[i][j] += scores[i][j];
				sum[i] += scores[i][j];
			}
			avg[i] = Math.round((double)sum[i] / scores[i].length * 10) / 10.0; // ����ȯ
			System.out.println("�հ� : " + sum[i] + " / ��� : " + avg[i]);
		}
	
			
			
		
	}
}