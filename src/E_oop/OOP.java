package E_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는 것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
		//SampleClass
		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(10);
		System.out.println(returnValue);
		
		sc.flowTest1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메서드를 호출 해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드를 리턴받은 값을 출력해주세요.
		
		//ClassMaker
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		
		System.out.println(cm.method2());
		
		cm.method3(100);
		
		System.out.println(cm.method4(10, 20));
		
		//Calculator -- 정수가 올지 실수가 올지 모르기 때문에 double을 사용함. 또한 저장 가능 범위도 고려해야한다.
		Calculator cal = new Calculator();
		
		double plus = cal.plus(123456, 654321);
		System.out.println(plus);
		
		double times = cal.times(plus, 123456);
		System.out.println(times);
		
		double div = cal.div(times, 123456);
		System.out.println(div);
		
		double minus = cal.minus(div, 654321);
		System.out.println(minus);

		double remain = cal.remain(minus, 123456);
		System.out.println(remain);
	}

}
