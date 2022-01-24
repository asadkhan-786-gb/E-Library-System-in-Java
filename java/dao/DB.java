package dao;
import java.sql.*;
//Database connection method
public class DB {
public static Connection getCon(){
	Connection con=null;
        String user = "lib";
        String pass ="l123";
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}