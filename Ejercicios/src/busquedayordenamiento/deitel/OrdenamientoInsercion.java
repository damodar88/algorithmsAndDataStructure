package busquedayordenamiento.deitel;

import java.util.Random;

public class OrdenamientoInsercion {
	
	private int datos[];
	private static Random generador = new Random();

	public OrdenamientoInsercion( int tamanio ) {
		datos = new int[ tamanio ];
		for ( int i = 0; i < tamanio; i++ ) {
			datos[ i ] = 10 + generador.nextInt( 90 );
		}
	}
	
	public void sort() {
		int insercion;
		for ( int siguiente = 1; siguiente < datos.length; siguiente ++ ) {
			insercion = datos[ siguiente ];
			int moverElemento = siguiente;
			
			while( moverElemento > 0 && datos[ moverElemento -1 ] > insercion ) {
				datos[ moverElemento ] = datos[ moverElemento -1 ];
				moverElemento--;
			}
			
			datos[ moverElemento ] = insercion;
			imprimirPasada( siguiente, moverElemento );
		}
	}
	
	public void imprimirPasada( int pasada, int indice ) {
		System.out.println( String.format( "despues de pasada %2d: ", pasada ) );
		
		for ( int i =0; i < indice; i++ ) {
			System.out.println( datos[ i ] + "" );
		} 
		
		System.out.println( datos[ indice ] + "* " );
		
		for ( int i = indice + 1; i < datos.length; i++ ) {
			System.out.println( datos[ i ] + "    " );
		}
		System.out.println( "\n              " );
		
		for ( int i = 0; i <= pasada; i++  ) {
			System.out.println( "-- " );
		}
		
		System.out.println( "\n" );
	}

	public String toString() {
		StringBuilder temporal = new StringBuilder();
		
		for ( int elemento : datos ) {
			temporal.append( elemento + " " );
		}
		
		temporal.append( "\n" );
		return temporal.toString();
	}
	
}
