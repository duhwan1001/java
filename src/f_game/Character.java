package f_game;

public class Character {

	
	String name;  //�̸�
	int maxHp;    //�ִ� ü��
	int maxMp;    //�ִ� ����
	int hp; 	  //ü��
	int mp; 	  //����
	int att;	  //���ݷ�
	int def;	  //����
	int level;    //����
	int exp; 	  //����ġ
	Item[] items; //���� ������
	
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void showInfo(){
		System.out.println("===============================");
		System.out.println("-------------����---------------");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + level + "(" + exp + "/100");
		System.out.println("ü�� : " + hp + "/" + maxHp);
		System.out.println("���� : " + mp + "/" + maxMp);
		System.out.println("���� : " + att);
		System.out.println("��� : " + def);
		System.out.println("------------������---------------");
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
		}
		System.out.println("===============================");
	}
	
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp : m.hp - damage;
		System.out.println(name + "�� ��������" + m.name + "����" + damage + "��ŭ �������� �־����ϴ�.");
		System.out.println(m.name + "�� ���� HP :" + m.hp);
	}
	
	void apattack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp : m.hp - damage;
		System.out.println(name + "�� ��������" + m.name + "����" + damage + "��ŭ �������� �־����ϴ�.");
		System.out.println(m.name + "�� ���� HP :" + m.hp);
	}
	
	void getExp(int exp){
		System.out.println(exp + "�� ����ġ�� ȹ���Ͽ����ϴ�.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	void getHp(Character c){
		c.hp = 100;
		System.out.println("ü���� ���� á���ϴ�.");
	}
	void getMp(Character c){
		c.mp = 50;
		System.out.println("������ ���� á���ϴ�.");
	}
	
	void levelUp(){
		level++;
		maxHp += 10;
		maxMp += 10;
		att += 2;
		def += 2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("Level Up");
	}
	
	void getItem(Item item){
		System.out.println(item.name + "�� ȹ���ϼ̽��ϴ�.");
		for(int i = 0; i < items.length; i++){
			if(items[i] == null){ //��ĭã��
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	}	
}