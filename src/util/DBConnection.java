package util;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
	public static Connection getConnection(String dsName) throws Exception{
		Connection conn = null;
		InitialContext ctx = new InitialContext();
		try {
			DataSource ds = (DataSource) ctx.lookup(dsName);
			conn = ds.getConnection();
		} finally {
			ctx.close();
		}
		return conn;
	}
}
