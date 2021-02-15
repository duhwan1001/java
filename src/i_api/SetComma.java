package i_api;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//1,234,567
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자 입력=>");
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