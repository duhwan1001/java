package g_oop2;

public class AccessModifier {
	
	public String publicVar = "public : ���������� ����";
	protected String protectedVar = "protected : ���� ��Ű�� + ��ӹ��� Ŭ�������� ���� ����";
	String defaultVar = "default : ���� ��Ű�������� ���� ����";
	private String privateVar = "private : Ŭ���� �������� ���� ����";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		Time t = new Time();
		
//		t.hour = 14;
//		t.minute = 2;
//		t.second = -15;
		
		t.setHour(14);
		t.setMinute(-15);
		t.setSecond(-15);
		System.out.println(t.getTime());
		
		/*
		 * ���������ڸ� ����ϴ� ����
		 * - �����͸� ��ȣ�ϱ� ����
		 * - ����ϴµ� ���ʿ��� ����� ����� ����
		 */
		
		t.clock();
	}
	
}
