package E_oop;

public class TVtest {

	public static void main(String[] args) {
		
		TV tv = new TV();

		tv.powerOn("on");
		tv.powerOff("on");
		
		tv.channelUp();
		tv.channelUp();
		
		tv.channelDown();
		tv.channelDown();
		
		tv.channelInput(157);
		
		tv.volumeUp();
		tv.volumeDown();
	}

}
