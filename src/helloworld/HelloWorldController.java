package helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloWorldController extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		HelloWorldForm hellowWorldForm = (HelloWorldForm) form;
		
		String task = hellowWorldForm.getTask();
		String pageForward = "";
		hellowWorldForm.setMessage("Hello World! From Kevin A");
		System.out.println("--------" + task);
		
		if("openHello".equals(task)) {
			pageForward = "hello"; //sesuai name di action mappings struts-config
		}
		
		return mapping.findForward(pageForward);
	}
}
