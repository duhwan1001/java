package b_operator;
import java.util.Scanner;

public class ricetest {

	public static void main(String[] args) {

		int sum = 0;

		Scanner start = new Scanner(System.in);
		System.out.println("탄수화물 중독 테스트입니다. 문항에 해당할시 1, 아니라면 0을 넣어주세요. 1을 넣으면 시작합니다.");
		int start_val = Integer.parseInt(start.nextLine());
		if (start_val == 1) {
			System.out.println("시작");
		}
		Scanner g1 = new Scanner(System.in);
		System.out.println("아침을 배불리 먹은후 점심시간 전에 배가 고프다.>");
		int r1 = Integer.parseInt(g1.nextLine());
		if (r1 == 1) {
			sum += 1;
		}
		Scanner g2 = new Scanner(System.in);
		System.out.println("밥, 빵, 과자 등 음식을 먹기 싲가하면 끝이 없다.>");
		int r2 = Integer.parseInt(g2.nextLine());
		if (r2 == 1) {
			sum += 1;
		}
		Scanner g3 = new Scanner(System.in);
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고..>");
		int r3 = Integer.parseInt(g3.nextLine());
		if (r3 == 1) {
			sum += 1;
		}
		Scanner g4 = new Scanner(System.in);
		System.out.println("정말 배고프지 않더라도..>");
		int r4 = Integer.parseInt(g4.nextLine());
		if (r4 == 1) {
			sum += 1;
		}
		Scanner g5 = new Scanner(System.in);
		System.out.println("저녁을 먹고...>");
		int r5 = Integer.parseInt(g5.nextLine());
		if (r5 == 1) {
			sum += 1;
		}
		Scanner g6 = new Scanner(System.in);
		System.out.println("스트레스를 받으면..>");
		int r6 = Integer.parseInt(g6.nextLine());
		if (r6 == 1) {
			sum += 1;
		}
		Scanner g7 = new Scanner(System.in);
		System.out.println("책상이나 식탁 위에..>");
		int r7 = Integer.parseInt(g7.nextLine());
		if (r7 == 1) {
			sum += 1;
		}
		Scanner g8 = new Scanner(System.in);
		System.out.println("오후 5시가 되면..>");
		int r8 = Integer.parseInt(g8.nextLine());
		if (r8 == 1) {
			sum += 1;
		}
		Scanner g9 = new Scanner(System.in);
		System.out.println("과자, 초콜릿 등...>");
		int r9 = Integer.parseInt(g9.nextLine());
		if (r9 == 1) {
			sum += 1;
		}
		Scanner g10 = new Scanner(System.in);
		System.out.println("다이어트를 위해..>");
		int r10 = Integer.parseInt(g10.nextLine());
		if (r10 == 1) {
			sum += 1;
		}
		if (sum <= 3) {
			System.out.println("주의 단계입니다.");
		} else if (sum >= 4) {
			System.out.println("위험 단계입니다.");
		} else if (sum >= 7) {
			System.out.println("중독 단계입니다.");
		}
		System.out.println(sum);
	}

}