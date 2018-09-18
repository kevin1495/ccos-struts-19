package form;

import java.util.ArrayList;
import java.util.HashMap;

public class CardForm extends BaseForm{
	private String code;
	private String name;
	private String isDeactivated;
	private String reason;
	private String dateCreated;
	private String createdBy;
	private String dateUpdated;
	private String updatedBy;
	private ArrayList<HashMap<String, String>> listData;
	
	public ArrayList<HashMap<String, String>> getListData() {
		return listData;
	}
	public void setListData(ArrayList<HashMap<String, String>> listData) {
		this.listData = listData;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsDeactivated() {
		return isDeactivated;
	}
	public void setIsDeactivated(String isDeactivated) {
		this.isDeactivated = isDeactivated;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
}
