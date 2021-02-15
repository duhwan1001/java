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
		 * ����Ŭ �����ͺ��̽��� �Խ��� ���̺��� �����ϰ�, �Խ��� ���α׷��� ������ּ���.
		 * ���̺� : TB_JDBC_BOARD
		 * �÷� : BOARD_NO, TI
		 * TLE, CONTENT, USER_ID, REG_DATE
		 */
		
		while (true) {
			System.out.println("-----------------------------");
			System.out.println("��ȣ\t����\t�ۼ���\t�ۼ���");
			System.out.println("-----------------------------");
			show();
			System.out.println("-----------------------------");
			System.out.println("1.��ȸ\t2.���\t0.����");
			System.out.print("�Է�>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				read();
				break;
			case 2:
				break;

			case 0:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
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
			
			ResultSetMetaData md = rs.getMetaData(); //��Ÿ������ : �����Ϳ� ���� ������
			
			int columnCount = md.getColumnCount(); //�÷� ��
			
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
