package jdbc;
import java.sql.*;
public class Cursor3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs =s.executeQuery("select rollno,name,marks from student");
		rs.moveToInsertRow();
		rs.updateInt(1, 6);
		rs.updateString(2, "fff");
		rs.updateInt(3, 98);
		rs.insertRow();
		System.out.println("one resord inserted succesfully");
	
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
 