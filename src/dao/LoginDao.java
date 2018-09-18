package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBConnection;

public class LoginDao {
	public boolean isUserExist(String username, String password) throws Exception {
		boolean retval = false;
		Connection conn = null;
		PreparedStatement ps;
		ResultSet rs;
		String sql = "SELECT NAME FROM BIT WHERE USERID = ? AND PASSWORD = ?";
		try {
			conn = DBConnection.getConnection("demo_ds");
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();	
			if(rs.next())
				retval = true;
		} finally {
			conn.close();
		}
		return retval;
	}
}
