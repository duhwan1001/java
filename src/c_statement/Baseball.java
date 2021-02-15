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
				System.out.println("숫자를 재배치합니다.");
			}

		} while (first == second || first == third || second == third);

		System.out.println("숫자 배치가 끝났습니다.");

		int strike = 0;
		int ball = 0;
		int out = 0;

		int answer1;
		int answer2;
		int answer3;

		do {
			System.out.println("첫번째 숫자입니다. 1 ~ 9 사이의 수를 입력해주세요>");
			answer1 = s.nextInt();
			System.out.println("두번째 숫자입니다. 1 ~ 9 사이의 수를 입력해주세요>");
			answer2 = s.nextInt();
			System.out.println("세번째 숫자입니다. 1 ~ 9 사이의 수를 입력해주세요>");
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
				System.out.println("다시 시도해보세요.");
				strike = 0;
				ball = 0;
				out = 0;
			}

		} while (strike != 3); // 정답이 같지 않을동안.

		System.out.println("정답입니다.");

	}

}
