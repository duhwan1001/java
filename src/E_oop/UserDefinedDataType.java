package E_oop;

import java.util.Scanner;	//�ٸ� ��Ű���� �ִ� Ŭ������ ����ϱ� ���� �� ��ġ�� �˷��ִ� ��

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * ����� ���� ������ Ÿ��
		 * - �������� ���� ��ȭ �����̴�. (�⺻�� -> �迭 -> Ŭ����)
		 * - ���� �ٸ� Ÿ���� �����͸� ��� ����ϴ� ���̴�.
		 * - ������ �޼���� ������ �� �ִ�.
		 */
		
		//�⺻��
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//�迭
		int[] scores;
		int sum2;
		double avg2;
		String name2;
		
		//Ŭ����
		Student student;
		student = new Student(); //��ü ����(�ν��Ͻ�ȭ)
		
		student.kor = 80;
		student.eng = 90;
		student.math = 60;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "ȫ�浿";
		
		System.out.println(student.name);
		System.out.println(student.avg);
		
		Student student2 = new Student();
		
	}

}

class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}

