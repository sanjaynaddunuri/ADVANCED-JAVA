package jdbc;
import java.sql.*;
public class CreateTable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement();
		s.execute("create table student (rollno number(3),name varchar2(10),marks number(3))");
		System.out.println("table created succesfully");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
