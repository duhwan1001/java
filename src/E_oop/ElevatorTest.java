package E_oop;

public class ElevatorTest {

	public static void main(String[] args) {
			
		Elevator elv = new Elevator();

		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.���� ������������ ��  2.���������� ȣ��  3.������� ��");
			System.out.println("0.����");
			System.out.println("-------------------------------");
			System.out.print("��ȣ �Է�>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: elv.currentLocation(); break;
				
			case 2: elv.elvCall();	break;
				
			case 3: elv.selectFloor(); break;
				
			default:
				System.out.println("���������Ϳ��� �����ϴ�.");
				System.exit(0);
				break;
			}
	}

}
}
