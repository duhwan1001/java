package E_oop;

public class StaticTest {

	static int classVar; //Ŭ���� ����
	int instanceVar; //�ν��Ͻ� ����
	
	public static void main(String[] args) {
		System.out.println(classVar);
		System.out.println(new StaticTest().instanceVar);
	}

	void instanceMethod(){ //�ν��Ͻ� �޼���
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}