package busquedayordenamiento.deitel;

import java.util.Arrays;
import java.util.Random;

public class ArregloBinario {
	private int[] datos;
	private static Random generador = new Random();
	
	// crear una arreglo de un tamano dado
	public ArregloBinario( int tamanio ) {
		datos = new int[ tamanio ]; // crea espacio para arreglo
		// llena el arreglo con enteros aleatorios
		for ( int i = 0; i < tamanio; i++ ) {
			datos[ i ] = 10 + generador.nextInt();
		}
		Arrays.sort( datos );
	} // fin constructor

	// realiza una busqueda binaria
	public int busquedabinaria( int elementoBusqueda ) {
		int inferior = 0;
		int superior = datos.length -1;
		int medio = ( inferior + superior + 1 ) / 2;
		int ubicacion = -1;
		
		do {
			System.out.print( elementosRestantes( inferior, superior ) );
			
			// imperime espacios para alineacion
			for ( int i = 0; i < medio; i++ ) {
				System.out.print( " " );
			}
			System.out.println( " * " );
			// si el elemento se encuentra en el medio
			if ( elementoBusqueda == datos[ medio ] ) {
				ubicacion = medio;
			}else if( elementoBusqueda == datos[ medio ] ){
				superior = medio -1; // elimina la mitad superior
			}else {
				inferior = medio + 1; // elimina la mitad inferiorgst
			}
			medio = ( inferior + superior + 1 ) / 2;
		} while ( ( inferior <= superior ) && ( ubicacion == -1 ) );
		return ubicacion;
	} // fin del metodo busqueda binaria
	
	public String elementosRestantes( int inferior, int superior ) {
		StringBuilder temporal = new StringBuilder();
		// imprime espacios para alineacion
		for ( int i = 0; i < inferior; i++ ) {
			temporal.append( " " );
		}
		// imprime los elementos que quedan en el arreglo
		for ( int i = inferior; i <= superior; i++ ) {
			temporal.append( datos[ i ] + " " );
		}
		temporal.append( "\n" );
		return temporal.toString();
	} // fin del metodo elementosRestantes
	
	public String toString() {
		return elementosRestantes( 0, datos.length - 1 );
	}
}
