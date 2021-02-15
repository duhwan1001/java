package j_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		//List, Map, Set
		
		/*
		 * boolean add(Object obj) : ������ ��ġ�� ��ü�� �߰� �� �������θ� ��ȯ�Ѵ�.
		 * void add(int index, Object obj) : ������ ��ġ�� ��ü�� �߰��Ѵ�.
		 * Object set(int index, Object obj) : ������ ��ġ�� ��ü�� ���� �� ���� ��ü�� ��ȯ�Ѵ�.
		 * Object get(int index) : ������ ��ġ�� ��ü�� ��ȯ�Ѵ�.
		 * int size() : ����� ��ü�� ���� ��ȯ�Ѵ�.
		 * boolean remove(int index) : ������ ��ġ�� ��ü�� �����Ѵ�.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		//���׸��� �������� ������ �������� ���ϳ� �������� Ÿ���� �����ϱ� �����.
		//���� ���׸��� ����� ����ȴ�.
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		//list.add("1"); --integerŸ�Ը� �����
		list.add(20);
		System.out.println(list.add(30)); //���� �������� ��ȯ
		System.out.println(list);
		
		list.add(1, 40); //(�ε����� ��ġ, �����ϰ� ���� ��) ���������� �ڷ� �и�
		System.out.println(list);
		
		//list.add(7, 50); --���� �ε����� �������� ����
		
		Integer before = list.set(2, 50); // 2�� �ε����� ���� �����ϰ� ���� ���� ��ȯ�Ѵ�.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
		//for(int i = 0; i < list.size(); i++){
		//	System.out.println(i + " : " + list.get(i));
		//	list.remove(i);
		//}
		//System.out.println(list); //������� [40, 30] ���� ������ ���� : �������鼭 size�� �پ��� ������
		
		//���� ���� �� ���� �ڿ������� �����ؾ� �Ѵ�.
		for(int i = list.size() - 1; 0 <= i; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
		
		//list�� 1���� 100���� �������� 10�� �������ּ���.
		
		for(int i = 0; i < 10; i++){
			int random = (int)(Math.random() * 100) + 1;
			list.add(random);
		}
		System.out.println(list);
		
		//list�� ����� ���� �հ�� ����� �����ּ���.
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
		System.out.println("�հ� : " + sum + " ��� : " + avg);
		
		//list���� �ּҰ��� �ִ밪�� �����ּ���.
		//int min = 0;
		//int max = 0;
		//for(int i = 0; i < list.size(); i++){
		//	for(int j = i+1; j < list.size(); j++){
		//		if(list.get(i) > list.get(j)){
		//			min = list.get(j);
		//			max = list.get(i);
		//		}
		//	}
		//}
		//		System.out.println("�ּҰ� : " + min + " �ִ밪 : " + max );
		
		//int min = list.get(0);
		//int max = list.get(0);
		//for(int i = 0; i < list.size(); i++){
		//	if(list.get(i) > min){
		//		max = list.get(i);
		//	}
		//	if(list.get(i) < max){
		//		min = list.get(i);
		//	}
		//}
		//System.out.println("�ּҰ� : " + min + " �ִ밪 : " + max );
		
		//list�� ������������ �������ּ���
		//��������
		for (int i = 0; i < list.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(min)) {
					min = j;
				}
			}
			int temp = list.get(i);		//int temp = arr[i];
			list.set(i, list.get(min));	//arr[i] = arr[min];
			list.set(min, temp);		//arr[min] = temp;
		}
		System.out.println(list);
		
		//2����
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list2.add(list);
		list.add(40);
		list.add(50);
		
		list2.get(0).add(70); //�迭���� �迭�� �߰�
		
		ArrayList<Integer> templist = list2.get(0);
		list2.set(0, list2.get(1));
		list2.set(1, templist);		//��ġ�ٲٱ�
		
		Collections.sort(list); //�������� ����
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> li = list2.get(i);
			for(int j = 0; j < li.size(); j++){
				System.out.println(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i < list2.size(); i++){
			for(int j = 0; j < list2.get(i).size(); j++){
				System.out.println(list2.get(i).get(j));
			}
		}
	}

}












