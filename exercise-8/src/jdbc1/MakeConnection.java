package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;//
import java.sql.Statement;

/**
 * @author Kamalesh
 *
 */
class MakeConnection {
	
	private final String EMP_TABLE = "emp";
	Statement stmt; 
	ResultSet rs; 
	
	MakeConnection() {
		try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost/practicedb","root","kamalesh2202@cdw");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from " + EMP_TABLE); 
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}catch(Exception e) {
				e.printStackTrace();
		}
	}
}
