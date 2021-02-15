package g_oop2;

public abstract class Animal {

	void run(){
		System.out.println("崔妨埃促~~~~");
	}
	
	abstract void sound();
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("港港");
	}
	
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("具克");
	}
}

class pigeon extends Animal{

	@Override
	void sound() {
		System.out.println("备备");
	}	
}










