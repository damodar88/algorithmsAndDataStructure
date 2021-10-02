package patronesdiseno.creacional.herencia.factorimethod.payment;

public class PaymentFactory {

	public static Payment buildPaymentSwitch(TypePyment typePyment) {
		switch (typePyment) {
		case GOOGLEPAY:
			return new GooglePayment();
		case CARD:
			return new CardPayment();
		default:
			return new CardPayment();
		}

	}
}
