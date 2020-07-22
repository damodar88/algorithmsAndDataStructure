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
		int indiceCombinado = izquierdo;
		int[] combinado = new int[ datos.length ];
		
		// imprime en pantalla los dos subarreglos antes de combinarlos
		System.out.println( "combinacion: "+ subarreglo( izquierdo, medio1 ) );
		System.out.println( "             "+ subarreglo( medio2, derecho ) );
		
		// combina los arreglos hasta llegar al final de uno de ellos
		while ( indiceIzq <= medio1 && indiceDer <= derecho ) {
			// coloca el menor de los dos elementos actuales en el resultado
			// y lo mueve al siguiente espacio en los arreglos
			if( datos[ indiceIzq ] <= datos[ indiceDer ] ) {
				combinado[ indiceCombinado ++ ] = datos[ indiceIzq ++ ];
			}else {
				combinado[ indiceCombinado ++ ] = datos[ indiceDer ++ ];
			}
		} // fin while
		
		// si el arreglo izquierdo esta vacio
		if ( indiceIzq == medio2 ) {
			// copia el resto del arreglo derecho
			while ( indiceDer <= derecho ) {
				combinado[ indiceCombinado ++ ] = datos[ indiceDer ++ ];
			}
		}else { // arreglo derecho esta vacio
			// copia el resto del arreglo izquierdo
			while ( indiceIzq <= medio1 ) {
				combinado[ indiceCombinado ++ ] = datos[ indiceIzq ++];
			}
		}
		
		// copia los valores de vuelta al arreglo original
		for (int i = izquierdo; i <= derecho; i++) {
			datos[ i ] = combinado[ i ];
		}
		
		// imprime en pantalla el arreglo combinado
		System.out.println( "       "+ subarreglo( izquierdo, derecho ) );
		System.out.println();
	} // fin del metodo combinar
	
	// metedo para imprimir en pantalla ciertos valores en el arreglo
	public String subarreglo( int inferior, int superior ) {
		StringBuilder temporal = new StringBuilder();
		
		// imprime en pantalla espacios para la alineacion
		for (int i = 0; i < inferior; i++) {
			temporal.append( "     " );
		}
		
		// imprime en la pantalla el resto de los elementos en el arreglo
		for (int i = inferior ; i <= superior; i++) {
			temporal.append( " " + datos[ i ] );
		}
		
		return temporal.toString();
	} // fin del metodo  subbarreglo
	
	public String toString() {
		return subarreglo( 0, datos.length - 1 );
	}
}
