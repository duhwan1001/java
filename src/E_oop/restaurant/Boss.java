package E_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		Alba alba = new Alba();
		
		String[] order = alba.order();
		System.out.println(Arrays.toString(order));
		
		System.out.println("�丮 �������... �ϼ�!!");
		String[] foods = {"�ϼ��� ¥���", "�ϼ��� ������"};
		
		alba.serve(foods);
		
		alba.pay(order);
	}

}
