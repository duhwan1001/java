package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;

import E_oop.ScanUtil;

public class JDBCBoard {
	
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "pc21";
	static String password = "java";
	
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TI
		 * TLE, CONTENT, USER_ID, REG_DATE
		 */
		
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-----------------------------");
			show();
			System.out.println("-----------------------------");
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				read();
				break;
			case 2:
				break;

			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
		

	}
	
private static void show() {
		try {
			con = DriverManager.getConnection(url, user,password);
			
			String sql = "select * from tb_jdbc_board";
			ps = con.prepareStatement(sql);
	
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			
			int columnCount = md.getColumnCount(); //컬럼 수
			
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}
