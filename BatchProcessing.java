package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class BatchProcessing{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c  =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement();
		s.addBatch("insert into student values(3,'ccc',78)");
		s.addBatch("update student set marks=67 where rollno= 5");
		s.addBatch("delete from student where rollno=6");

		s.executeBatch();
		System.out.println("one deleted succesfully");
	
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
 