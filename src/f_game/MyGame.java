package f_game;

public class MyGame {
	Character c;
	Item[] items;
	
	MyGame(){
		c = new Character("가렌", 100, 50, 20, 10);
		
		items = new Item[10];
		items[0] = new Item("무한의대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);
	}
	
	public static void main(String[] args) {
		new MyGame().start();
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println("1.내정보\t2.사냥\t3.물약\t4.종료");
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
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	void hunt(){
		Monster m = new Monster("고블린", 20, 10, 15, 10, new Item[]{items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.마공\t3.도망");
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				c.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "을 처치하였습니다.");
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
					System.out.println(m.name + "을 처치하였습니다.");
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
		System.out.println("어떤 물약을 필요로 하십니까?");
		int input = 0;
		healing : while(true){
			System.out.println("1.HP\t2.MP\t3.돌아가기");
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
