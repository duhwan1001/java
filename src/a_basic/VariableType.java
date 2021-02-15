package a_basic;

public class VariableType {
	public static void main(String[] args) {
		
		/*
		������ Ÿ��
		
		1. �⺻��Ÿ��(primitive type)
		  - boolean, char, byte, short, int, long, float, double
		  
		2. ������Ÿ��(reference type)
		
		
		3. �⺻�� Ÿ���� ����
		  - ���� : true,false�� �ϳ��� ���� ������. ex) boolean
		  - ������ : ���� �ϳ��� �����ϴµ� ���ȴ�. ex) char
		  - ������ : �������� �����ϴµ� ���ȴ�. ex) byte, short, int, long
		  - �Ǽ��� : �Ǽ����� �����ϴµ� ���ȴ�. ex) float, double
		  
		4. �⺻�� Ÿ���� ũ��
		  - 1byte : boolean, byte
		  - 2byte : char, short
		  - 4byte : int, float
		  - 8byte : long, double
		
		5. ���� - boolean(�⺻�� - false)
		  - boolean�� �������� true�� false�� �ϳ��� ���� ������ �� �ִ�.
		  - boolean�� ������ ���, ����ġ���� �������� �ַ� ���ȴ�.
		  - �����͸� �ٷ�� �ּҴ����� 1byte������ 1byte�� ũ�⸦ ������.
		*/
		
		//���� power�� �����ϰ� false�� ������ �ʱ�ȭ �Ͽ���.
		// ����Ÿ�� ������ = ��;
		boolean power = false;
		//power�� ���� true�� �����Ͽ���.
		power = true;
		
		/*
		6. ������ - char
		  - �����ϳ��� �����ϴ� ����Ѵ�.
		  - java�� Unicode���� ü�踦 �Ͽ��ϱ� ������ 2byte�� ũ�⸦ ������.
		  - '��' 
		*/
		// ���� ch�� �����ϰ� ���ϴ� ���� �ϳ��� �ʱ�ȭ �ϼ���
		char ch = '\n';
		//ch�� ���� �빮�� 'A'�� ������ �ּ���
		ch = 'A';
		char ch2 = '\u0041';
		System.out.println(ch2);
		
		char ch3 = 65;
		
		/*
		7. ������ - byte, short, int, long
		  - ��ǥ�ڷ����� int�̴�.
		  - ������ �����Ϸ��� �������� ������ ���� 4���� �������߿� �ϳ��� �����Ѵ�.
		*/
		//1. byte�� ���� b1�� 30�� ���� �������ּ���
		byte b1 = 30;
		//2. short�� ���� s1�� 40000�� �������ּ���
		short s1 = 30000;
		//3. long�� ���� l1�� 50���� �������ּ���
		long l1 = 5000000000L;
		
		/*
		8. �Ǽ���  - float, double
		  - �Ǽ��� ���� �����ϴµ� ���ȴ�.
		  - ��ǥ�ڷ����� double�̴�.
		  - float : 1+8+23
		  - double: 1+11+52
		  - �Ǽ����� �ڷ����� �����Ҷ��� ���� �����Ӹ� �ƴ϶� ���е��� �߿��� ��Ұ� �ȴ�.
		
		*/
		//1. float�� ���� f1��  3.14159274894���� �����Ͽ���.
		float f1 = 3.14159274894F;
		System.out.println(f1);
		//2. double������ d1�� 3.14159274894���� �����Ͽ���.
		double d1 = 3.14159274894;
		System.out.println(d1);
		
		/*
		9. overflow
		  - ���� �ڽ��� ������ �� �ִ� �ִ밪�� �Ѿ� ������ �ּҰ����� ���ư��� ����
		*/
		//1. byte�� ���� b2�� 126�� ���� �������ּ���
		byte b2 = 126;
		b2++;
		b2++;
		System.out.println(b2);
		
		/*
		10. ĳ����(casting)
		*/
		byte b4 = 35;
		char c4 = '�R';
		short s4 = 56;
		int i4 = 500000;
		
		//1. i4�� ���� short������ s5�� �������ּ���
		short s5 = (short)i4;
		System.out.println(s5);
		
		//2. c4�� ���� int������ i5�� �������ּ��� (���ڰ� ������ �ִ� 10���� ���� ���)
		int i5 = (int)c4;
		System.out.println(i5);
		
		/*
		11. String
		  - ���ڿ��� �ٷ�� ���� ����Ѵ�. 
		*/
		String name = "================\n------------";
		System.out.println(name);
		
		char c6 = 'A';
		
		System.out.println(c6+3);
		
		System.out.println("4"+3);// String + int -> String + String -> "4" + "3"-> "43"
		
		System.out.println(" " + true);
	}
}
