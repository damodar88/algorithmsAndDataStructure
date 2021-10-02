package patronesdiseno.creacional;

import patronesdiseno.creacional.herencia.factorimethod.payment.Payment;
import patronesdiseno.creacional.herencia.factorimethod.payment.PaymentFactory;
import patronesdiseno.creacional.herencia.factorimethod.payment.TypePyment;
import patronesdiseno.creacional.herencia.factorimethod.pizza.IngredientesDTO;
import patronesdiseno.creacional.herencia.factorimethod.pizza.Pizza;
import patronesdiseno.creacional.herencia.factorimethod.pizza.PizzaFactory;

public class Main {

	public static void main(String[] args) {
		probarFactoryMethod();
		probarFactoriaMethodPizza();
	}
	
	//ejemplode factory method
	private static void probarFactoryMethod() {
		Payment payment = PaymentFactory.buildPaymentSwitch(TypePyment.CARD);
		payment.doPayment();
	}
	
	
	private static void probarFactoriaMethodPizza() {
		IngredientesDTO ingredientes = new IngredientesDTO();
		Pizza pizza = PizzaFactory.armarPizzaFactory(ingredientes);
		pizza.armarPizza(ingredientes);
	}
}
