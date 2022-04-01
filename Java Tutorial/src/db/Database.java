package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName ("com.mysql.cj.jdbc.Driver");

		//Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://13.233.48.115:3306/orgfarm_r2","orgfarm_r2","or9F@rm05152020");
		
		Statement statement=connection.createStatement(); 	
	
		ResultSet result=statement.executeQuery("SELECT * FROM hf7_customer");
	
		while(result.next()){
			System.out.println("FirstName : "+result.getString(4)+"  "+"LastName : "
					+result.getString(5));
		}
	}
}
