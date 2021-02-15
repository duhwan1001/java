package j_collection;

import java.util.ArrayList;

public class scoreanswer {

	public static void main(String[] args) {
		/*
		 * �츮�� ����� ����, ����, ����, ��ȸ, ����, Oracle, Java ������
		 * 0~100���� �������� �������ֽð�, �̷��� ���� ������ּ���.
		 * 
		 * 			����		����		����		��ȸ		����		Oracle	Java	�հ�		���		����
		 * ȫ�浿		90		90		90		90		90		90		90		630		90.00	1
		 * ȫ�浿		90		90		90		90		90		90		90		630		90.00	1
		 * ȫ�浿		90		90		90		90		90		90		90		630		90.00	1
		 * ȫ�浿		90		90		90		90		90		90		90		630		90.00	1
		 * ȫ�浿		90		90		90		90		90		90		90		630		90.00	1
		 * �����հ�	450		450		450		450		450		450		450
		 * �������	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
				
		ArrayList<String> students = new ArrayList<>();
		students.add("���ȣ");
		students.add("���ǿ�");
		students.add("������");
		students.add("������");
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("����");
		subjects.add("����");
		subjects.add("����");
		subjects.add("��ȸ");
		subjects.add("����");
		subjects.add("Java");
		subjects.add("Oracle");
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			ArrayList<Integer> score = new ArrayList<>();
			for (int j = 0; j < subjects.size(); j++) {
				score.add((int) (Math.random() * 101));
			}
			scores.add(score);
		}

		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		for (int i = 0; i < scores.size(); i++) {
			int sum = 0;
			for (int j = 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double) sum / subjects.size() * 100) / 100.0);
		}

		ArrayList<Integer> ranks = new ArrayList<>();
		for (int i = 0; i < sums.size(); i++) {
			ranks.add(1);
			for (int j = 0; j < sums.size(); j++) {
				if (sums.get(i) < sums.get(j)) {
					ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		for(int i = 0; i < ranks.size() - 1; i++){
			int min = i;
			for(int j = i + 1; j < ranks.size(); j++){
				if(ranks.get(j) < ranks.get(min)){
					min = j;
				}
			}
			
			String tempStudent = students.get(i);
			students.set(i, students.get(min));
			students.set(min, tempStudent);
			
			ArrayList<Integer> tempScore = scores.get(i);
			scores.set(i, scores.get(min));
			scores.set(min, tempScore);
			
			Integer tempSum = sums.get(i);
			sums.set(i, sums.get(min));
			sums.set(min, tempSum);
			
			Double tempAvg = avgs.get(i);
			avgs.set(i, avgs.get(min));
			avgs.set(min, tempAvg);
			
			Integer tempRank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, tempRank);
		}

		ArrayList<Integer> subSums = new ArrayList<>();
		ArrayList<Double> subAvgs = new ArrayList<>();
		for (int i = 0; i < subjects.size(); i++) {
			int sum = 0;
			for (int j = 0; j < students.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add((double) sum / students.size());
		}

		for (int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t�հ�\t���\t����");
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			for (int j = 0; j < scores.get(i).size(); j++) {
				System.out.print("\t" + scores.get(i).get(j));
			}
			System.out.println("\t" + sums.get(i) + "\t" + avgs.get(i) + "\t"
					+ ranks.get(i));
		}
		System.out.print("�����հ�");
		for (int i = 0; i < subSums.size(); i++) {
			System.out.print("\t" + subSums.get(i));
		}
		System.out.print("\n�������");
		for (int i = 0; i < subAvgs.size(); i++) {
			System.out.print("\t" + subAvgs.get(i));
		}
	}

}