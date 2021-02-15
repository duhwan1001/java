package g_oop2;

public class SampleChild extends SampleParent{
	
	void childMethod(){
		//��ӹ��� ������ �޼��带 ����Ҽ��ִ�.
		System.out.println(var); // ��ӹ��� ����
		System.out.println(method(7,13)); // ��ӹ��� �޼���
	}
	
	//�������̵�
	//super, super()
	//������ �ڡڡ�
	
	//�������̵� : ��ӹ��� �޼����� ������ ������ �ϴ� ��.
	@Override // ������̼� : Ŭ����, ����, �޼��� � ǥ���� ���� ��.
	int method(int a, int b){ //����Ÿ�� �޼���� �Ķ���� ��� ���ƾ� �Ѵ�.
		return a * b;
	}
	
	//super, super()
	int var;
	
	void test(double var){
		System.out.println(var);		//��������
		System.out.println(this.var);	//�ν��Ͻ�����
		System.out.println(super.var);	//�θ� Ŭ������ �ν��Ͻ� ����
		//super : �θ� Ŭ������ ����� �ڽ� Ŭ������ ����� �̸��� �ߺ��� �� ���������ϱ� ���� ����Ѵ�.
		System.out.println(this.method(10,20));
		System.out.println(super.method(10,20));
	}
	
	SampleChild(){
		super(); //�θ� Ŭ������ ������ ȣ��
		//super()�� ���� Ŭ������ �����ڸ� ȣ���ϰ� �θ�Ŭ������ �ν��Ͻ� ������ �ʱ�ȭ�Ѵ�.
		//super()�� ������ �����Ϸ��� �ڵ����� super�� �־��ش�
	}
	
	// ������
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();
		// SampleParent sp = new SampleChild2();
		// SampleParent sp = new SampleChild3();
		//�θ�Ÿ���� ������ �ڽ�Ÿ���� ��ü�� ����ϴ� ���� �������̴�.
		
		//�θ�� �ڽİ����� ���� ����ȯ�� �����ϴ�.
		sc = (SampleChild)sp; // sc = sp �Ұ���
		sp = (SampleParent)sc; // sp = sc ����
		//�ڽ�Ÿ�� -> �θ�Ÿ�� ����ȯ�� ���� �� �� �ִ�.
		
//		SampleChild sc2 = (SampleChild)new SampleParent();
		//SampleParent�� 2���� ����� ������ �ִ�.
		//SampleChild�� 5���� ����� ������ �ִ�.
		//SampleChild Ÿ���� ������ 5���� ����� ����� �� �־�� �ϴµ�
		//SampleParent ��ü�� 2���� ����� ������ �ִ�.
		//�׷��Ƿ� �θ�Ÿ���� ��ü�� �ڽ�Ÿ������ ����ȯ �ϴ°��� ������ �߻���Ų��.
		
		//SampleParent Ÿ���� �����δ�
		//SampleChild ��ü�� ������ 2���� ����� ����� �� �ִ�.
		System.out.println(sp.var);
		System.out.println(sp.method(10,20));
//		sp.childMethod(); //��� �Ұ�
//		sp.test(); //��� �Ұ�
	}
}





