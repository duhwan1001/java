package E_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * ��ü���� ���α׷���(Object Oriented Programming)
		 * - ���α׷����� �ܼ��� �ڵ��� �������� ���°��� �ƴ϶� ��ü���� ��ȣ�ۿ����� ���� ��.
		 * - �ڵ��� ���뼺�� ���� ���������� �����ϴ�.
		 */
		
		//SampleClass
		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(10);
		System.out.println(returnValue);
		
		sc.flowTest1();
		
		//��� ���� Ŭ������ ��ü�� �����ϰ� ������ �������ּ���.
		//��ü�� ����� ������ ���� �޼��带 ȣ�� ���ּ���.
		//�Ķ���Ͱ� �ִ� �޼���� Ÿ�Կ� �´� ���� �Ѱ��ֽð�,
		//����Ÿ���� �ִ� �޼��带 ���Ϲ��� ���� ������ּ���.
		
		//ClassMaker
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		
		System.out.println(cm.method2());
		
		cm.method3(100);
		
		System.out.println(cm.method4(10, 20));
		
		//Calculator -- ������ ���� �Ǽ��� ���� �𸣱� ������ double�� �����. ���� ���� ���� ������ ����ؾ��Ѵ�.
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
