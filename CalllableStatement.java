package jdbc;
import java.sql.*;

public class CalllableStatement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		 CallableStatement cs=c.prepareCall("call insertpro (?,?,?)");
		 cs.setInt(1,Integer.parseInt(args[0]));
		 cs.setString(2,args[1]);
		 cs.setInt(3,Integer.parseInt(args[2]));
		 cs.execute();
		 System.out.println("Success");
		 }
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
