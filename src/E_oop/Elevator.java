package E_oop;

public class Elevator {
	
	boolean elvCall;
	int callElv;
	int buildingFloor = 10;
	int wantFloor;
	
	void currentLocation(){
		callElv = (int)(Math.random() * 10) + 1;
		System.out.println("���� ���������ʹ� " + callElv + "���� �ֽ��ϴ�.");
	}
	
	Elevator(){
		elvCall = false;
	}
	
	void elvCall(){
		elvCall = !elvCall;
		System.out.println(elvCall ? "���������͸� ȣ���մϴ�." : "���������͸� ȣ������ �����̽��ϴ�.");
		if(elvCall){
			for(int i = callElv; i > 0; i--){
				System.out.println(i);
			}
		}
		System.out.println("���������Ͱ� 1���� �����߽��ϴ�. ž���մϴ�.");
	}
	
	void selectFloor(){
		System.out.println("�� �ǹ���" + buildingFloor + "������ �����մϴ�. ���Ͻô� ���� �����ּ���.");
		wantFloor = ScanUtil.nextInt();
		System.out.println(wantFloor + "���� �����̽��ϴ�." + wantFloor + "������ �̵��մϴ�.");
		for(int i = 1; i < wantFloor + 1; i++){
			System.out.println(i);
		}
	}

}
