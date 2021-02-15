package c_statement;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int first = (int) (Math.random() * 9) + 1;
		int second = (int) (Math.random() * 9) + 1;
		int third = (int) (Math.random() * 9) + 1;

		do {
			first = (int) (Math.random() * 9) + 1;
			second = (int) (Math.random() * 9) + 1;
			third = (int) (Math.random() * 9) + 1;

			if (first == second || first == third || second == third) {
				System.out.println("���ڸ� ���ġ�մϴ�.");
			}

		} while (first == second || first == third || second == third);

		System.out.println("���� ��ġ�� �������ϴ�.");

		int strike = 0;
		int ball = 0;
		int out = 0;

		int answer1;
		int answer2;
		int answer3;

		do {
			System.out.println("ù��° �����Դϴ�. 1 ~ 9 ������ ���� �Է����ּ���>");
			answer1 = s.nextInt();
			System.out.println("�ι�° �����Դϴ�. 1 ~ 9 ������ ���� �Է����ּ���>");
			answer2 = s.nextInt();
			System.out.println("����° �����Դϴ�. 1 ~ 9 ������ ���� �Է����ּ���>");
			answer3 = s.nextInt();

			if (first == answer1) {
				strike++;
			} else if (answer1 == second || answer1 == third) {
				ball++;
			} else {
				out++;
			}

			if (second == answer2) {
				strike++;
			} else if (answer2 == first || answer2 == third) {
				ball++;
			} else {
				out++;
			}

			if (third == answer3) {
				strike++;
			} else if (answer3 == first || answer3 == second) {
				ball++;
			} else {
				out++;
			}

			System.out.println(strike + "S" + ball + "b" + out + "o");

			if (first != answer1 || second != answer2 || third != answer3) {
				System.out.println("�ٽ� �õ��غ�����.");
				strike = 0;
				ball = 0;
				out = 0;
			}

		} while (strike != 3); // ������ ���� ��������.

		System.out.println("�����Դϴ�.");

	}

}
