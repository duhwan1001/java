package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList�� HashMap�� ����� �Խ��� ���̺��� �����,
		 * ��ȸ, ���, ����, ������ ������ �Խ����� ������ּ���.
		 * 
		 * ��ȣ(PK), ����, ����, �ۼ���, �ۼ���
		 * 
		 * ------------------------------
		 * ��ȣ	����		�ۼ���	�ۼ���
		 * ------------------------------
		 * 1	�ȳ��ϼ���	ȫ�浿	2/9
		 * 1	�ȳ��ϼ���	ȫ�浿	2/9
		 * 1	�ȳ��ϼ���	ȫ�浿	2/9
		 * 1	�ȳ��ϼ���	ȫ�浿	2/9
		 * ------------------------------
		 * 1.��ȸ	2.���	3.����
		 * 
		 * ��ȸ �� ����, ���� ����
		 */
		ArrayList<HashMap<String, Object>> board = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);

		while(true){
			System.out.println("------------�Խ���-------------");
			System.out.println("��ȣ\t����\t�ۼ���\t�ۼ���");
			System.out.println("----------------------------");
			for(int i = 0; i < board.size(); i++){
				System.out.println(board.get(i).get("��ȣ") + "\t" + board.get(i).get("����") + "\t" + board.get(i).get("�ۼ���") + "\t" + board.get(i).get("�ۼ���"));
			}
			System.out.println("----------------------------");
			System.out.println("��ȸ\t���\t����");
			System.out.println("���ڰ� �ƴ� ���ڷ� �Է����ּ���");
			
			int count = 1;
			String input = s.nextLine();
			switch(input){
			
			case "��ȸ":
				System.out.println("-----------��ȸ���------------");
				System.out.println("��ȣ\t����\t�ۼ���\t�ۼ���");
				System.out.println("----------------------------");
				for(int i = 0; i < board.size(); i++){
					System.out.println(board.get(i).get("��ȣ") + "\t" + board.get(i).get("����") + "\t" + board.get(i).get("�ۼ���") + "\t" + board.get(i).get("�ۼ���"));
				}
				System.out.println("----------------------------");
				System.out.println("����\t����\t������");
				System.out.println();
				String input1 = s.nextLine();
				switch(input1){
					case "����":
						System.out.println("�����Ͻ� �Խñ��� ��ȣ�� �Է��ϼ���");
						int selectnum = s.nextInt();
						selectnum -= 1;
						
						System.out.println("�����Ͻ� ������ ������ �Է��ϼ���");
						String titleinput = s.nextLine();	
						board.get(selectnum).put("����", titleinput);
						
						System.out.println("�ۼ��� ������ ������ �����ּ���");
						String nameinput = s.nextLine();	
						board.get(selectnum).put("�ۼ���", nameinput);
					break;
					
					case "����":
						System.out.println("�����Ͻ� �Խñ��� ��ȣ�� �Է��ϼ���");
						int selectnum1 = s.nextInt();
						selectnum1 -= 1;
						board.remove(selectnum1);
						System.out.println("�����Ǿ����ϴ�.");
						break;
						
					case "������":
						break;
				}
				break;
				
			case "���":
				for(int i = 0; i < board.size(); i++){
					count++;
				}
				System.out.println("������ �Է����ּ���>");
				String title1 = s.nextLine();		
				
				System.out.println("�ۼ��� ���� ������ �Է����ּ���>");
				String authorin = s.nextLine();
				Calendar cal = Calendar.getInstance();
				Date datein = cal.getTime();
				String nowdate = new SimpleDateFormat("yyyy-MM-dd").format(datein);
				
				HashMap<String, Object> user = new HashMap<>();
				user.put("��ȣ", count);
				user.put("����", title1);
				user.put("�ۼ���", authorin);
				user.put("�ۼ���", nowdate);
				
				board.add(user);
				break;
				
			case "����":
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
				break;
			}
		}

	}
}









