package b_operator;

public class LogicalOperator1 {

	public static void main(String[] args) {
		/*
		 * ��������
		 * - &&(AND), ||(OR), !(NOT)
		 * - �ǿ����ڷ� boolean�� ����Ѵ�.
		 */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;
		//||���� &&�� �켱������ ����.
		
		b = !(x < y); // '�ݵ�� �Ұ�ȣ ������ ����� ��.' ���ǽ��� ����� �ݴ�� ���� !(NOT) = �ݴ��
		
		// ȿ���� ����
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false
		b = false && false; // false
		// && / and ������ ���� ���� ����� false�� ��� �������� Ȯ������ �ʰ� ������ false 
		
		b = true || true; // true
		b = true || false; // true
		b = false || true; // true
		b = false || false; // false
		// || / or ������ ���� ���� ����� true�� ��� �������� Ȯ������ �ʰ� ������ true
		//������ �ǿ����ڿ��� ����� �������� �������� �������� �ʴ´�.
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		
		//������ ������� �ڵ�� �ۼ�
		//1. x�� y���� ũ��, x�� 10���� �۴�.
		b = x > y && x < 10; 
		//2. x�� ¦���̰�, x�� y�� ����̴�.
		b = x % 2 == 0 && x % y == 0;
		//3. x�� 3�� ����̰ų�, x�� 5�� ����̴�.
		b = x % 3 == 0 || x % 5 == 0;
		
	}
}
