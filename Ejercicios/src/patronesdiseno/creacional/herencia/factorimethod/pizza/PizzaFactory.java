package patronesdiseno.creacional.herencia.factorimethod.pizza;

public class PizzaFactory {
	
	
	public static  Pizza armarPizzaFactory(IngredientesDTO ingredientesDTO) {
		
		if (ingredientesDTO.getNombre().equals("Napolitana")) {
			Napolitana napolitana = new Napolitana();
			napolitana.armarPizza(ingredientesDTO);
			return napolitana;
		}
		
		if (ingredientesDTO.getNombre().equals("Vegetariana")) {
			Vegetariana vegetariana = new Vegetariana();
			vegetariana.armarPizza(ingredientesDTO);
			return vegetariana;
		}
		return null;
	}

}
