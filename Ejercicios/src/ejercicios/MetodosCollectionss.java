package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class MetodosCollectionss {

	private String colores[] = { "amarillo", "rojo", "verde", "azul", "amarillo" };	
	private List< String > lista;
	private Vector< String > vector = new Vector< String >();	
	private List< String > lista2;

	public MetodosCollectionss(){
		lista = Arrays.asList( colores );
		
		vector.add("taique");
		vector.add("nogal");
		vector.add("hualle");
		vector.add("araucaria");
		
		System.out.println("Lista :");
		imprimir( lista );
		
		System.out.println("\n\nAntes del All: ");
		imprimir( vector );
		Collections.addAll( vector , colores);
		System.out.println("\n\nDespues del All: ");
		imprimir( vector );
		
		int frecuencia = Collections.frequency(vector, "amarillo");
		System.out.println("\n\nLa frecuencia de marillo es: " + frecuencia);
		
		boolean desunion = Collections.disjoint(lista, vector);
		System.out.printf("\n\nlista y vector %s elementos en comun\n", (desunion ? "no tienen" : "tienen" )," ", desunion );
		
		Collections.copy( lista2 ,  vector );
		imprimir( lista2 );
		
		
	}

	private void imprimir( Collection< String > list ) {
		for ( String s : list ) {
			System.out.printf("%s", s);
		}
	}
	
	public static void main(String[] args) {
		new MetodosCollectionss();
	}
}
