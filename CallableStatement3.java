package jdbc;
import java.sql.*;


public class CallableStatement3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		 CallableStatement cs=c.prepareCall("{ ?=call totalstudents() }");
		 cs.registerOutParameter(1, Types.INTEGER);
		 cs.execute();
		 int x =cs.getInt(1);
		 System.out.println(x);
		
		 }
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
