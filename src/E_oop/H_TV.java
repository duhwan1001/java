package E_oop;

public class H_TV {
	
	
	/*
	 * ����. ������ �繰�� ������� Ŭ������ ������ּ���.
	 * �繰�� ������ �ִ� �Ӽ��� ������ �����,
	 * ������ ����� ���۵��� �޼���� ������ֽø� �˴ϴ�.
	 */

	boolean power; //����
	int channel; //ä��
	int volume; //����
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	H_TV(){
		power = false;
		channel = 1;
		volume = 5;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV ����" : "TV ����");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("ä��. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel + 1);
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume();
		}
	}
	
	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
			showVolume();
		}
	}
	
	void showVolume(){
		System.out.print("����. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("��");
			}else{
				System.out.print("��");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		H_TV tv = new H_TV();
		
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.����  2.ä�κ���  3.ä�ξ�  4.ä�δٿ�");
			System.out.println("5.������  6.�����ٿ�  0.����");
			System.out.println("-------------------------------");
			System.out.print("��ȣ �Է�>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: tv.power(); break;
				
			case 2:
				System.out.print("������ ä�� �Է�>");
				int ch = ScanUtil.nextInt();
				tv.changeChannel(ch);
				break;
				
			case 3: tv.channelUp(); break;
			case 4: tv.channelDown(); break;
			case 5: tv.volumeUp(); break;
			case 6: tv.volumeDown(); break;
				
			default:
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
				break;
			}
		}
	}
	
}






