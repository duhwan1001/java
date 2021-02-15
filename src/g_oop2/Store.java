package g_oop2;

public class Store {

	public static void main(String[] args) {
		
		Desktop d1 = new Desktop("�Ｚ ��ǻ��", 100000);
		Desktop d2 = new Desktop("LG ��ǻ��", 100000);
	
		Aircon ac1 = new Aircon("�Ｚ ������", 200000);
		Aircon ac2 = new Aircon("LG ������", 200000);
		
		TV tv1 = new TV("�Ｚ TV", 300000);
		TV tv2 = new TV("LG TV", 300000);
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy((Product)d1); //����ȯ ����
		
		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac2);
		
		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv2);
		
		c.showItem();
	}

}

class Product {
	String name; // �̸�
	int price; // ����

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// ��ǰ�� ������ ��ȯ�ϴ� �޼���
	String getInfo() {
		return name + "(" + price + "��)";
	}
}

class Desktop extends Product {

	Desktop(String name, int price) {
		super(name, price);
	}

	void programming() {
		System.out.println("���α׷��� ����ϴ�.");
	}

}

class Aircon extends Product {
	Aircon(String name, int price) {
		super(name, price);
	}

	void setTemperature() {
		System.out.println("�µ��� �����մϴ�.");
	}
}

class TV extends Product {
	TV(String name, int price) {
		super(name, price);
	}

	void setChannel() {
		System.out.println("ä���� �����մϴ�.");
	}
}

class Customer {
	int money = 1000000;

	Product[] item = new Product[100]; // ��ٱ���
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("�ܵ��� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "�� �����ߴ�.");
	}
	
	void showItem(){
		System.out.println("========= ��ٱ��� ==========");
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				break;
			} else {
				System.out.println(item[i].getInfo());
			}
		}
		System.out.println("===========================");
	}
}




