package patronesdiseno.creacional;

import patronesdiseno.creacional.herencia.factorimethod.payment.Payment;
import patronesdiseno.creacional.herencia.factorimethod.payment.PaymentFactory;
import patronesdiseno.creacional.herencia.factorimethod.payment.TypePyment;

public class Main {

	public static void main(String[] args) {
		probarFactoryMethod();
	}
	
	private static void probarFactoryMethod() {
		Payment payment = PaymentFactory.buildPaymentSwitch(TypePyment.CARD);
		payment.doPayment();
	}
}
