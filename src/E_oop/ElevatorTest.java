package E_oop;

public class ElevatorTest {

	public static void main(String[] args) {
			
		Elevator elv = new Elevator();

		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.현재 엘리베이터의 층  2.엘리베이터 호출  3.가고싶은 층");
			System.out.println("0.종료");
			System.out.println("-------------------------------");
			System.out.print("번호 입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: elv.currentLocation(); break;
				
			case 2: elv.elvCall();	break;
				
			case 3: elv.selectFloor(); break;
				
			default:
				System.out.println("엘리베이터에서 내립니다.");
				System.exit(0);
				break;
			}
	}

}
}
