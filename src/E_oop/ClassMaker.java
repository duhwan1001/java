package E_oop;

public class ClassMaker {

	//�������� �ϳ��� ���� �� �ʱ�ȭ ���ּ���.
	
	int field = 10;
	
	//����Ÿ�԰� �Ķ���Ͱ� ���� �޼��� �ϳ��� ������ּ���.
	//�޼��� �ȿ��� ���������� ������ּ���.
	void method1(){
		System.out.println(field);
	}
	
	//���������� ������ Ÿ���� ����Ÿ���� �ְ� �Ķ���ʹ� ���� �޼��� �ϳ��� ������ּ���.
	//�޼��� �ȿ��� ���������� �������ּ���.
	
	int method2(){
		return field;
	}
	
	//����Ÿ���� ���� �Ķ���Ͱ� �ִ� �޼��� �ϳ��� ������ּ���.
	//�޼��� �ȿ��� �Ķ���͸� ������ּ���.
	
	void method3(int parameter){
		System.out.println(parameter);
	}
	
	//intŸ���� ����Ÿ�԰� intŸ���� �Ķ���� �ΰ��� �ִ� �޼��� �ϳ��� ������ּ���.
	//�޼��� �ȿ��� �� �Ķ���͸� ���� ����� �������ּ���.
	int method4(int parameter1, int parameter2){
		return parameter1 * parameter2;
	}
	
	//return�� ����
	//1. �޼��带 �����Ű�� ����
	//2. ���� ��ȯ��Ű�� ����
}
