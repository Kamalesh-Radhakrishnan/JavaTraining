package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Kamalesh
 *
 */
class MakeConnection {
	Statement stmt; ResultSet rs; 
	
	private final String EMPLOYEE_TABLE = "employee";
	
	/**
	 * 
	 * @throws SQLException
	 */
	MakeConnection() throws SQLException {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost/practicedb","root","kamalesh2202@cdw");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			stmt = con.createStatement();
			
			stmt.executeUpdate("insert into "+ EMPLOYEE_TABLE +" values (001,'kamalesh',2672)");
			stmt.executeUpdate("insert into "+ EMPLOYEE_TABLE +" values (001,'venkatesh',2253)");
			stmt.executeUpdate("insert into "+ EMPLOYEE_TABLE +" values (001,'mugundhan',2413)");
			
			rs=stmt.executeQuery("select * from " + EMPLOYEE_TABLE); 
			
			while(rs.next())
				System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+"\t"+rs.getInt(3)); 
			
		}catch(Exception e) { 
			e.printStackTrace();
		}
	} 
}
