package d_array;

public class scoreanswer {

	public static void main(String[] args) {
		/*
		 * �츮�� ����� ����, ����, ����, ��ȸ, ����, Oracle, Java ������
		 * 0 ~ 100���� �������� �������ֽð�, �Ʒ��� ���� ������ּ���.
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
		
		String[] names = {"������", "�����", "�赿��", "������", "���ο�", "�赿��", "������", "�̿���", "������", "������", "�����"};
		String[] subjects = {"����", "����", "����", "��ȸ", "����", "Oracle", "Java"};
		int[][] score = new int[names.length][subjects.length];
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random() * 101);
			}
		}
		
		int[] nameSum = new int[score.length];
		double[] nameAvg = new double[score.length];
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				nameSum[i] += score[i][j];
			}
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;
		}
		
		int[] subSum = new int[subjects.length];
		double[] subAvg = new double[subjects.length];
		for(int i = 0; i < subjects.length; i++){
			for(int j = 0; j < score.length; j++){
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
		
		//���������� ����(���迡�� �������� ����)
		for(int i = 0; i < nameSum.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < nameSum.length; j++){
				if(nameSum[j] > nameSum[min]){
					min = j;
				}
			}
			int[] temp = score[i];
			score[i] = score[min];
			score[min] = temp;
			
			int temp2 = nameSum[i];
			nameSum[i] = nameSum[min];
			nameSum[min] = temp2;
			
			double temp3 = nameAvg[i];
			nameAvg[i] = nameAvg[min];
			nameAvg[min] = temp3;
			
			int temp4 = rank[i];
			rank[i] = rank[min];
			rank[min] = temp4;
			
			String temp5 = names[i];
			names[i] = names[min];
			names[min] = temp5;
		}
		
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t�հ�\t���\t����");
		for(int i = 0; i < score.length; i++){
			System.out.print(names[i] + "\t");
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		
		System.out.print("�����հ�\t");
		for(int i = 0; i < subSum.length; i++){
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		
		System.out.print("�������\t");
		for(int i = 0; i < subAvg.length; i++){
			System.out.print(subAvg[i] + "\t");
		}
	}
}