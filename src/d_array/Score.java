package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, oracle, java 점수를
		 * 0~100까지 랜덤으로 생성하고, 아래와 같이 출력해 주세요.
		 * 
		 * 		 국어	 영어	  수학	 사회	과학	oracle	java	합계	평균	석차
		 * 홍길동	 90	 90	 90	90	90	90		90		630	90	1
		 * 홍길동	 90	 90	 90	90	90	90		90		630	90	1
		 * 홍길동	 90	 90	 90	90	90	90		90		630	90	1
		 * 홍길동	 90	 90	 90	90	90	90		90		630	90	1
		 * 홍길동	 90	 90	 90	90	90	90		90		630	90	1
		 * 과목합계 450 450 450 450 450 450 450
		 * 과목평균 90 90 90 90 90 90 90
		 */
		
		// 학생 22명
		
		
		String[] names = new String[]{"김민지", "서주형", "최윤성", "변형균", "김두환", "현유진", "김현슬", "이광렬", "박예진", "강건우", "명민호", "박상영", "이휘로", "김현태", "최영준", "정영인", "정유진", "공슬기", "김이현", "전윤주", "전재수", "유은지"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		int[][] score = new int[names.length][subjects.length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		} // 학생 22명 * 과목 7개를 구함.
		
		int[] nameSum = new int[score.length];
		double[] nameAvg = new double[score.length];
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				nameSum[i] += score[i][j]; // 행 과 열로 생각하자 !!
			}
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0; // 소수점 보이게 하려고
		} // 개인 점수 합계와 평균을 구함.
		
		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		for(int i = 0; i < subjects.length; i++){
			for(int j = 0; j < score.length; j++){ // 1번항목 22번... 2번항목 22번...
				subSum[i] += score[j][i];
			}
			subAvg[i] = Math.round((double)subSum[i] / score.length * 100) / 100.0;
		}
		
		int[] rank = new int[score.length];
		for(int i = 0; i < score.length; i++){
			rank[i] = 1;
			for(int j = 0; j < score.length; j++){
				if(nameSum[i] < nameSum[j]){
					rank[i]++;
				}
			}
		}
		
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.print("\t합계\t평균\t석차");
		for(int i = 0; i < score.length; i++){
			System.out.print(names[i] + "\t");
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}

		System.out.print("과목합계\t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();

		System.out.print("과목평균\t");
		for (int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i] + "\t");
		}
	}

}
