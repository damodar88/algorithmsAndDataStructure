package busquedayordenamiento.deitel;

import java.util.Random;

public class OrdenamientoSeleccion {
	
	private int[] datos;
	private static Random generador = new Random();
	
	public OrdenamientoSeleccion( int tamanio ) {
		datos = new int[ tamanio ];
		for( int i = 0; i < tamanio; i++ ) {
			datos[ i ] = 10 + generador.nextInt( 90 );
		}
	}
	
	public void orenar() {
		int masPequeno;
		for ( int i = 0; i < datos.length -1; i++ ) {
			masPequeno =i;
			for ( int indice = i + 1; indice < datos.length; indice++  ) {
				if ( datos[ indice ] < datos[ masPequeno ] ) {
					masPequeno = indice;
				}
			}
			intercambiar( i, masPequeno );
			imprimirPasada( i + 1, masPequeno );
		}
	}
	
	public void intercambiar( int primero, int segundo ) {
		int temporal = datos[ primero ];
		datos[ primero ] = datos[ segundo ];
		datos[ segundo ] = temporal;
	}
	
	public void imprimirPasada( int pasada, int indice ) {
		System.out.println( String.format( "despues de pasada %2d: ", pasada ) );
		
		for ( int i = 0; i < indice; i++ ) {
			System.out.println( datos[ i ] + " " );
		}
		
		System.out.println( datos[ indice ] + "* " );
		
		for ( int i = indice + 1; i < datos.length; i++ ) {
			System.out.println( datos[ i ] + " " );
		}
		
		System.out.println( "\n               " );
		
		for ( int j = 0; j < pasada; j++ ) {
			System.out.println( "-- " );
		}
		
		System.out.println( "\n" );
	}
	
	public String toString(){
		StringBuilder temporal = new StringBuilder();
		
		for( int elemento : datos ) {
			temporal.append( elemento + " " );
		}
		
		temporal.append( "\n" );
		return temporal.toString();
	}
	
}
