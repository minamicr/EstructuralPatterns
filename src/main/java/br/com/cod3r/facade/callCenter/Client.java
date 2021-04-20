package br.com.cod3r.facade.callCenter;

import br.com.cod3r.facade.callCenter.facade.CallCenterFacade;
import java.util.List;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade callCenterFacade = new CallCenterFacade();

		Card card = callCenterFacade.getCardByUser(123456L);
		callCenterFacade.getSummary(card);
		callCenterFacade.getPaymentInfo(card);

		Card newCard = callCenterFacade.cancelLastShopping(card);
		callCenterFacade.getSummary(newCard);
		callCenterFacade.getPaymentInfo(newCard);
	}
}
