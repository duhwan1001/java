package E_oop;

public class ClassMaker2 {

	//인스턴수변수 하나를 선언하고 명시적으로 초기화 해주세요.
	
	int instanceVar = 10;
	
//	String name = "홍길동";
	
	//위에서 선언한 인스턴수변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		instanceVar = 20;
	}
	
//	{
//		name = "김두환";
//	}
	
	//위에서 선언한 인스턴수변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	
	ClassMaker2(int instanceVar){
		this.instanceVar = instanceVar;
	}
	
//	ClassMaker2(String name){
//		this.name = name;
//	}
	
	//위에서 선언한 인스턴스변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	
	ClassMaker2(){
		this(50);
	}
	
//	ClassMaker2(){
//		this("김두환");
//	}
	
	//초기화 순서 : 1.명시적 초기화 2.초기화 블럭 3.생성자 초기화
	
	//출력
	public static void main(String[] args){
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.instanceVar);
		
		ClassMaker2 cm2 = new ClassMaker2(60);
		System.out.println(cm2.instanceVar);
	}
}
