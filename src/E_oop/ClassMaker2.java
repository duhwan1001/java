package E_oop;

public class ClassMaker2 {

	//�ν��ϼ����� �ϳ��� �����ϰ� ��������� �ʱ�ȭ ���ּ���.
	
	int instanceVar = 10;
	
//	String name = "ȫ�浿";
	
	//������ ������ �ν��ϼ������� �ʱ�ȭ ���� ����� �ʱ�ȭ ���ּ���.
	{
		instanceVar = 20;
	}
	
//	{
//		name = "���ȯ";
//	}
	
	//������ ������ �ν��ϼ������� �������� �Ķ���͸� ����� �ʱ�ȭ ���ּ���.
	
	ClassMaker2(int instanceVar){
		this.instanceVar = instanceVar;
	}
	
//	ClassMaker2(String name){
//		this.name = name;
//	}
	
	//������ ������ �ν��Ͻ������� �����ڸ� �ϳ� �� ���� �ʱ�ȭ ���ּ���.
	
	ClassMaker2(){
		this(50);
	}
	
//	ClassMaker2(){
//		this("���ȯ");
//	}
	
	//�ʱ�ȭ ���� : 1.����� �ʱ�ȭ 2.�ʱ�ȭ �� 3.������ �ʱ�ȭ
	
	//���
	public static void main(String[] args){
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.instanceVar);
		
		ClassMaker2 cm2 = new ClassMaker2(60);
		System.out.println(cm2.instanceVar);
	}
}
