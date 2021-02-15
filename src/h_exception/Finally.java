package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 * finally
		 * - �ʿ信 ���� try-catch �ڿ� finally�� �߰��� �� �ִ�.
		 * - finally�� ������ �߻����ο� ������� ���� �������� ����ȴ�.
		 * 
		 * �ڵ� �ڿ� ��ȯ
		 * - try(���� ����; ���� ����) {} catch(Exception e) {}
		 * - ��� �� ��ȯ�� �ʿ��� ��ü�� try�� ()�ȿ��� �����ϸ� try �� ����� �ڵ����� ��ȯ�ȴ�.
		 */
		
		FileInputStream fis = null; // ���� �б�
		
		try {
			fis = new FileInputStream("d:/file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//�ڵ� �ڿ� ��ȯ(JDK 1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str = "������������������������������";
			
			byte[] bytes = str.getBytes();
			
			for(int i = 0; i < bytes.length; i++){
				fos.write(bytes[i]);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
