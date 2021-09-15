package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public interface PaymentProcessorHandler {

    public abstract void process(Property property);
    public abstract PaymentProcessorHandler nextProcessor(PaymentProcessorHandler paymentProcessorHandler);

}
