
package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc21";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user,password);
			
			String sql = "select * from cart where cart_member = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001");
//			ps.setInt(paramterIndex, x);
//			ps.setDate(parameterIndex, x);
//			ps.setObject(parameterIndex, x);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData md = rs.getMetaData(); //��Ÿ������ : �����Ϳ� ���� ������
			
			int columnCount = md.getColumnCount(); //�÷� ��
			
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					System.out.print(md.getColumnName(i) + ":");
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

	}

}
