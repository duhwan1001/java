package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC_LIKE {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc21";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user,password);
			
			String sql = "select * from buyer where buyer_add1 like ? || '%'";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			ps.setString(1, "¼­¿ï");
			
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount();
			
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					System.out.print(md.getColumnName(i) + ":");
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
