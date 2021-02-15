package f_game;

public class MyGame {
	Character c;
	Item[] items;
	
	MyGame(){
		c = new Character("����", 100, 50, 20, 10);
		
		items = new Item[10];
		items[0] = new Item("�����Ǵ��", 0, 0, 10, 0);
		items[1] = new Item("���ð���", 0, 0, 0, 10);
	}
	
	public static void main(String[] args) {
		new MyGame().start();
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println("1.������\t2.���\t3.����\t4.����");
			input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				c.showInfo();
				break;
				
			case 2:
				hunt();
				break;
				
			case 3:
				healing();
				break;
				
			case 4:
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
		}
	}
	void hunt(){
		Monster m = new Monster("���", 20, 10, 15, 10, new Item[]{items[0], items[1]});
		System.out.println(m.name + "�� �������ϴ�. ������ �����մϴ�.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.����\t2.����\t3.����");
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				c.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "�� óġ�Ͽ����ϴ�.");
					c.getExp(150);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				c.apattack(m);
				c.mp -= 10;
				if(m.hp <= 0){
					System.out.println(m.name + "�� óġ�Ͽ����ϴ�.");
					c.getExp(150);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 3:
				break battle;
			}
		}
	}
	
	void healing(){
		System.out.println("� ������ �ʿ�� �Ͻʴϱ�?");
		int input = 0;
		healing : while(true){
			System.out.println("1.HP\t2.MP\t3.���ư���");
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				c.getHp(c);
				break;
			case 2:
				c.getMp(c);
				break;
			case 3:
				break healing;
			}
			
		}
	}
}
