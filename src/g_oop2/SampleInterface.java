package g_oop2;

public interface SampleInterface {
	
	//�������̽��� ��� ��������� public static final �����ڸ� ����ؾ� �Ѵ�.
	public static final int NUM1 = 1;
	
	//��� ��������� �����ڰ� ���� ������ ������ �����ϴ�.
	int NUM2 = 2;
	
	//�������̽��� ��� �޼���� public abstract �����ڸ� ����ؾ� �Ѵ�.
	public abstract void method1();
	
	//��� �޼����� �����ڰ� ���� ������ ������ �����ϴ�.
	void method2();
	

}

class SampleImplement implements SampleInterface, SampleInterface2 {

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
		
	}
	
}

interface SampleInterface2 {
	void method1();
	void method3();
}

















