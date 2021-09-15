package br.edu.ifpb.padroes.payment;

public abstract class PaymentProcessor implements PaymentProcessorHandler {
  private PaymentProcessorHandler next;

  @Override
  public void process(Property property) {}
  
  @Override
  public PaymentProcessorHandler nextProcessor(PaymentProcessorHandler paymentProcessorHandler) {
    this.next = paymentProcessorHandler;
    return this.next;
  }

  protected void runNext(Property property){
    if(this.next != null){
        this.next.process(property);
    }
  }
}
