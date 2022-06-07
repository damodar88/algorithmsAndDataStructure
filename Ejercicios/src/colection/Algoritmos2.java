package colection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Algoritmos2 {

	private String[] colores = {"rojo", "blanco", "amarillo", "azul"};	
	private List< String >  lista;
	private Vector< String > vector = new Vector< String >();
	
	//crea objetos List y vector
	public Algoritmos2() {
		
		//iniciliza lista vector
		lista = Arrays.asList( colores );
		vector.add( "negro" );
		vector.add( "rojo" );
		vector.add( "verde" );
		
		System.out.println("Antes de addAll, el vector contiene: ");
		
		//muestra elementos de vector
		for ( String s : vector) {
			System.out.printf("%s", s);
		}
		
		//agrega los elementos en colores a list
		Collections.addAll( vector, colores);
		
		System.out.println("\n\nDespues de addAll, el vector contiene: ");
		
		for ( String s : vector ) {
			System.out.printf("%s", s);
		}
		
		int frecuencia = Collections.frequency( vector, "rojo");
		System.out.printf("\n\nFrecuencia de rojo en el vector: %d\n", frecuencia);
		
		boolean desunion = Collections.disjoint( lista, vector );
		System.out.printf("\nlista y vector %s elementos en comun\n", ( desunion ? "no tienen" : "tienen" ));
	
	}
	
	
	public static void main(String[] args) {
		new Algoritmos2();
	}

}
