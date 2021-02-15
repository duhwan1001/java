package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String�� �ֿ� �޼���
		 * - equals() : ���ڿ��� ������ ������ ��ȯ�Ѵ�.
		 * - length() : ���ڿ��� ���̸� ��ȯ�Ѵ�.
		 * - charAt() : Ư�� �ε����� ��ġ�� ���ڸ� ��ȯ�Ѵ�.
		 * - substring() : ���ڿ��� Ư�� �κ��� �߶� ��ȯ�Ѵ�.
		 * - indexOf() : ���ڿ� ���� Ư�� ������ �ε����� ��ȯ�Ѵ�.
		 * - contains() : ���ڿ��� Ư�� ���ڿ��� �����ϰ� �ִ°��� ���� ���θ� ��ȯ�Ѵ�.
		 * - split() : ���ڿ��� Ư�� ���ڸ� �������� ������ �迭���·� ��ȯ�Ѵ�.
		 * - trim() : ���ڿ� �յ��� ������ ������ ��ȯ�Ѵ�.
		 * - valueOf() : �ٸ� Ÿ���� �����͸� ���ڿ��� ��ȯ�� ��ȯ�Ѵ�.
		 */
		
		//equals
		boolean equals ="���ڿ�".equals("���ڿ�");
		System.out.println(equals); // ������ true �ٸ��� false
		
		String str1 = "���ڿ�";
		String str2 = null;
		System.out.println(str1.equals(str2));
		// System.out.println(str2.equals(str1)); // null�� ���� �� �ִ� ������ �տ� ���� �ʴ´�.
		
		//length
		String str = "12345";
		int length = str.length();
		for(int i = 0; i < length; i++){
			char charAt = str.charAt(i);
			System.out.println(charAt);
		}
		
		//charAt
		//���ڿ� ������
		String rev = "";
		for(int i = str.length() - 1; 0 <= i; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		//substring
		str = "0123456789";
		String sub1 = str.substring(3); //3�� �ε������� ������ �߶� ��ȯ�Ѵ�.
		System.out.println(sub1);
		String sub2 = str.substring(5, 8); //5�� �ε������� 8�� �ε��� ������ �߶� ��ȯ�Ѵ�.
		System.out.println(sub2);
		
		//indexOf
		str = "���� ������ �� ��纣��";
		int index = str.indexOf("������");
		System.out.println(index);
		
		//substring�� indexOf�� �����ؼ� ���ڿ� �ڸ���
		String[] menu = {
				"���� 20000��",
				"������ 100000��",
				"�� 500��",
				"��纣�� 3000��"
		};
		
		for(int i = 0; i < menu.length; i++){
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println(name);
			
			//���ݸ� �߶� intŸ���� ������ �������ּ���.
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ") + 1, menu[i].indexOf("��"))); // Integer.parseInt ���ڿ��� ���ڷ� ��ȯ
			System.out.println(price);
		}
		
		//contains
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		//�������� �޴��� ��� �ε����� �ִ��� ã��
		for(int i = 0; i < menu.length; i++){
			if(menu[i].contains("������")){
				System.out.println("��������" + i + "�� �ε����� �ֽ��ϴ�.");
			}		
		}
		
		//split
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		
		//�޴���� ���� ������
		for(int i = 0; i < menu.length; i++){
			split = menu[i].split(" ");
			System.out.println("�޴��� : " + split[0] + " / ���� :" + split[1]);
		}
		
		//trim 
		//�ۼ����� �Ǽ��� �������ֱ� ���� ���� �����. ex) id&password
		str = " ���ڿ� ";
		String trim = str.trim();
		System.out.println("[" + str + "] -> [" + trim + "]");
		
		//������� �Ǽ��� ���̵� ��й�ȣ �յڿ� ������ ���� ���� ������ �ټ� �ִ�.
		String id = " myId ";
		String password = "  myPassword ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		//valueOf
		int number = 10;
		str = number + ""; // intŸ�Կ� �� ���ڿ��� �־� String Ÿ������ ����ȯ ��Ŵ (��¦���)
		str = String.valueOf(number);
	}

}







