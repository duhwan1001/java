package E_oop;

public class TV {

	//����. TV�� ������� Ŭ������ ������ּ���.
	//����� �������ִ� Ư���� ������ ����.
	//���� on off
	//ä�� + - Ȥ�� �Է�
	//���� + -
	//�������� ��ư�� �����ϱ�
	
	String power;
	int channel = 121;
	int volume = 10;
	
	void powerOn(String on){
		power = on ;
		System.out.println("������ �������ϴ�");
	}
	
	void powerOff(String off){
		power = off ;
		System.out.println("������ �������ϴ�.");
	}
	
	void channelUp(){
		channel += 1;
		System.out.println("ä���� 1ä�� �ø��ϴ� ���� ä����" + channel + "�Դϴ�.");
	}
	
	void channelDown(){
		channel -= 1;
		System.out.println("ä���� 1ä�� �����ϴ� ���� ä����" + channel + "�Դϴ�.");
	}
	
	void channelInput(int input){
		channel = input;
		System.out.println("�Է��� ä�η� �ٲߴϴ�.���� ä����" + channel + "�Դϴ�.");
	}
	
	void volumeUp(){
		volume += 1;
		System.out.println("������ 1 �ø��ϴ�. ���� ������" + volume + "�Դϴ�.");
	}
	
	void volumeDown(){
			volume -= 1;
			System.out.println("������ 1 �����ϴ�. ���� ������" + volume + "�Դϴ�.");		
	}
}
