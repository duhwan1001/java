package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*
		 * �츮�� ����� ����, ����, ����, ��ȸ, ����, oracle, java ������
		 * 0~100���� �������� �����ϰ�, �Ʒ��� ���� ����� �ּ���.
		 * 
		 * 		 ����	 ����	  ����	 ��ȸ	����	oracle	java	�հ�	���	����
		 * ȫ�浿	 90	 90	 90	90	90	90		90		630	90	1
		 * ȫ�浿	 90	 90	 90	90	90	90		90		630	90	1
		 * ȫ�浿	 90	 90	 90	90	90	90		90		630	90	1
		 * ȫ�浿	 90	 90	 90	90	90	90		90		630	90	1
		 * ȫ�浿	 90	 90	 90	90	90	90		90		630	90	1
		 * �����հ� 450 450 450 450 450 450 450
		 * ������� 90 90 90 90 90 90 90
		 */
		
		//�л� 10��
		ArrayList<String> names = new ArrayList<>();
		names.add("�����");
		names.add("������");
		names.add("������");
		names.add("������");
		names.add("���ȯ");
		names.add("������");
		names.add("������");
		names.add("�̱���");
		names.add("�ڿ���");
		names.add("���ȣ");
		
		//���� 7��
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("����");
		subjects.add("����");
		subjects.add("����");
		subjects.add("��ȸ");
		subjects.add("����");
		subjects.add("Oracle");
		subjects.add("Java");
		
		//2����
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		
		//��������
		for (int i = 0; i < names.size(); i++) {
			ArrayList<Integer> list = new ArrayList<>();
			score.add(list);
			for (int j = 0; j < subjects.size(); j++) {
				int random = (int)(Math.random() * 101);
				list.add(random);
			}
		}
		
		//���κ� ���� ����
		ArrayList<Integer> sum = new ArrayList<>();
		ArrayList<Double> avg = new ArrayList<>();
		for(int i = 0; i < score.size(); i++){
			int stusum = 0;
			double stuavg = 0;
			for(int j = 0; j < score.get(j).size(); j++){
				stusum += score.get(i).get(j);
				stuavg = Math.round((double)stusum / score.get(i).size() * 100) / 100.0; // �Ҽ��� ���̰� �Ϸ���
			} 
			sum.add(i,stusum);
			avg.add(i,stuavg);
		}
		
		//����
		ArrayList<Integer> rank = new ArrayList<>();
		for(int i = 0; i < sum.size(); i++){
			rank.add(1);
			for(int j = 0; j + 1 < sum.size(); j++){
				if(sum.get(i) < sum.get(j)){
					rank.set(i, rank.get(i) + 1);
				}
			}
		}
		
		//���� �հ�� ���
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
		
		//���
		for(int i = 0; i < subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.print("\t�հ�\t���\t����");
		for(int i = 0; i < names.size(); i++){
			System.out.print(names.get(i));
			for(int j = 0; j < subjects.size(); j++){
				System.out.print("\t" + sum);
			}
//			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
//
//		System.out.print("�����հ�\t");
//		for (int i = 0; i < subSum.length; i++) {
//			System.out.print(subSum[i] + "\t");
//		}
//		System.out.println();
//
//		System.out.print("�������\t");
//		for (int i = 0; i < subAvg.length; i++) {
//			System.out.print(subAvg[i] + "\t");	
	}
}