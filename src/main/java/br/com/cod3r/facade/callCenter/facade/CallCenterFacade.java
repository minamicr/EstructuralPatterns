package br.com.cod3r.facade.callCenter.facade;

import br.com.cod3r.facade.callCenter.model.Card;
import br.com.cod3r.facade.callCenter.model.Register;
import br.com.cod3r.facade.callCenter.services.CardService;
import br.com.cod3r.facade.callCenter.services.PaymentService;
import br.com.cod3r.facade.callCenter.services.RegisterService;
import br.com.cod3r.facade.callCenter.services.ReportService;
import br.com.cod3r.facade.callCenter.services.SecurityService;
import java.util.List;

public class CallCenterFacade {
  private CardService cardService;
  private PaymentService paymentService;
  private RegisterService registerService;
  private ReportService reportService;
  private SecurityService securityService;

  public CallCenterFacade() {
    this.cardService = new CardService();
    this.registerService = new RegisterService();
    this.paymentService = new PaymentService(registerService);
    this.reportService = new ReportService(registerService);
    this.securityService = new SecurityService(cardService, registerService);
  }

  public Card getCardByUser(Long user){
    return cardService.getCardByUser(user);
  }

  public void getSummary(Card card){
    reportService.getSumary(card);
  }

  public void getPaymentInfo(Card card) {
    paymentService.getPaymentInfoByCard(card);
  }

  public Card cancelLastShopping(Card card) {
    System.out.println("\nCANCELING LAST SHOPPING");
    registerService.removeByIndex(card, registerService.getRegistersByCard(card).size() - 1);
    List<Register> pendings = securityService.blockCard(card);
    Card newCard = cardService.createNewCard(123456L, 33445566L);
    registerService.addCardRegisters(newCard, pendings);
    System.out.println("CANCELLING FINISHED\n");
    return newCard;

  }
}
