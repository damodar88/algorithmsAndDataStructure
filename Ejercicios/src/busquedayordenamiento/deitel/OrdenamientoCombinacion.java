package busquedayordenamiento.deitel;

import java.util.Random;

public class OrdenamientoCombinacion {
	
	private int[] datos;
	private static Random generador = new Random();

	public OrdenamientoCombinacion( int tamanio ) {
		datos = new int[ tamanio ];
		for ( int i = 0; i < tamanio; i++ ) {
			datos[ i ] = 10 + generador.nextInt( 90 );
		}
	}
	
	public void ordenar() {
		ordenarArreglo( 0, datos.length -1 );
	}
	
	private void ordenarArreglo( int inferior, int superior ) {
		
		if ( ( superior - inferior ) >= 1  ) {
			int medio1 = ( inferior + superior ) / 2;
			int medio2 = medio1 + 1;
			
			System.out.println( "ddivision: " + subarreglo( inferior, superior) );
			System.out.println( "           " + subarreglo( inferior, medio1 ) );
			System.out.println( "           " + subarreglo( medio2, superior ) );
			System.out.println();
			
			ordenarArreglo( inferior, medio1 );
			ordenarArreglo( medio2, superior );
			combinar( inferior, medio1, medio2, superior );
		}
	}
	
	private void combinar( int izquierdo, int medio1, int medio2, int derecho ) {
		int indiceIzq = izquierdo;
		int indiceDer = medio2;
	}
	
	
}
