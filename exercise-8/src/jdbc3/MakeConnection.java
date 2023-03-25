package jdbc3;

import java.sql.*;
class MakeConnection {
	Connection con; Statement stmt; ResultSet rs; MakeConnection() throws SQLException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost/practicedb","root","kamalesh2202@cdw");
			
			stmt = con.createStatement();
			
			int i1=stmt.executeUpdate("insert into employee values (001,'kamalesh',2672)");
			int i2=stmt.executeUpdate("insert into employee values (001,'venkatesh',2253)");
			int i3=stmt.executeUpdate("insert into employee values (001,'mugundhan',2413)");
			
			rs=stmt.executeQuery("select * from employee"); 
			
			while(rs.next())
				System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+"\t"+rs.getInt(3)); 
			
			con.close();
		}catch(Exception e) { 
			System.out.println(e);
			con.close();
		}
	} 
}
