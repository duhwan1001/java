package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * ����
		 * - �������ϱ� : ������ ���� ���� ������ ����� ������Ű�� ���
		 * - �������� : ���� ���� ���ڸ� ã�Ƽ� ������ ������ ���
		 * - �������� : �ٷ� ���� ���ڿ� ���ؼ� ū ���� �ڷ� ������ ���
		 * - �������� : �ι�° ���ں��� ���� ���ڵ�� ���ؼ� ū���� �ڷ� �а� �߰��� �����ϴ� ���
		 */
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
//		�������ϱ�
		int[] rank = new int[arr.length];
		
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i]++; 
				}
			}
		}
		System.out.println(Arrays.toString(rank));
		
		// ��������
		/*
		 * i,j
		 * 0,1 0,2 0,3 0,4 0,5 0,6 0,7 0,8 0,9
		 * 1,2 1,3 1,4 1,5 1,6 1,7 1,8 1,9
		 * 2,3 2,4 2,5 2,6 2,7 2,8 2,9
		 * 3,4 3,5 3,6 3,7 3,8 3,9
		 * ...
		 * 7,8 7,9
		 * 8,9
		 */
		
//		for(int i = 0; i < arr.length - 1; i++){
//			int min = i;
//			for(int j = i + 1; j < arr.length; j++){
//				if(arr[j] < arr[min	]){
//					min = j;	
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		// ��������
		/* 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7
		 * 0,1 1,2 2,3 3,4 4,5 5,6
		 * 0,1 1,2 2,3 3,4 4,5
		 * 0,1 1,2 2,3 3,4
		 * 0,1 1,2 2,3
		 * 0,1 1,2
		 * 0,1
		 */
		
//		for(int i = 0; i < arr.length - 1; i++){
//			boolean flag = false; // ex
//			for(int j = 0; j < arr.length - i - 1; j++){ // ��� �����ϴ°� �ʿ��� i �� ����
//				if(arr[j] > arr[j + 1]){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					flag = true; // ex
//				}
//			}
//			if(flag == false){//!flag 
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//��������
		/*
		 * 1 0
		   2 1 2 0
		   3 2 3 1 3 0
		   4 3 4 2 4 1 4 0
           5 4 5 3 5 2 5 1 5 0
           6 5 6 4 6 3 6 2 6 1 6 0
		   7 6 7 5 7 4 7 3 7 2 7 1 7 0
		   8 7 8 6 8 5 8 4 8 3 8 2 8 1 8 0
		   9 8 9 7 9 6 9 5 9 4 9 3 9 2 9 1 9 0
//		 */
//		for (int i = 1; i < arr.length; i++) {
//			int temp = arr[i];
//			int j = 0;
//			for (j = i - 1; j >= 0; j--) {
//				if (temp < arr[j]) {
//					arr[j + 1] = arr[j];
//				}else{
//					break;
//				}
//			}
//			arr[j + 1] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
	}
}