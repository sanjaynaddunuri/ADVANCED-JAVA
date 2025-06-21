package jdbc;
import java.sql.*;
public class Cursor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs =s.executeQuery("select * from student");
		rs.absolute(3);
		ResultSetMetaData rm=rs.getMetaData();
		int n =rm.getColumnCount();
		for(int i=1;i<=n;i++)
		{
			System.out.print(rm.getColumnName(i) + "\t");
		}
		System.out.println();
		System.out.print(rs.getInt("rollno")+"\t");
		System.out.print(rs.getString("name")+"\t");
		System.out.print(rs.getInt("marks"));
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
 