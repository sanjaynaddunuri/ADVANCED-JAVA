package jdbc;
import java.sql.*;

public class Transaction2{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement();
		c.setAutoCommit(false);
		s.executeUpdate("insert into student values(6,'jjj',87)");
		Savepoint sp=c.setSavepoint();
		s.executeUpdate("insert into student values(9,'jjj',60)");
		c.rollback(sp);
		s.executeUpdate("delete from student where rollno=2");
		c.commit();
		System.out.println("Executed");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
