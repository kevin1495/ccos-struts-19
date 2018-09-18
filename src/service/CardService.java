package service;

import javax.servlet.http.HttpServletRequest;

import dao.CardDao;
import form.CardForm;

public class CardService {
	public int addCard(CardForm mCard, HttpServletRequest request) {
		int retval = 0;
		String currentSession = "Hi " + request.getSession(false).getAttribute("name");
		//currentSession = "Hello" + request.getUserPrincipal().getName().toString();
		System.out.println("" + currentSession);
		CardDao dao = new CardDao();
		if("on".equals(mCard.getIsDeactivated()))
			mCard.setIsDeactivated("yes");
		else
			mCard.setIsDeactivated("no");
		try {
			retval = dao.insertCard(mCard.getCode(), mCard.getName(), mCard.getIsDeactivated(), mCard.getReason(),
					currentSession, currentSession);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retval;
	}
	
	public void viewAllCard(CardForm mCardForm) {
		CardDao dao = new CardDao();
		try {
			mCardForm.setListData(dao.getAllCard());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void viewCardByCode(CardForm mCardForm, String code) {
		CardDao dao = new CardDao();
		
		try {
			mCardForm.setCode(dao.getCardByCode(code).getCode());
			mCardForm.setName(dao.getCardByCode(code).getName());
			mCardForm.setIsDeactivated(dao.getCardByCode(code).getIsDeactivated());
			mCardForm.setReason(dao.getCardByCode(code).getReason());
			mCardForm.setDateCreated(dao.getCardByCode(code).getDateCreated());
			mCardForm.setCreatedBy(dao.getCardByCode(code).getCreatedBy());
			mCardForm.setDateUpdated(dao.getCardByCode(code).getDateUpdated());
			mCardForm.setUpdatedBy(dao.getCardByCode(code).getUpdatedBy());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
