package jdbc;
import java.sql.*;
import java.util.*;

public class CallableStatement2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		 CallableStatement cs=c.prepareCall("call getmarks (?,?)");
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Roll number: ");
		 int roll=s.nextInt();		 
		 cs.setInt(1,roll);
		 cs.registerOutParameter(2, Types.INTEGER);
		 cs.execute();
		 int x =cs.getInt(2);
		 System.out.println(x);
		 s.close();
		 
		
		 }
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
