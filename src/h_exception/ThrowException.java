package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * ���� �߻���Ű��
		 * - throw new Exception();
		 * - throw ������ ���� Ŭ������ ��ü�� ���ܸ� ���Ƿ� �߻���ų �� �ִ�.
		 */
		
		IOException ioe = new IOException();
		
		try {
			throw ioe;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
