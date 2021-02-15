package dditgame;

public class Character {
	
	String name; // �̸�
	int hp; // ���
	int mp; // �Ƿ�
	int dang; // ��
	int studyPoint; // ���뵵
	int classtime = 0; // ����
	
	Character(String name, int hp, int mp, int dang, int studyPoint){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.dang = dang;
		this.studyPoint = studyPoint;
	}
	
	//�� ����
	void showInfo(){
		System.out.println();
		System.out.println("===============================");
		System.out.println("-------------����---------------");
		System.out.println("�̸� : " + name);
		System.out.println("��� : " + hp);
		System.out.println("�Ƿ� : " + mp);
		System.out.println("�� : " + dang);
		System.out.println("���뵵 : " + studyPoint + "%");
		System.out.println("===============================");
	}
	
	//1 ~ 8 ����
	String subject;
	void toStudy(){
		classtime++;
		if(classtime < 5){
			subject = "SQL";
			System.out.println();
			System.out.println(classtime + "���� �Դϴ�.");
			System.out.println();
			System.out.println(classtime + "���� ������" + subject + "�Դϴ�");
		} else if(classtime < 9) {
			subject = "JAVA";
			System.out.println();
			System.out.println(classtime + "���� �Դϴ�.");
			System.out.println();
			System.out.println(classtime + "���� ������" + subject + "�Դϴ�");
		} else{
			System.out.println();
			System.out.println("������ ������ �� �̻� �����Ҽ� �����ϴ�.");
			System.out.println("�߰������н��� �����մϴ�.");
		}
	}
	//�߰������н�
	void toStudyNight(){
		if(classtime < 9){
			System.out.println();
			System.out.println("������ �߰������н��� �����Ҽ� �����ϴ�.");
		} else{
			System.out.println();
			System.out.println("�߰������н��� �����մϴ�.");
		}
	}
	
	//���ߵ� ��
	void high(){
		hp -= 10;
		mp += 10;
		studyPoint += 15;
		System.out.println();
		System.out.println("����� 10 �����߽��ϴ�.");
		System.out.println("�Ƿΰ� 10 ����߽��ϴ�.");
		System.out.println("���뵵�� 15 ����߽��ϴ�.");
	}
	//���ߵ� ��
	void middle(){
		hp -= 5;
		mp += 5;
		studyPoint += 10;
		System.out.println();
		System.out.println("����� 5 �����߽��ϴ�.");
		System.out.println("�Ƿΰ� 5 ����߽��ϴ�.");
		System.out.println("���뵵�� 10 ����߽��ϴ�.");
	}
	//���ߵ� ��
	void low(){
		hp += 5;
		mp -= 5;
		studyPoint += 5;
		System.out.println();
		System.out.println("����� 5 ����߽��ϴ�.");
		System.out.println("�Ƿΰ� 5 �����߽��ϴ�.");
		System.out.println("���뵵�� 5 ����߽��ϴ�.");
	}
}
