package employee.management.system;
import java.sql.*;
public class DBconn {
	Connection c;
	Statement st;
	public DBconn(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c =DriverManager.getConnection("jdbc:mysql:///employeesystem","root","");
			st = c.createStatement();
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
