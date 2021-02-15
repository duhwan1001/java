package d_array;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		
		int[] a = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < numbers.length; j++) {
				int temp = numbers[i] + numbers[j];
				if(numbers[i] == temp){
					
				}
			}

		}
		

//		int[] temp = new int[5];
//		int count = 0;
//		for(int i = 0; i < arr.length; i++){
//			boolean flag = false; // int flag = 0;
//			for(int j = 0; j < temp.length; j++){
//				if(arr[i] == temp[j]){
//					flag = true; // flag = 1;
//				}
//			}
//			if(!flag){ // flag == 0; // flag = false;
//				temp[count++] = arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//		
//		int[] result = new int[count];
//		for(int i = 0; i < result.length; i++){
//			result[i] = temp[i];
//		}
//		System.out.println(Arrays.toString(result));

	}

}
