package service;

import dao.CustomerDao;
import dao.LoginDao;
import form.CustomerForm;
import form.LoginForm;

public class CustomerService {

	public boolean doLogin(LoginForm frm) {
		boolean retval = false;
		
		LoginDao dao = new LoginDao();
		try {
			retval = dao.isUserExist(frm.getUsername(), frm.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retval;
	}
	
	public int registerCustomer(CustomerForm frm) {
		int retval = 0;
		
		CustomerDao dao = new CustomerDao();
		try {
			retval = dao.insertCustomer(frm.getName(), frm.getGender(), frm.getAddress(), frm.getIdType(), frm.getIdNo(), frm.getPriority());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retval;
	}
}
