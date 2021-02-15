package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import E_oop.ScanUtil;

public class boardanswer {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //MM : �빮�ڷ� �ؾ� ���� �νĵȴ�. mm�� minute
		
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("��ȣ\t����\t�ۼ���\t�ۼ���");
			System.out.println("-----------------------------");
			for (int i = boardList.size() - 1; i >= 0; i--) {
				HashMap<String, Object> board = boardList.get(i);
				System.out.println(board.get("board_no") + "\t"
						+ board.get("title") + "\t" + board.get("user") + "\t"
						+ sdf.format(board.get("reg_date")));
			}
			System.out.println("-----------------------------");
			System.out.println("1.��ȸ\t2.���\t0.����");
			System.out.print("�Է�>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				read(boardList);
				break;
			case 2:
				insert(boardList);
				break;

			case 0:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
				break;
			}
		}
	}

	private static void read(ArrayList<HashMap<String, Object>> boardList) {
		System.out.println("�Խñ� ��ȣ �Է�>");
		int boardNo = ScanUtil.nextInt();

		HashMap<String, Object> board = new HashMap<>();
		for (int i = 0; i < boardList.size(); i++) {
			if ((Integer) boardList.get(i).get("board_no") == boardNo) {
				board = boardList.get(i);
				break;
			}
		}

		System.out.println("-----------------------------");
		System.out.println("��ȣ\t: " + board.get("board_no"));
		System.out.println("�ۼ���\t: " + board.get("user"));
		System.out.println("�ۼ���\t: " + board.get("reg_date"));
		System.out.println("����\t: " + board.get("title"));
		System.out.println("����\t: " + board.get("content"));
		System.out.println("-----------------------------");
		System.out.println("1.����\t2.����\t0.���");
		System.out.print("�Է�>");

		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			update(board);
			break;
		case 2:
			delete(boardList, board);
			break;
		}
	}

	private static void delete(ArrayList<HashMap<String, Object>> boardList,
			HashMap<String, Object> board) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).get("board_no") == board.get("board_no")) {
				boardList.remove(i);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
		}
	}

	private static void update(HashMap<String, Object> board) {
		System.out.println("����>");
		String title = ScanUtil.nextLine();
		System.out.println("����>");
		String content = ScanUtil.nextLine();

		board.put("title", title);
		board.put("content", content);

		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	private static void insert(ArrayList<HashMap<String, Object>> boardList) {
		
		int max = 0;
		for(int i = 0; i < boardList.size(); i++){
			if(max < (Integer)boardList.get(i).get("board_no")){
				max = (Integer)boardList.get(i).get("board_no");
			}
		}
		
//		System.out.println("��ȣ>");
//		int boardNo = ScanUtil.nextInt();
		int boardNo = max + 1;
		System.out.println("����>");
		String title = ScanUtil.nextLine();
		System.out.println("����>");
		String content = ScanUtil.nextLine();
		System.out.println("�̸�>");
		String user = ScanUtil.nextLine();

		HashMap<String, Object> board = new HashMap<>();
		board.put("board_no", boardNo);
		board.put("title", title);
		board.put("content", content);
		board.put("user", user);
		board.put("reg_date", new Date());

		boardList.add(board);
	}

}
