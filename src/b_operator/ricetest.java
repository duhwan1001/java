package b_operator;
import java.util.Scanner;

public class ricetest {

	public static void main(String[] args) {

		int sum = 0;

		Scanner start = new Scanner(System.in);
		System.out.println("ź��ȭ�� �ߵ� �׽�Ʈ�Դϴ�. ���׿� �ش��ҽ� 1, �ƴ϶�� 0�� �־��ּ���. 1�� ������ �����մϴ�.");
		int start_val = Integer.parseInt(start.nextLine());
		if (start_val == 1) {
			System.out.println("����");
		}
		Scanner g1 = new Scanner(System.in);
		System.out.println("��ħ�� ��Ҹ� ������ ���ɽð� ���� �谡 ������.>");
		int r1 = Integer.parseInt(g1.nextLine());
		if (r1 == 1) {
			sum += 1;
		}
		Scanner g2 = new Scanner(System.in);
		System.out.println("��, ��, ���� �� ������ �Ա� �밡�ϸ� ���� ����.>");
		int r2 = Integer.parseInt(g2.nextLine());
		if (r2 == 1) {
			sum += 1;
		}
		Scanner g3 = new Scanner(System.in);
		System.out.println("������ �ݹ� ���� �Ŀ��� ���������� ���ϰ�..>");
		int r3 = Integer.parseInt(g3.nextLine());
		if (r3 == 1) {
			sum += 1;
		}
		Scanner g4 = new Scanner(System.in);
		System.out.println("���� ������� �ʴ���..>");
		int r4 = Integer.parseInt(g4.nextLine());
		if (r4 == 1) {
			sum += 1;
		}
		Scanner g5 = new Scanner(System.in);
		System.out.println("������ �԰�...>");
		int r5 = Integer.parseInt(g5.nextLine());
		if (r5 == 1) {
			sum += 1;
		}
		Scanner g6 = new Scanner(System.in);
		System.out.println("��Ʈ������ ������..>");
		int r6 = Integer.parseInt(g6.nextLine());
		if (r6 == 1) {
			sum += 1;
		}
		Scanner g7 = new Scanner(System.in);
		System.out.println("å���̳� ��Ź ����..>");
		int r7 = Integer.parseInt(g7.nextLine());
		if (r7 == 1) {
			sum += 1;
		}
		Scanner g8 = new Scanner(System.in);
		System.out.println("���� 5�ð� �Ǹ�..>");
		int r8 = Integer.parseInt(g8.nextLine());
		if (r8 == 1) {
			sum += 1;
		}
		Scanner g9 = new Scanner(System.in);
		System.out.println("����, ���ݸ� ��...>");
		int r9 = Integer.parseInt(g9.nextLine());
		if (r9 == 1) {
			sum += 1;
		}
		Scanner g10 = new Scanner(System.in);
		System.out.println("���̾�Ʈ�� ����..>");
		int r10 = Integer.parseInt(g10.nextLine());
		if (r10 == 1) {
			sum += 1;
		}
		if (sum <= 3) {
			System.out.println("���� �ܰ��Դϴ�.");
		} else if (sum >= 4) {
			System.out.println("���� �ܰ��Դϴ�.");
		} else if (sum >= 7) {
			System.out.println("�ߵ� �ܰ��Դϴ�.");
		}
		System.out.println(sum);
	}

}