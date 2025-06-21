package jdbc;

import java.io.FileOutputStream;
import java.sql.SQLException;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WebRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OracleWebRowSet jrs = new OracleWebRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jrs.setUsername("SYSTEM");
			jrs.setPassword("admin");
			jrs.setCommand("select * from student");
			jrs.execute();
			FileOutputStream fos = new FileOutputStream("student.xml");
			jrs.writeXml(fos);
			fos.close();
			jrs.close();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
