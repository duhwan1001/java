package E_oop;

public class StaticTest {

	static int classVar; //클래스 변수
	int instanceVar; //인스턴스 변수
	
	public static void main(String[] args) {
		System.out.println(classVar);
		System.out.println(new StaticTest().instanceVar);
	}

	void instanceMethod(){ //인스턴스 메서드
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}