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
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ------------------------------
		 * 번호	제목		작성자	작성일
		 * ------------------------------
		 * 1	안녕하세요	홍길동	2/9
		 * 1	안녕하세요	홍길동	2/9
		 * 1	안녕하세요	홍길동	2/9
		 * 1	안녕하세요	홍길동	2/9
		 * ------------------------------
		 * 1.조회	2.등록	3.종료
		 * 
		 * 조회 후 수정, 삭제 가능
		 */
		ArrayList<HashMap<String, Object>> board = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);

		while(true){
			System.out.println("------------게시판-------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("----------------------------");
			for(int i = 0; i < board.size(); i++){
				System.out.println(board.get(i).get("번호") + "\t" + board.get(i).get("제목") + "\t" + board.get(i).get("작성자") + "\t" + board.get(i).get("작성일"));
			}
			System.out.println("----------------------------");
			System.out.println("조회\t등록\t종료");
			System.out.println("숫자가 아닌 문자로 입력해주세요");
			
			int count = 1;
			String input = s.nextLine();
			switch(input){
			
			case "조회":
				System.out.println("-----------조회목록------------");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("----------------------------");
				for(int i = 0; i < board.size(); i++){
					System.out.println(board.get(i).get("번호") + "\t" + board.get(i).get("제목") + "\t" + board.get(i).get("작성자") + "\t" + board.get(i).get("작성일"));
				}
				System.out.println("----------------------------");
				System.out.println("수정\t삭제\t나가기");
				System.out.println();
				String input1 = s.nextLine();
				switch(input1){
					case "수정":
						System.out.println("수정하실 게시글의 번호를 입력하세요");
						int selectnum = s.nextInt();
						selectnum -= 1;
						
						System.out.println("수정하실 제목의 내용을 입력하세요");
						String titleinput = s.nextLine();	
						board.get(selectnum).put("제목", titleinput);
						
						System.out.println("작성자 본인의 성함을 적어주세요");
						String nameinput = s.nextLine();	
						board.get(selectnum).put("작성자", nameinput);
					break;
					
					case "삭제":
						System.out.println("삭제하실 게시글의 번호를 입력하세요");
						int selectnum1 = s.nextInt();
						selectnum1 -= 1;
						board.remove(selectnum1);
						System.out.println("삭제되었습니다.");
						break;
						
					case "나가기":
						break;
				}
				break;
				
			case "등록":
				for(int i = 0; i < board.size(); i++){
					count++;
				}
				System.out.println("제목을 입력해주세요>");
				String title1 = s.nextLine();		
				
				System.out.println("작성자 분의 성함을 입력해주세요>");
				String authorin = s.nextLine();
				Calendar cal = Calendar.getInstance();
				Date datein = cal.getTime();
				String nowdate = new SimpleDateFormat("yyyy-MM-dd").format(datein);
				
				HashMap<String, Object> user = new HashMap<>();
				user.put("번호", count);
				user.put("제목", title1);
				user.put("작성자", authorin);
				user.put("작성일", nowdate);
				
				board.add(user);
				break;
				
			case "종료":
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}

	}
}









