package i_api;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		//���ڸ� �Է¹޾� �Է¹��� ���ڿ� 3�ڸ� ���� �޸�(,)�� �ٿ� ������ּ���.
		//1,234,567
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �Է�=>");
		String number = s.nextLine();
		String number2 = "";
		
		int count = 0;
		for(int i = number.length() - 1; i >= 0; i--){
			number2 = number.charAt(i) + number2;
			count++;
			if(count % 3 == 0 && count != number.length()){
				number2 = "," + number2;
			}
		}
		System.out.println(number2);
		
		

	}

}
//
//String sub1;
//for(int i = 0; i < str.length(); i += 3){
//	sub1 = str.substring(i);
//	sub1 = ",";
//	System.out.println(sub1);