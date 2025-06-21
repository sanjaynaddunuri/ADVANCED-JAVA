package jdbc;
import java.sql.*;
import java.util.*;
public class Prepare2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","SYSTEM","admin");
		PreparedStatement ps=c.prepareStatement("select * from student where rollno=?");
		Scanner s =new Scanner(System.in);
		System.out.print("Enter Roll number : ");
		int rollno=s.nextInt();
		ps.setInt(1,rollno);
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getInt(3));
		s.close();
		
	
		
		
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
