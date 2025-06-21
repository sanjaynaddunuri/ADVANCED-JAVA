package jdbc;
import java.sql.*;
public class Currsor4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c  =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs =s.executeQuery("select rollno,name,marks from student");
		rs.absolute(3);
		rs.deleteRow();
		System.out.println("one deleted succesfully");
	
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
 