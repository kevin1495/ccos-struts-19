package form;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class BaseForm extends ActionForm {

	private String task;
	private String loggedUser;
	
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(String loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	
	
}
