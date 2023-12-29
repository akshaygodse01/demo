package topic38_16aug_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","8390335543");
    	  
    	  System.out.println("connaction opened...."+ "");
    	  //PreparedStatement stmt=con.prepareStatement("select * from student");
    	   PreparedStatement stmt=con.prepareStatement("insert into student values(12,'MG',27)");
    	 int j= stmt.executeUpdate();//other than select query 
//    	ResultSet rs=stmt.executeQuery();//
//    	while(rs.next()) {
//    		System.out.println("no :"+rs.getInt("roll_no"));
//    		System.out.println("name :"+rs.getString("name"));
//    		System.out.println("age :"+rs.getInt("age"));
//    		System.out.println("*************************************************************");
//    	}
    	
    	con.close();
      }
      catch(Exception ex )
      {
    	  System.out.println(ex.getLocalizedMessage());
      }
	}

}
