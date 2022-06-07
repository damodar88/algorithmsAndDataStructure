package DesignPattern.creation;

import DesignPattern.creation.herencia.factorimethod.payment.Payment;
import DesignPattern.creation.herencia.factorimethod.payment.PaymentFactory;
import DesignPattern.creation.herencia.factorimethod.payment.TypePyment;

public class Main {

	public static void main(String[] args) {
		probarFactoryMethod();
	}
	
	private static void probarFactoryMethod() {
		Payment payment = PaymentFactory.buildPaymentSwitch(TypePyment.CARD);
		payment.doPayment();
	}
}
