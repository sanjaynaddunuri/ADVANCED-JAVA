package jdbc;
import java.sql.*;
import java.text.SimpleDateFormat;
public class DateDemo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		PreparedStatement ps=c.prepareStatement("insert into emp values(?,?,?)");
		ps.setInt(1,Integer.parseInt(args[0]));
		ps.setString(2, args[1]);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d= sdf.parse(args[2]);
		java.sql.Date d2=new java.sql.Date(d.getTime());
		ps.setDate(3, d2);
		ps.executeUpdate();
		System.out.println("One record inserted succesfully........");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
