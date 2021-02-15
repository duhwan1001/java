package E_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM(Java Virtual Machine)
		 * - �ڹٷ� ������� ���α׷��� ����Ǵ� ��ǻ�� ���� ���� ��ǻ��
		 * - �ü�� -> JVM -> �ڹ� ���α׷�
		 * - ���� : �ü���� ������� ������ �� �ִ�.
		 * - ���� : �ӵ��� ������.
		 * 
		 * JVM �޸� ����
		 * - Method Area(�޼��� ����) : Ŭ���� ����� ����ȴ�.
		 * - Call Stack(ȣ�� ����) : ���� ȣ��Ǿ� �ִ� �޼��尡 ����ȴ�.
		 * - Heap : ��ü�� ����ȴ�.
		 */

		/*
		 * Method Area : 
		 * Heap : 
		 * Call Stack : 
		 */
		System.out.println(classVar);
		
		classMethod(); // classMethod(), println()
		
		JVM jvm = new JVM(); // ��ü�� Heap �޸𸮿� �����
		
		System.out.println(jvm.instanceVar); // ���� ���� Call stack�� ȣ��Ǿ��ٰ� �ٽ� �����
		
		jvm.instanceMethod(); // 
		
		jvm = null; //GarbageCollector�� ���� ���ŵ�.
	}

	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){
//		System.out.println(instanceVar); // ���� �޸𸮿� �ö��� ���� ����.
		System.out.println(classVar);
	}
}
