package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.CustomerForm;
import service.CustomerService;

public class CustomerController extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		System.out.println("------aku jalan");
		
		CustomerForm mCustomerForm = (CustomerForm) form;
		String pageForward = "";
		String task = mCustomerForm.getTask();
		
		
		CustomerService customerService = new CustomerService();
		if("registerCustomer".equals(task)) {
			int result = customerService.registerCustomer(mCustomerForm);
			System.out.println("-------------------------------" + result);
			if(result>0) {
				pageForward = "viewCustomer";
			}
			else {
				pageForward = "registerCustomer";				
			}
		}
		return mapping.findForward(pageForward);
	}

}
