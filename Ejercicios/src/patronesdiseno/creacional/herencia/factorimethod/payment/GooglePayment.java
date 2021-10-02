package patronesdiseno.creacional.herencia.factorimethod.payment;

public class GooglePayment implements Payment {

	@Override
	public void doPayment() {
		System.out.println("Pago con googlo payment");
	}
	
	

}
