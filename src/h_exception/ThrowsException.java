package h_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * �޼��忡 ���� �����ϱ�
		 * - �޼��� ȣ��� �߻��� �� �ִ� ���ܸ� �������� �� �ִ�.
		 * - void method() throws IOException {}
		 * - �޼����� ������ ���� throws ������ ���� Ŭ���������� ���ܸ� ������ �� �ִ�.
		 * - ���ܸ� �����ϸ� ����ó���� ���� �ʰ� �ڽ��� ȣ���� �޼���� ����ó���� �Ѱ��ش�.
		 */
		
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void method() throws IOException {
		throw new IOException();

	}

}
