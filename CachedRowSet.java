package jdbc;

import java.sql.SQLException;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class CachedRowSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OracleCachedRowSet jrs=new OracleCachedRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jrs.setUsername("SYSTEM");
			jrs.setPassword("admin");
			jrs.setCommand("select * from student");
			jrs.execute();
			while(jrs.next())
			{
				System.out.print(jrs.getInt(1)+"\t");
				System.out.print(jrs.getString(2)+"\t");
				System.out.println(jrs.getInt(3));

			}
			System.out.println();
			jrs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
