package service;

import dao.LoginDao;
import form.LoginForm;

public class LoginService {

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
}
