package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import form.CustomerForm;
import util.DBConnection;

public class CustomerDao {
	
	public int insertCustomer(String name, String gender, String address, String idType, String idNo, String priority) throws Exception{
		Connection conn = null;
		PreparedStatement ps;
		int result = 0;
		String sql = "INSERT INTO Customer(name, gender, address, id_type, id_no, priority, cust_id) VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			conn = DBConnection.getConnection("demo_ds");
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, address);
			ps.setString(4, idType);
			ps.setString(5, idNo);
			ps.setString(6, priority);
			ps.setString(7, ""+System.currentTimeMillis());
			result = ps.executeUpdate();
		} finally {
			conn.close();
		}
		return result;
	}
	
	public CustomerForm viewCustomer(int id) throws Exception{
		Connection conn = null;
		PreparedStatement ps;
		ResultSet rs;
		CustomerForm cf = new CustomerForm();
		String sql = "SELECT name, gender, address, id_type, id_no, priority FROM Customer WHERE cust_id=?";
		try {
			conn = DBConnection.getConnection("demo_ds");
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				cf.setName(rs.getString("name"));
				cf.setGender(rs.getString("gender"));
				cf.setAddress(rs.getString("address"));
				cf.setAddress(rs.getString("id_type"));
				cf.setAddress(rs.getString("id_no"));
				cf.setAddress(rs.getString("priority"));
			}
		} finally {
			conn.close();
		}
		return cf;
	}
}
