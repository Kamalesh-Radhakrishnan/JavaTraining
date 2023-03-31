package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Kamalesh
 *
 */
class MakeConnection {
	Statement stmt;
	ResultSet rs; 
	private final String TABLE = "employees";
	
	MakeConnection() {
		try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost/practicedb","root","kamalesh2202@cdw");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			stmt = con.createStatement();
			int i=stmt.executeUpdate("create table "+ TABLE + "(empno integer,ename varchar(20),deptno integer)");
			System.out.println("Result status: " + i);
		} catch(Exception e) { 
			e.printStackTrace();
		}
	} 
}
