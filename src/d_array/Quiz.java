package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
//		int money = (int)(Math.random() * 500) * 10;
//		int[] coin = {500, 100, 50, 10};
//		System.out.println("�Ž����� : " + money);
		
		/*
		 * �Ž������� ������ �������� ��� ������ �ʿ����� ������ּ���.
		 * 
		 * �Ž����� : 2860��
		 * 500�� : 5��
		 * 100�� : 3��
		 * 50�� : 1��
		 * 10�� : 1��
		 */
		
//		int count = money / coin[0];
//		money = money % coin[0];
//		System.out.println(coin[0] + "�� :" + count +"��");
//		count = money / coin[1];
//		money = money % coin[1];
//		System.out.println(coin[1] + "�� :" + count +"��");
		
//		for(int i = 0; i < coin.length; i++){
//			int count = money / coin[i];
//			money = money % coin[i];
//			System.out.println(coin[0] + "�� :" + count +"��");
//		}
		
//		int[] arr = new int[20];
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = (int)(Math.random() * 5) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
		/*
		 * 1 ~ 5�� ���ڰ� �߻��� ��ŭ *�� ����� �׷����� �׷��ּ���.
		 * 
		 * 1 : *** 3
		 * 2 : **** 4
		 * 3 : ** 2
		 * 4 : ***** 5
		 * 5 : * 1
		 */
//		for (int i = 0; i < arr.length; i++) { // �ϴٸ���
//			if(arr[i]){
//				
//			}
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
		
//		int[] count = new int[5];
//		for(int i = 0; i < arr.length; i++){
//			count[arr[i] - 1]++;
//		}
//		for(int i = 0; i < count.length; i++){
//			System.out.print(i + 1 + " : ");
//			for(int j = 0; j < count[i]; j++){
//				System.out.print("*");
//			}
//			System.out.println(" " + count[i]);
//		}
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1 ~ 5������ ������ ���� 10���� ����� �迭���� �ߺ��� ���� ���ŵ� �迭�� ������ּ���.
		 * [5, 5, 3, 5, 2, 2, 2, 5, 5, 5]
		 * [5, 3, 2] // �����鼭 �ߺ��Ǵ��� Ȯ��
		 */
//		int[] temp = new int[5]; // �ϴٸ���
//		for(int i = 0; i < arr.length; i++){
//			if(temp[i] > arr[i]){
//				arr[i] = temp[i];
//			}
//		}
//		System.out.println(Arrays.toString(temp));
		
		int[] temp = new int[5];
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			boolean flag = false; // int flag = 0;
			for(int j = 0; j < temp.length; j++){
				if(arr[i] == temp[j]){
					flag = true; // flag = 1;
				}
			}
			if(!flag){ // flag == 0; // flag = false;
				temp[count++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		
	}
}
