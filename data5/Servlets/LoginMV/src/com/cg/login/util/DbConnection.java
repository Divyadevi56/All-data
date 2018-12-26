package com.cg.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import com.cg.login.exception.ExceptionMessages;
import com.cg.login.exception.LoginException;

public class DbConnection {
private static Connection connection=null;
	public static Connection getConnection() throws LoginException {
		if(connection==null)
		{
			try 
				{
			connection=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg715","training715");
			
		}
		catch(SQLException e)
		{
			throw new LoginException(ExceptionMessages.MESSAGE1);
		}
		
		return null;
	}
		return connection;

	}
}
