package E_oop;

public class TV {

	//과제. TV를 대상으로 클래스를 만들어주세요.
	//대상이 가지고있는 특성을 변수로 만듬.
	//전원 on off
	//채널 + - 혹은 입력
	//볼륨 + -
	//리모콘의 버튼을 연상하기
	
	String power;
	int channel = 121;
	int volume = 10;
	
	void powerOn(String on){
		power = on ;
		System.out.println("전원이 켜졌습니다");
	}
	
	void powerOff(String off){
		power = off ;
		System.out.println("전원이 꺼졌습니다.");
	}
	
	void channelUp(){
		channel += 1;
		System.out.println("채널을 1채널 올립니다 현재 채널은" + channel + "입니다.");
	}
	
	void channelDown(){
		channel -= 1;
		System.out.println("채널을 1채널 내립니다 현재 채널은" + channel + "입니다.");
	}
	
	void channelInput(int input){
		channel = input;
		System.out.println("입력한 채널로 바꿉니다.현재 채널은" + channel + "입니다.");
	}
	
	void volumeUp(){
		volume += 1;
		System.out.println("볼륨을 1 올립니다. 현재 볼륨은" + volume + "입니다.");
	}
	
	void volumeDown(){
			volume -= 1;
			System.out.println("볼륨을 1 내립니다. 현재 볼륨은" + volume + "입니다.");		
	}
}
