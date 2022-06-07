package colection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PruebaSet {
	
	private static final String colores[] = { "rojo", "blanco", "azul", "verde", "gris", "naranja", 
			"carne", "blanco", "cyan", "durazno", "gris", "naranja" }; 

	public PruebaSet() {
		List< String > lista = Arrays.asList( colores );
		System.out.printf( "ArrayList: %s\n", lista );
		imprimirSinDuplicados( lista );
	}//fin del constructor
	
	private void imprimirSinDuplicados( Collection< String > colection ) {
		
		Set< String > conjunto = new HashSet< String >( colection );
		
		System.out.println( "\nLos valores sin duplicados son: " );
		for ( String s : conjunto ) {
			System.out.printf( "%s", s );
		}
		System.out.println();
	}//fin del metodo imprimir
	
	public static void main(String[] args) {
		new PruebaSet();
	}
	
}
