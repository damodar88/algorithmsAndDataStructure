package patronesdiseno.creacional.herencia.factorimethod.pizza;

public class Napolitana  implements Pizza {

	@Override
	public IngredientesDTO armarPizza(IngredientesDTO ingredientesDTO) {
		IngredientesDTO ingredientes = new IngredientesDTO();
		ingredientes.setMasa(ingredientesDTO.getMasa());
		ingredientes.setQueso(ingredientesDTO.getQueso());
		ingredientes.setOregano(ingredientesDTO.getOregano());
		ingredientes.setTomate(ingredientesDTO.getTomate());
		return ingredientes;
	}

}
