package orhter.demo.utils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBoperation {

	public void testSelect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "password";
		Connection conn = DriverManager.getConnection(url, user, password);

		Statement st = conn.createStatement();

		String sql = "select * from myuser";
		ResultSet rs = st.executeQuery(sql);

		while(rs.next()){
			int userID = rs.getInt("userID");
			String name = rs.getString("userName");
			String userPass = rs.getString("userPass");
			String email = rs.getString("email");
			Date birthday = rs.getDate("birthday");
			
			System.out.println(userID);
			System.out.println(name);
			System.out.println(userPass);
			System.out.println(email);
			System.out.println(birthday);
			System.out.println("*********************");
		}

		rs.close();
		st.close();
		conn.close();
	}
	public void testInsert(){
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "password";
		
		Connection conn = null;
		Statement st = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
	
			conn = DriverManager.getConnection(url, user, password);
			
			st = conn.createStatement();
	
			String sql = "insert into myuser(userID,userName) values("+5+",'Tom'"+")";
			System.out.println("sql="+sql);
			int result = st.executeUpdate(sql);
	
			if(result>0){
				System.out.println("");
			}else{
				System.out.println("");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
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
	
	public void testUpate(){
		String sql = "update myuser set username='Tom_AB' where userID=4";
		
		Connection conn = null;
		Statement st = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			if(result>0){
				System.out.println(" ");
			}else{
				System.out.println(" ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.release(conn, st, null);
		}

	}
	
	public void testDelete(){
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "password";
		
		Connection conn = null;
		Statement st = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
	
			conn = DriverManager.getConnection(url, user, password);
			
			st = conn.createStatement();
	
			String sql = "delete from myuser where userID=5";
			System.out.println("sql="+sql);
			int result = st.executeUpdate(sql);
	
			if(result>0){
				System.out.println("锟斤拷锟斤拷锟缴癸拷");
			}else{
				System.out.println("锟斤拷锟斤拷失锟斤拷");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
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
}