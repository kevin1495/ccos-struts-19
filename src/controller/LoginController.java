package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.LoginForm;
import service.LoginService;

public class LoginController extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		LoginForm mLoginForm = (LoginForm) form;
		String pageForward = "login";
		String task = mLoginForm.getTask();
		HttpSession session = request.getSession(true);
		
		LoginService loginService = new LoginService();
		if("doLogin".equals(task)) {
			if(loginService.doLogin(mLoginForm)) {
				pageForward = "home";
				//mLoginForm.setLoggedUser(mLoginForm.getUsername());
				session.setAttribute("name", "hmm" + mLoginForm.getUsername());
				
				session = request.getSession(false);
				System.out.println("Hola" + session.getAttribute("name"));
			}
			else {
				pageForward = "login";
			}
		}
		
		return mapping.findForward(pageForward);
	}
}
