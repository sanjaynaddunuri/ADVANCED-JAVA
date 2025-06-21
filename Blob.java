package jdbc;
import java.io.FileInputStream;
import java.sql.*;
public class Blob{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c  =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		PreparedStatement ps=c.prepareStatement("insert into images values(?,?)");
		ps.setString(1, args[0]);
		FileInputStream fis =new FileInputStream(args[1]);
		ps.setBinaryStream(2, fis,fis.available());
		ps.executeUpdate();
		System.out.println("image inserted");		
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
 