package E_oop;

public class Static {

	/*
	 * - static�� ���̸� ���α׷� ����� �޸𸮿� �ö󰣴�.
	 * - ��ü������ ���� �ʾƵ� ����� �� �ִ�.
	 * - static�� ���� ������ ��ü���� ������ ���� �����Ѵ�.
	 * - static�� ���� ����� ��Ī : Ŭ���� ����, Ŭ���� �޼���
	 * - static�� ���� ���� ����� ��Ī : �ν��Ͻ� ����, �ν��Ͻ� �޼���
	 */
	
	//������ ���� �����ϱ� ���� static�� ���δ�.
	static int var; // static�� ������������ ����
	
	public static void main(String[] args) {
		
		Human ö�� = new Human();
		Human ���� = new Human();
		
		ö��.saveMoney(100000);
		����.saveMoney(200000);
		
		ö��.saveDateMoney(200000);
		����.saveDateMoney(200000);
		
		System.out.println("���ڿ� �Է�>");
		String str = ScanUtil.nextLine();
		System.out.println("�Է¹��� ���ڿ�  : " + str);
		
		System.out.println("���� �Է�>");
		int num = ScanUtil.nextInt();
		System.out.println("�Է¹��� ���� : " + num);
	}

}
 
class Human{
	int account; //����, ����
	
	void saveMoney(int money){
		account += money;
		System.out.println("���� �ܰ� : " + account);
	}
	
	static int dateAccount;
	
	void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("����Ʈ ���� �ܰ� : " + dateAccount);
	}
}