package com.cg.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.login.bean.LoginBean;
import com.cg.login.exception.LoginException;
import com.cg.login.util.DbConnection;

public class LoginDaoImpl implements ILoginDao {
	@Override
	public boolean verifyLogin(LoginBean loginBean) throws LoginException, SQLException {
		boolean result=false;
		Connection con=DbConnection.getConnection();
		PreparedStatement pst=con.prepareStatement("select * from LoginDetails where uname=? and pwd=?");
		pst.setString(1,username);
		pst.setString(2,password);
		return result;
	}
}
