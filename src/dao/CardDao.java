package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import form.CardForm;
import util.DBConnection;

public class CardDao {
	public int insertCard( String code, String name, String isDeactivated, String reason,
			String createdBy, String updatedBy) throws Exception{
		Connection conn = null;
		PreparedStatement ps;
		int result = 0;
		String sql = "INSERT INTO Card(code, name, is_deactivated, reason, date_created, created_by, date_updated, updated_by)"
				+ "VALUES(?, ?, ?, ?, SYSDATE, ?, SYSDATE, ?)";
		try {
			conn = DBConnection.getConnection("demo_ds");
			ps = conn.prepareStatement(sql);
			ps.setString(1, code);
			ps.setString(2, name);
			ps.setString(3, isDeactivated);
			ps.setString(4, reason);
			ps.setString(5, createdBy);
			ps.setString(6, updatedBy);
			result = ps.executeUpdate();
		} finally {
			conn.close();
		}
		return result;
	}
	
	public ArrayList<HashMap<String, String>> getAllCard() throws Exception{
		Connection conn = null;
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		HashMap<String, String> map;
		String sql = "SELECT code, name, is_deactivated, reason FROM Card";
		PreparedStatement ps;
		ResultSet rs;
		
		try {
			conn = DBConnection.getConnection("demo_ds");
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				map = new HashMap<String, String>();
				map.put("code", rs.getString("code"));
				map.put("name", rs.getString("name"));
				map.put("is_deactivated", rs.getString("is_deactivated"));
				map.put("reason", rs.getString("reason"));
				list.add(map);	
			}
		} finally {
			conn.close();
		}
		
		return list;
	}
	
	public CardForm getCardByCode(String code) throws Exception{
		Connection conn = null;
		String sql = "SELECT code, name, is_deactivated, reason,"
				+ "date_created, created_by, date_updated, updated_by FROM Card WHERE code = ?";
		PreparedStatement ps;
		ResultSet rs;
		CardForm mCardForm = null;
		
		try {
			conn = DBConnection.getConnection("demo_ds");
			ps = conn.prepareStatement(sql);
			ps.setString(1, code);
			rs = ps.executeQuery();
			if(rs.next()) {
				mCardForm = new CardForm();
				mCardForm.setCode(rs.getString("code"));
				mCardForm.setName(rs.getString("name"));
				mCardForm.setIsDeactivated(rs.getString("is_deactivated"));
				mCardForm.setReason(rs.getString("reason"));
				mCardForm.setDateCreated(rs.getString("date_created"));
				mCardForm.setCreatedBy(rs.getString("created_by"));
				mCardForm.setDateUpdated(rs.getString("date_updated"));
				mCardForm.setUpdatedBy(rs.getString("updated_by"));
			}
		} finally {
			conn.close();
		}
		return mCardForm;
	}
	
	
}
