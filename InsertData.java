package jdbc;
import java.sql.*;
public class InsertData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement();
		s.execute("insert into student values(2,'Sanju',95)");
		System.out.println("One Record Inserted Suceessfully");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
