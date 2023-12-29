package topic38_16aug_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url="jdbc:mysql://localhost:3306/akshay";
String username="root";
String password="8390335543";

Connection connection=null;

try {
	
connection=DriverManager.getConnection(url,username,password);

}
catch(SQLException e) {
	e.printStackTrace();}

	try
	{
		if(connection!=null&&!connection.isClosed()) {
			connection.close();
			System.out.println("disconnected from the database");}
		}catch(SQLException e) {
			e.printStackTrace();}
	}
}
