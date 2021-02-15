package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - �ڹٿ� �����ͺ��̽��� �������ִ� ���̺귯��
		 * - ojdbc : ����Ŭ JDBC
		 * 
		 * JDBC �ۼ� �ܰ�
		 * 1. Connection ����(DB ����)
		 * 2. Statement ����(���� �ۼ�)
		 * 3. Query ����
		 * 4. ResultSet���� ��� ����(select�� ���)
		 * 5. ResultSet, Statement, Connection �ݱ�
		 */
		
		//�����ͺ��̽� ���� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc21";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//DriverManager : �����ͺ��̽��� �����ϱ� ���� ����̹��� �������ִ� Ŭ����
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery();
			
			//insert, update, delete
			//int result = ps.executeUpdate(); //��� row�� ������ �޾Ҵ��� ��ȯ���ش�.
			
//			while(rs.next()){
			rs.next();
				System.out.println(rs.getString(1));
				System.out.println(rs.getString("MEM_NAME"));
				
//				rs.getInt(1);
//				rs.getDate(1);
//			}
		} catch (SQLException e) { 	
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}

}
