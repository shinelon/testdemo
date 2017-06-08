package orhter.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	//private static String driver = "com.mysql.jdbc.Driver";
	private static String driver ="oracle.jdbc.driver.OracleDriver";
	//private static String url = "jdbc:mysql://localhost:3306/jdbc";
	private static String url ="jdbc:oracle:thin:@10.35.148.6:1521:ORCL";
	private static String user = "lfyb";
	private static String password = "lfyb";
	
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void release(Connection conn,Statement st,ResultSet rs){
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
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				conn = null;
			}
		}
	}
}