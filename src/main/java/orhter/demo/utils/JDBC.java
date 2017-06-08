package orhter.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date; 
import java.sql.ResultSet; 
import java.sql.Statement; 



public class JDBC {
	
	private static final String driverUrl = "oracle.jdbc.driver.OracleDriver";

	private static final String url = "jdbc:oracle:thin:@10.35.148.6:1521:ORCL";
	
	private static final String username = "lfyb";
	
	private static final String password = "lfyb";
	
	public static Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName(driverUrl);
			connection = DriverManager.getConnection(url, username, password);
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
	
	public static void main(String[] args) {
		select();
	}
	public static void select(){
		Statement st =null;
		ResultSet rs =null;
		Connection connection = JDBC.getConnection();
		System.out.println("���ӣ�"+connection);
		try{
			st = connection.createStatement(); 
			String sql = "select * from ac01 where ROWNUM<=1"; 
			rs = st.executeQuery(sql); 
			while(rs.next()){ 
				String name = rs.getString("AAC001"); 
				Date birthday = rs.getDate("AAC007"); 
				System.out.println(name); ; 
				System.out.println(birthday); 
				System.out.println("*********************"); 
			} 
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					rs = null; 
				}
			}
			if(st != null){
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					st = null; 
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					connection = null; 
				}
			}
		}
	}
}



