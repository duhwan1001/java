spackage dditgame;

import E_oop.ScanUtil;

public class dditgame {
	Character c;
	int runcount = 0;
	int smokeCount = 0;
	int dangCount = 0;
	dditgame(){
		c = new Character("�Ʒû�", 100, 20, 20, 5);
	}
	
	public static void main(String[] args) {
		System.out.println("ddit is a game");
		System.out.println("�������� ���� ������ �޶����ϴ�");
		new dditgame().start();
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println();
			System.out.println("==�����ϼ���==");
			System.out.println();
			System.out.println("1.�� ���� || 2.������ �غ��Ѵ�  || 3.�߰������н��� �Ѵ� || 4.������ �Դ´�  || 5.���� �Ϸ�����. || 6.���߿����� ����ģ��.");
			System.out.println();
			input = ScanUtil.nextInt();
			
			switch (input){
			case 1:
				c.showInfo();
				break;
			case 2:
				c.toStudy();
				studyharder();
				break;
			case 3:
				c.toStudyNight();
				studynight();
				break;
				
			case 4:
				c.hp += 10;
				c.dang += 10;
				dangCount++;
				System.out.println();
				System.out.println("���� �����°��� �������ϴ�.");
				System.out.println("����� 10 �����߽��ϴ�.");
				System.out.println("���� 10 �����߽��ϴ�.");
				System.out.println();
				break;
				
			case 5:
				c.hp -= 8;
				c.mp -= 5;
				smokeCount++;
				System.out.println();
				System.out.println("Ȱ���� �������� �Ӹ��� ���������ϴ�.");
				System.out.println("����� 8 �����߽��ϴ�.");
				System.out.println("�Ƿΰ� 5 �����߽��ϴ�.");
				System.out.println();
				break;
				
			case 6:
				runcount++;
				System.out.println();
				System.out.println("������ ����ĥ�� �����ϴ�.");
				break;
			}
		}
	}
	void studyharder(){
		int input = 0;
		run : while(c.classtime < 9){
			System.out.println();
			System.out.println("���� ������ �����ϼ���.");
			System.out.println("1.��\t2.��\t3.��");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				c.high();
				break run;
			case 2:
				c.middle();
				break run;
			case 3:
				c.low();
				break run;
			}
		}
	}
	
	void studynight(){
		int input = 0;
		while(c.classtime >= 9){
			System.out.println();
			System.out.println("�߰������н� �ð��Դϴ�. ��ǽð��� �������ּ���.");
			System.out.println("1.9�ñ��� !\t2.8�ñ��� !\t3.7�ñ��� !");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				c.high();
				home();
				break;
			case 2:
				c.middle();
				home();
				break;
			case 3:
				c.low();
				home();
				break;
			}
		}
	}
	
	void home(){
		System.out.println();
		System.out.println("����� �߰������н��� ��ġ�� ���� �Ͱ��߽��ϴ�. ����ϼ̽��ϴ�.");
		System.out.println();
		System.out.println("����� �������� ���� ����Դϴ�.");
		if(c.hp > 80){ // ���
			System.out.println();
			System.out.println("����� ���� ���߿����� Ȱ���� ���ƽ��ϴ�.");
		} else if(c.hp >= 21 && c.hp <= 79){
			System.out.println();
			System.out.println("����� ���� ���߿����� ���� �׷����ϴ�.");
		} else if(c.hp < 20){
			System.out.println();
			System.out.println("����� ���� ���߿����� ����� �߽��ϴ�.");
		}
		
		if(c.mp > 75){ // �Ƿ�
			System.out.println();
			System.out.println("������ ������ ��� ��ô �ǰ�������.");
		} else if(c.mp <= 75 && c.mp >= 20){
			System.out.println();
			System.out.println("������ ������ ���;����� �ǰ��߰�. ");
		} else if(c.mp <= 20){
			System.out.println();
			System.out.println("�������� ��������.");
		}
		
		if(dangCount > 10){ // ��
			System.out.println();
			System.out.println("�׸��� �� ���� �����մϴ�.");
		} else if(dangCount <= 9 && c.dang >= 1){
			System.out.println();
			System.out.println("���İŸ��� ������ �̱�� ���ؼ� �� �� �Դ�����.");
		} else if(dangCount == 0){
			System.out.println();
			System.out.println("�����Ҷ� ���� �Դ� ���� �����ϴ� ���� �ƴϳ׿�.");
		}
		
		if(smokeCount == 0){ // ��Ƚ��
			System.out.println();
			System.out.println("���� ����� �������Դϴ�.");
		} else if(smokeCount > 2 && smokeCount < 9){
			System.out.println();
			System.out.println("���� �Ƿ��Ҷ� Ȥ�� ������ �ȵɶ����� ��踦 �ǿ�����.");
		} else if(smokeCount > 10){
			System.out.println();
			System.out.println("��踦 �ʹ� ���� �ǿ�ϴ�. 2���� ���½ð��� �ѹ� ������ ����� �� ���׿�.");
		}
		
		if(c.studyPoint > 100){ //���뵵
			System.out.println();
			System.out.println("���� ���ο� �־� ���ص��� ���� ������ ������ ���׿�." + c.studyPoint + "% ��ŭ ���뵵�� �޼��߽��ϴ�.");
		} else if(c.studyPoint > 40 && c.studyPoint < 99){
			System.out.println();
			System.out.println("������ ������ �׷��� �� �ƽ��� ������ ������ ���׿�");
		} else if(c.studyPoint < 40){
			System.out.println();
			System.out.println("������ ���߷��� �־��̿����ϴ�. ������ �� �� ������ �� �� �ֵ��� ����ؾ� �Ұ� ���׿�..");
		}
		System.out.println();
		System.out.println("�׸��� ����� " + runcount + "�� ������簳�߿������� ���ָ� �õ��߽��ϴ�");
		System.out.println();
		System.out.println("���� �����Դϴ�.");
		c.showInfo();
		System.exit(0);
		
	
	}
		

}

