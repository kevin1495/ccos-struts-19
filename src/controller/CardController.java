package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.CardForm;
import service.CardService;

public class CardController extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		CardForm mCardForm = (CardForm) form;
		String pageForward = "openAdd";
		System.out.println("-----");
		String task = mCardForm.getTask();
		
		CardService cardService = new CardService();
		if("addCard".equals(task)) {
			if(cardService.addCard(mCardForm, request)>0) {
				pageForward = "openList";
				cardService.viewAllCard(mCardForm);
			}
			else
				pageForward = "openAdd";
		} else if("openList".equals(task)) {
			pageForward = "openList";
			cardService.viewAllCard(mCardForm);
		} else if(task!= null && task.toString().startsWith("openDetail")){
			pageForward = "openDetail";
			System.out.println("*******" + task);
			cardService.viewCardByCode(mCardForm, task.substring(10));
		}
		
		
		return mapping.findForward(pageForward);
	}

}
