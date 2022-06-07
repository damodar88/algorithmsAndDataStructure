package DesignPattern.creation.herencia.factorimethod.payment;

public class CardPayment implements Payment {

	@Override
	public void doPayment() {
		System.out.println("Poge con Tarjeto de Credito");
	}
	
}
