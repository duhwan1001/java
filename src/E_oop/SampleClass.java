package E_oop;

public class SampleClass {

	public static void main(String[] args) {
		int local = 10; // �������� : �޼��� �ȿ����� ����ϴ� ����
	}
	
	int field; //�������� : Ŭ���� ��ü �������� ����ϴ� ����
	//�ʱ�ȭ���� �ʾƵ� �⺻������ �ʱ�ȭ�ȴ�.
	
	boolean bool = false;
	String str = null;
	
	/*
	 * - �޼��� : ������ ������ �� ��
	 * - ���� ��� : ����Ÿ�� �޼����(�Ķ����){ }
	 * - �Ķ����(�Ű�����) : ���࿡ �ʿ��� ����
	 * - ����Ÿ��(��ȯŸ��) : ���� �� ��������ϴ� ����� 
	 */
	
	void method1(){
		System.out.println("�Ķ���͵� ����Ÿ�Ե� ���� �޼���");
	}
	
	String method2(int parameter){
		return parameter +" �� �޾� ����� �����ϰ� ������� �����ϴ� �޼���"; //String ������ ������ �ڿ� String�� �;� ��.
	}
	
	void flowTest1(){
		System.out.println("flowTest1 ���� : 1");
		flowTest3();
		System.out.println("flowTest1 ���� : 6");
	}
	
	void flowTest2(){
		System.out.println("flowTest2 ���� : 3");
		System.out.println("flowTest2 ���� : 4");
	}
	
	void flowTest3(){
		System.out.println("flowTest3 ���� : 2");
		flowTest2();
		System.out.println("flowTest3 ���� : 5");
	}
}
