package E_oop;

public class Elevator {
	
	boolean elvCall;
	int callElv;
	int buildingFloor = 10;
	int wantFloor;
	
	void currentLocation(){
		callElv = (int)(Math.random() * 10) + 1;
		System.out.println("현재 엘리베이터는 " + callElv + "층에 있습니다.");
	}
	
	Elevator(){
		elvCall = false;
	}
	
	void elvCall(){
		elvCall = !elvCall;
		System.out.println(elvCall ? "엘리베이터를 호출합니다." : "엘리베이터를 호출하지 않으셨습니다.");
		if(elvCall){
			for(int i = callElv; i > 0; i--){
				System.out.println(i);
			}
		}
		System.out.println("엘리베이터가 1층에 도착했습니다. 탑승합니다.");
	}
	
	void selectFloor(){
		System.out.println("이 건물은" + buildingFloor + "층까지 존재합니다. 원하시는 층을 눌러주세요.");
		wantFloor = ScanUtil.nextInt();
		System.out.println(wantFloor + "층을 누르셨습니다." + wantFloor + "층으로 이동합니다.");
		for(int i = 1; i < wantFloor + 1; i++){
			System.out.println(i);
		}
	}

}
