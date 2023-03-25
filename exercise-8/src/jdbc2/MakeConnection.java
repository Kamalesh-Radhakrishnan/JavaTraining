package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class MakeConnection {
	Connection con; Statement stmt; ResultSet rs; MakeConnection() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost/practicedb","root","kamalesh2202@cdw");
			stmt = con.createStatement();
			int i=stmt.executeUpdate("create table employee(empno integer,ename varchar(20),deptno integer)");
			System.out.println("Result status: " + i);
			con.close();
		} catch(Exception e) { 
			System.out.println(e);
		}
	} 
}