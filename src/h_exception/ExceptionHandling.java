package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ����
		 * - ������ ���� : ������ �ÿ� �߻��Ǵ� ����(������)
		 * - ���� ���� : ������ ������, �ǵ��� �ٸ��� �����ϴ� ��(����)
		 * - ��Ÿ�� ���� : ���� �ÿ� �߻��Ǵ� ����
		 * 
		 * ��Ÿ�� ����
		 * - ��Ÿ�� ���� �߻��� �߻��� ��ġ���� ���α׷��� ������������ ����ȴ�.
		 * - ���� : ���α׷� �ڵ忡 ���� ������ �� ���� �ɰ��� ����(ó�� �Ұ�)
		 * - ���� : ���α׷� �ڵ忡 ���ؼ� ������ �� �ִ� �ټ� �̾��� ����(ó�� ����)
		 * 
		 * ����
		 * - ��� ���ܴ� Exception Ŭ������ �ڽ� Ŭ�����̴�.
		 * - RuntimeException Ŭ������ �� �ڽĵ��� ����ó���� �������� �ʴ´�.
		 * - [RuntimeException Ŭ������ �� �ڽĵ��� ������] Exception Ŭ������ �ڽĵ��� ����ó���� �����ȴ�.
		 * 
		 * ����ó��(try-catch)
		 * - ����ó���� ���� ���α׷��� ������������ ����Ǵ� ���� ������ �� �ִ�.
		 * - try {} catch(Exception e) {}
		 * - try �� ���� ������ ���� �� ���ܰ� �߻��ϸ� catch�� �Ѿ��.
		 * - catch�� ()�ȿ��� ó���� ���ܸ� �������� �� �ִ�.
		 * - ���� ������ ���ܸ� ó���� �� �ֵ��� catch�� �ϳ� �̻� �� �� �ִ�.
		 * - �߻��� ���ܿ� ��ġ�ϴ� catch ������ ������ ����� �� try-catch�� ����������.
		 * - �߻��� ���ܿ� ��ġ�ϴ� catch �� ���� ��� ���ܴ� ó������ �ʴ´�.
		 */
		
		try {
			int result = 10 / 0;
			System.out.println(result);

		} catch (ArithmeticException e) {
			e.printStackTrace();

		} catch (NullPointerException | IndexOutOfBoundsException e) {
			// IndexOutOfBoundsException = �迭 �����̴�.
			int[] arr = new int[10]; // 0 - 9
			System.out.println(arr[10]); // ����

			// NullPointerException = ���ڿ� ����
			String str = null; // �ƹ��͵� ������� ������.
			System.out.println(str.equals(""));

		} catch (Exception e) {

		}
		// �ڹ� lang ��Ű���ȿ� �ִ°��� import ���� �ʾƵ� �ȴ�.

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/*
		 * CallStack | | |__test2()__| |__test1()__| |__main()___|
		 * 
		 * �ؿ������� ä����.
		 */

		test1();

	}

	private static void test1() {
		test2();
	}

	private static void test2() {
		// System.out.println(10 / 0);

		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}






