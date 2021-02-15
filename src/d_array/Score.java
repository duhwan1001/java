package d_array;

import java.util.Arrays;

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
		
		// �л� 22��
		
		
		String[] names = new String[]{"�����", "������", "������", "������", "���ȯ", "������", "������", "�̱���", "�ڿ���", "���ǿ�", "���ȣ", "�ڻ�", "���ַ�", "������", "�ֿ���", "������", "������", "������", "������", "������", "�����", "������"};
		String[] subjects = {"����", "����", "����", "��ȸ", "����", "Oracle", "Java"};
		int[][] score = new int[names.length][subjects.length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		} // �л� 22�� * ���� 7���� ����.
		
		int[] nameSum = new int[score.length];
		double[] nameAvg = new double[score.length];
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				nameSum[i] += score[i][j]; // �� �� ���� �������� !!
			}
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0; // �Ҽ��� ���̰� �Ϸ���
		} // ���� ���� �հ�� ����� ����.
		
		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		for(int i = 0; i < subjects.length; i++){
			for(int j = 0; j < score.length; j++){ // 1���׸� 22��... 2���׸� 22��...
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
		System.out.print("\t�հ�\t���\t����");
		for(int i = 0; i < score.length; i++){
			System.out.print(names[i] + "\t");
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}

		System.out.print("�����հ�\t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();

		System.out.print("�������\t");
		for (int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i] + "\t");
		}
	}

}
