package jdbc;
import java.sql.*;

public class SelectDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		Statement s=c.createStatement();
		ResultSet rs= s.executeQuery("select * from student");
		ResultSetMetaData rm=rs.getMetaData();
		int n =rm.getColumnCount();
		for(int i=1;i<=n;i++)
		{
			System.out.print(rm.getColumnName(i) + "\t");
		}
		System.out.println();
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
		}
		}
		catch(Exception e) 
		{
			System.err.println(e);
		}

	}

}