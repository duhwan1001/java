package b_operation;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * ��� ������ - ��Ģ���� : +, -, *, /, %(������) - ���տ����� : +=, -=, *=, /=, %= -
		 * ���������� : ++, --
		 */

		int result = 10 + 20 - 30 * 40 / 50 % 60;

		// ������ ����
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);

		// 5���� ��������ڸ� ����� 5���� ������ ���� �� ������ּ���.

		int result1 = 11 + 20;
		// int result2 = 12 - 15;
		// int result3 = 12 * 3;
		int result4 = 40 / 12;
		int result5 = 50 + 1 - 15;

		System.out.println(result1);
		// System.out.println(result2);
		// System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

		// ���տ����� // ���տ����� : +=, -=, *=, /=, %=
		// ������ ����Ǿ� �ִ� ���� ������ ������ �� ������ �����ڿ� ���Կ����ڸ� ������ ����� �� �ִ�.
		result += 3;

		result = result + 3;

		result -= 5;
		System.out.println(result);

		result *= 2;
		System.out.println(result);

		// �Ʒ��� ������ ���տ����ڸ� ����� �������� ������ּ���.
		// result = result + 10;
		result += 10;
		System.out.println(result);

		// result = result - 2 * 3;
		result -= 2 * 3;
		System.out.println(result);

		// result = result % 5;
		result %= 5;
		System.out.println(result);

		// ����������
		// ����������(++) : ������ ���� 1 ������Ų��.
		// ���ҿ�����(--) : ������ ���� 1 ���ҽ�Ų��.
		int i = 0;

		++i; // ������ : ������ ���� �о���� ���� 1 �����ȴ�.
		i++; // ������ : ������ ���� �о�� �Ŀ� 1 �����ȴ�.
		--i; // " : ������ ���� �о���� ���� 1 ���ҵȴ�.
		i--; // " : ������ ���� �о�� �Ŀ� 1 ����.

		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);

		// �ǿ������� Ÿ���� ���� ���ƾ߸� ������ �����ϴ�.
		int _int = 10;
		double _double = 3.14;
		double result2 = (double) _int + _double; // ǥ�������� �� ū Ÿ������ ����ȯ�ȴ�.
		System.out.println(result2);
//
//		long _long = 100L;
//		_long = _int + _long;
//		_int = _int + (int) _long;
//
//		byte _byte = 5;
//		short _short = 10;
//		int result3 = _byte + _short; // int���� ���� Ÿ���� int�� ����ȯ �ȴ�.
//		System.out.println(result3);
//
//		char _char = 'a';
//		char _char2 = 'b';
//		_int = _char + _char2;
//		System.out.println(_int);
//
//		// �����÷ο�, ����÷ο�
//		// ǥ�������� ����� ���� ǥ���� �� �߻��ϴ� ����
//		byte b = 127;
//		b++;
//		System.out.println(b); // �ִ� 127 �ּڰ� -128 �ִ� ����� ������ ���ϱ� ������ -128�� ��µ�.
//		b--;
//		System.out.print(b);
//		
//		//������ ���پ� ����ؼ� ���� ������� ������ּ���.
//		//1. 123456 + 654321
//		//2. 1���� ����� * 123456
//		//3. 2���� ����� / 123456
//		//4. 3���� ����� - 654321
//		//5. 4���� ����� % 123456
//
//		long res = 123456 + 654321;
//		res *= 123456;
//		res /= 123456;
//		res -= 654321;
//		res %= 123456;
//		System.out.println(res);
//		
//		//3���� int�� ������ ���� �� �ʱ�ȭ �� �հ�� ����� �����ּ���.
//		int a = 1233;
//		int c = 1234;
//		int d = 1444;
//		int sum = a + c + d;
//		double avg = sum / 3.0;
//		System.out.println(avg);
//		
//		//�ݿø�
//		avg = Math.round(avg); //�Ҽ��� ù°�ڸ����� �ݿø�
//		System.out.println(avg);
//		avg = Math.round(avg * 10) / 10.0;
//		System.out.println(avg);
		
		
		
		
		
		
		
		
	}

}
