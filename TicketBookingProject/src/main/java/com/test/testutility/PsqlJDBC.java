package com.test.testutility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.test.base.BaseClass;

public class PsqlJDBC extends BaseClass{
	
	public void dbConnection()
	{
		Connection con = driver.getConnection("jdbc location");
		
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery("select * from employees");
		
		while(set.next()) {
			
			set.getString(0);
		}
		
		
	}

}
