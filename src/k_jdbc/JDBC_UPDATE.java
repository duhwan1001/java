package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_UPDATE {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc21";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//DriverManager : �����ͺ��̽��� �����ϱ� ���� ����̹��� �������ִ� Ŭ����
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "update testseq set ts_name = '��3' where ts_name is null";
			ps = con.prepareStatement(sql);
//			ps.setString(1, "is null");
			
			//insert, update, delete
			int result = ps.executeUpdate(); //��� row�� ������ �޾Ҵ��� ��ȯ���ش�.
			System.out.println(result + "���� �ݿ��Ǿ����ϴ�.");
			
		} catch (SQLException e) { 	
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

}
