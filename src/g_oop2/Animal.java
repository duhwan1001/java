package g_oop2;

public abstract class Animal {

	void run(){
		System.out.println("�޷�����~~~~");
	}
	
	abstract void sound();
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("�۸�");
	}
	
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("�߿�");
	}
}

class pigeon extends Animal{

	@Override
	void sound() {
		System.out.println("����");
	}	
}










