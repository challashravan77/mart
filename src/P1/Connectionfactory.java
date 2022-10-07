package P1;

import java.sql.*;
import java.sql.DriverManager;

public class Connectionfactory {
    public static Connection con=null;
   
    	public static Connection getConnection() {
    		 try {
    			 Class.forName("com.mysql.cj.jdbc.Driver");
        	con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/1111","root","root");
        return con;
        }
    	catch (Exception er) {
    		er.printStackTrace();
    	}
    	return con;
    		
    	
    	
    }
    
}
