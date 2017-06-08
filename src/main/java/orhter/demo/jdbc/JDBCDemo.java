package orhter.demo.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCDemo {
	public void testJdbc(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			String user = "root";
			String password = "123456";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			String sql="Select id as sid,name as sname from student";
			String updateSql="update student set name='张三' where id=1 ";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			ResultSetMetaData rsmd = null;
			while(rs.next()){
			    rsmd=rs.getMetaData();
			    System.out.println(rsmd.getColumnLabel(2));
//				int id = rs.getInt("sid");
//				
//				String name=rs.getString("sname");
//				System.out.print(id);
//				System.out.println(name);
//				System.out.println("*********************");
			} 
			rs.close();
			pst.close();
			conn.close();
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
	}
	
	public static void main(String args[]){
		new JDBCDemo().testJdbc();
		
	}
}
