package patronesdiseno.creacional.herencia.factorimethod.pizza;

public class Vegetariana 	implements Pizza {

	@Override
	public IngredientesDTO armarPizza(IngredientesDTO ingredientesDTO) {
		IngredientesDTO ingredientes = new IngredientesDTO();
		ingredientes.setMasa(ingredientesDTO.getMasa());
		ingredientes.setTomate(ingredientesDTO.getTomate());
		return ingredientes;
	}
}
