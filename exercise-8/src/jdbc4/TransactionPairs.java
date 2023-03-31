package jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class TransactionPairs {
	
	private final static String COFFEE_TABLE = "coffee";
	
	
	public static void main(String args[]) {
		
		
		String url = "jdbc:mysql://localhost/practicedb";
		Connection con = null;
		Statement stmt = null;
		PreparedStatement updateSales; 
		PreparedStatement updateTotal;
		
		String updateString = "update"+ COFFEE_TABLE +" set sales = ? where cof_name like ?"; 
		String updateStatement = "update"+ COFFEE_TABLE +" set total = ? where cof_name like ?";
		String query = "select cof_name, sales, total from " + COFFEE_TABLE ; //top?
		
		HashMap<String,Integer> coffeePricing = new HashMap<>();
		coffeePricing.put("Colombian",175);
		coffeePricing.put("French_Roast",150);
		coffeePricing.put("Espresso",60);
		coffeePricing.put("Colombian_Decaf",155);
		coffeePricing.put("French_Roast_Decaf",90);
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(java.lang.ClassNotFoundException e) { 
			System.out.print("ClassNotFoundException: ");
			System.out.println(e.getMessage());
		} 
		try {
			try {
				con=DriverManager.getConnection(url, "root", "kamalesh2202@cdw");
				updateSales = con.prepareStatement(updateString); 
				updateTotal = con.prepareStatement(updateStatement);
				int len = coffeePricing.size();;
				con.setAutoCommit(false); 
				for(Map.Entry coffee : coffeePricing.entrySet()){    
					updateSales.setInt(1, (int) coffee.getValue()); updateSales.setString(2, (String) coffee.getKey());
					updateSales.executeUpdate();
					updateTotal.setInt(1, (int) coffee.getValue());
					updateTotal.setString(2, (String) coffee.getKey()); 
					updateTotal.executeUpdate(); 
					con.commit(); 
				}
				con.setAutoCommit(true); updateSales.close();
				updateTotal.close();
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					String c = rs.getString("cof_name");
					int s = rs.getInt("sales");
					int t = rs.getInt("total"); 
					System.out.println(c + " " + s + " " + t);
				} 
				
			} catch(SQLException ex) { 
				System.out.println("SQLException: " + ex.getMessage());
				if (con != null) {
					try {
						System.out.print("Transaction is being "); 
						System.out.println("rolled back");
						con.rollback();
					} catch(SQLException excep) { 
						System.out.print("SQLException: "); 
						System.out.println(excep.getMessage());
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			} finally{
				con.close();
				stmt.close();
			}
		}catch(SQLException sqlexe) {
			sqlexe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
