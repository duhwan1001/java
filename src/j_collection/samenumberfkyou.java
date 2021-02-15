package j_collection;

import java.util.Arrays;

public class samenumberfkyou {

	public static void main(String[] args) {

		int[] arr = {4,4,4,3,3};
		
		int[] same = new int[]{};
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] == arr[i]){
					same = arr[i];
				}
			}
		}
		System.out.println(Arrays.toString(same));
//		for(int i = 0; i < arr.length - 1; i++){
//		int min = i;
//		for(int j = i + 1; j < arr.length; j++){
//			if(arr[j] < arr[min	]){
//				min = j;	
//			}
//		}
		System.out.println(Arrays.toString(arr));
	}

}
