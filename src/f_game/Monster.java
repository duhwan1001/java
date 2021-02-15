package f_game;

public class Monster {
	
	String name;  //�̸�
	int maxHp;    //�ִ� ü��
	int maxMp;    //�ִ� ����
	int hp; 	  //ü��
	int mp; 	  //����
	int att;	  //���ݷ�
	int def;	  //����
	Item[] items; //���� ������
	
	Monster(String name, int hp, int mp, int att, int def, Item[] items){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.items = items;
	}
	
	void attack(Character c){
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp = c.hp < damage ? c.hp : c.hp - damage;
		System.out.println(name + "�� ��������" + c.name + "����" + damage + "��ŭ �������� �־����ϴ�.");
		System.out.println(c.name + "�� ���� HP :" + c.hp);
	}
	
	Item itemDrop(){
		return items[(int)(Math.random() * items.length)];
	}
}
