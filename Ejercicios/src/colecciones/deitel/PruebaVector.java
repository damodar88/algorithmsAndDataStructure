//fig 19.6: PruebaVector
//Uso de vector
//pag 806
package colecciones.deitel;

import java.util.Vector;
import java.util.NoSuchElementException;

public class PruebaVector {
	
	private static final String colores[] = { "rojo", "blanco ", "azul " };

	public PruebaVector() {
		Vector< String > vector = new Vector< String >();
		
		imprimirVector( vector );
		
		for ( String color : colores ) {
			vector.add( color );
		}
		
		imprimirVector( vector );
		
		//imprime los elementos primero y ultimo
		try {
			System.out.printf("Primer elemento %s\n", vector.firstElement());
			System.out.printf("Ultimo elemento %s\n", vector.lastElement());
		}catch (NoSuchElementException exception) {
			exception.printStackTrace();
		}
		
		//¿el vector contiene "rojo"?
		if( vector.contains("rojo") ) {
			System.out.printf("\nse encontro \"rojo\" en el indice %d\n\n", vector.indexOf( "rojo" ) );
		}else {
			System.out.println("\n no se encontro \"rojo\" \n");
		}

		vector.remove("rojo");
		System.out.println("se elimino el \"rojo\" ");
		imprimirVector( vector );
		
		if ( vector.contains( "rojo" ) ) {
			System.out.printf("se encontro \"rojo\" en el indice %d\n", vector.indexOf( "rojo" ) );
		}else {
			System.out.println(" no se encontro el \"rojo\" ");
		}
		
		System.out.printf("\nTamaño: %d\nCapacidad: %d\n", vector.size(), vector.capacity() );
		
	}

	private void imprimirVector( Vector< String > vectorAImprimir ) {
		if( vectorAImprimir.isEmpty() ) {
			System.out.println("El vector esta vacio");
		}else {
			System.out.println("El vector contiene: ");
			
			for ( String elemento : vectorAImprimir ) {
				System.out.printf("%s", elemento);
			} //fin for
		}//fin else
		System.out.println("\n");
	}//fin del metodo
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PruebaVector();
	}

}
