package jdbc1;

import java.sql.*;
class MakeConnection {
	Connection con; Statement stmt; ResultSet rs; MakeConnection() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost/practicedb","root","kamalesh2202@cdw");
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select * from emp"); 
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getInt(2)); 
			
			con.close();
		}catch(Exception e) {
				e.printStackTrace();
		}
	}
}