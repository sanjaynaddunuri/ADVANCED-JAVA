package jdbc;
import java.sql.*;
public class PrepareStatement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1,Integer.parseInt(args[0]));
		ps.setString(2, args[1]);
		ps.setInt(3,Integer.parseInt(args[2]));
		ps.executeUpdate();
		System.out.println("One record inserted succesfully........");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
