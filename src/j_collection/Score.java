package j_collection;

import java.util.ArrayList;

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
		
		//학생 10명
		ArrayList<String> names = new ArrayList<>();
		names.add("김민지");
		names.add("서주형");
		names.add("최윤성");
		names.add("변형균");
		names.add("김두환");
		names.add("현유진");
		names.add("김현슬");
		names.add("이광렬");
		names.add("박예진");
		names.add("명민호");
		
		//과목 7개
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		//2차원
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		
		//랜덤생성
		for (int i = 0; i < names.size(); i++) {
			ArrayList<Integer> list = new ArrayList<>();
			score.add(list);
			for (int j = 0; j < subjects.size(); j++) {
				int random = (int)(Math.random() * 101);
				list.add(random);
			}
		}
		
		//개인별 과목 총합
		ArrayList<Integer> sum = new ArrayList<>();
		ArrayList<Double> avg = new ArrayList<>();
		for(int i = 0; i < score.size(); i++){
			int stusum = 0;
			double stuavg = 0;
			for(int j = 0; j < score.get(j).size(); j++){
				stusum += score.get(i).get(j);
				stuavg = Math.round((double)stusum / score.get(i).size() * 100) / 100.0; // 소수점 보이게 하려고
			} 
			sum.add(i,stusum);
			avg.add(i,stuavg);
		}
		
		//석차
		ArrayList<Integer> rank = new ArrayList<>();
		for(int i = 0; i < sum.size(); i++){
			rank.add(1);
			for(int j = 0; j + 1 < sum.size(); j++){
				if(sum.get(i) < sum.get(j)){
					rank.set(i, rank.get(i) + 1);
				}
			}
		}
		
		//과목별 합계와 평균
		ArrayList<Integer> subsum = new ArrayList<>();
		ArrayList<Double> subavg = new ArrayList<>();
		for(int i = 0; i < score.get(i).size(); i++){
			int subsum1 = 0;
			for(int j = 0; j < score.size(); j++){
				subsum1 += score.get(j).get(i);
			}
			subsum.add(subsum1);
			subavg.add((double)(Math.round((double)subsum1 / names.size() * 100) / 100));
		}	
		System.out.println(subavg);
		
		//출력
		for(int i = 0; i < subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.print("\t합계\t평균\t석차");
		for(int i = 0; i < names.size(); i++){
			System.out.print(names.get(i));
			for(int j = 0; j < subjects.size(); j++){
				System.out.print("\t" + sum);
			}
//			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
//
//		System.out.print("과목합계\t");
//		for (int i = 0; i < subSum.length; i++) {
//			System.out.print(subSum[i] + "\t");
//		}
//		System.out.println();
//
//		System.out.print("과목평균\t");
//		for (int i = 0; i < subAvg.length; i++) {
//			System.out.print(subAvg[i] + "\t");	
	}
}