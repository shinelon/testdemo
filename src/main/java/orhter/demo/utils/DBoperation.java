package orhter.demo.utils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 使锟斤拷JDBC执锟斤拷 select insert update delete
 */
public class DBoperation {

	public void testSelect() throws Exception{
		//注锟斤拷锟斤拷锟斤拷(锟斤拷锟捷匡拷锟斤拷锟斤拷锟�)
		/*
		 * 锟斤拷锟街凤拷式锟斤拷锟节碉拷锟斤拷锟解：
		 * 1. 锟斤拷锟斤拷锟斤拷jar锟斤拷
		 * 2. 锟斤拷锟斤拷锟斤拷锟斤拷com.mysql.jdbc.Driver注锟斤拷锟斤拷锟斤拷
		 */
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//实锟绞匡拷锟斤拷锟斤拷应锟矫诧拷锟斤拷锟斤拷锟斤拷姆锟绞阶拷锟斤拷锟斤拷锟�  --> Java锟斤拷锟斤拷
		Class.forName("com.mysql.jdbc.Driver");

		//锟斤拷取锟斤拷锟斤拷
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "password";
		Connection conn = DriverManager.getConnection(url, user, password);

		//锟矫碉拷锟斤拷锟叫伙拷锟斤拷
		Statement st = conn.createStatement();

		//执锟斤拷SQL
		String sql = "select * from myuser";
		ResultSet rs = st.executeQuery(sql);

		//锟斤拷锟斤拷锟斤拷
		while(rs.next()){
			//每锟斤拷循锟斤拷锟斤拷锟斤拷取锟斤拷一锟斤拷锟斤拷录
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

		//锟酵凤拷锟斤拷源
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
			//注锟斤拷锟斤拷锟斤拷(锟斤拷锟捷匡拷锟斤拷锟斤拷锟�)
			Class.forName("com.mysql.jdbc.Driver");
	
			//锟斤拷取锟斤拷锟斤拷
			conn = DriverManager.getConnection(url, user, password);
			
			//锟矫碉拷锟斤拷锟叫伙拷锟斤拷
			st = conn.createStatement();
	
			//执锟斤拷SQL
			String sql = "insert into myuser(userID,userName) values("+5+",'Tom'"+")";
			System.out.println("sql="+sql);
			int result = st.executeUpdate(sql);
	
			//锟斤拷锟斤拷锟斤拷
			if(result>0){
				System.out.println("锟斤拷锟斤拷锟缴癸拷");
			}else{
				System.out.println("锟斤拷锟斤拷失锟斤拷");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			//锟酵凤拷锟斤拷源
			if(st != null){
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					st = null;//--> 锟斤拷锟斤拷迅锟劫筹拷为java gc锟侥讹拷锟斤拷
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					conn = null;//--> 锟斤拷锟斤拷迅锟劫筹拷为java gc锟侥讹拷锟斤拷
				}
			}
		}

	}
	
	public void testUpate(){
		String sql = "update myuser set username='Tom_AB' where userID=4";
		
		Connection conn = null;
		Statement st = null;
		try {
			//锟接癸拷锟斤拷锟斤拷锟叫伙拷取锟斤拷锟斤拷
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			//锟斤拷锟斤拷锟斤拷
			if(result>0){
				System.out.println("锟斤拷锟斤拷锟缴癸拷");
			}else{
				System.out.println("锟斤拷锟斤拷失锟斤拷");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//锟斤拷锟矫癸拷锟斤拷锟斤拷锟酵凤拷锟斤拷源
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
			//注锟斤拷锟斤拷锟斤拷(锟斤拷锟捷匡拷锟斤拷锟斤拷锟�)
			Class.forName("com.mysql.jdbc.Driver");
	
			//锟斤拷取锟斤拷锟斤拷
			conn = DriverManager.getConnection(url, user, password);
			
			//锟矫碉拷锟斤拷锟叫伙拷锟斤拷
			st = conn.createStatement();
	
			//执锟斤拷SQL
			String sql = "delete from myuser where userID=5";
			System.out.println("sql="+sql);
			int result = st.executeUpdate(sql);
	
			//锟斤拷锟斤拷锟斤拷
			if(result>0){
				System.out.println("锟斤拷锟斤拷锟缴癸拷");
			}else{
				System.out.println("锟斤拷锟斤拷失锟斤拷");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			//锟酵凤拷锟斤拷源
			if(st != null){
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					st = null;//--> 锟斤拷锟斤拷迅锟劫筹拷为java gc锟侥讹拷锟斤拷
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					conn = null;//--> 锟斤拷锟斤拷迅锟劫筹拷为java gc锟侥讹拷锟斤拷
				}
			}
		}

	}
}