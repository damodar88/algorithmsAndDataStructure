// Fig. 16.2: ArregloLineal.java
// Clase que contiene un arreglo de enteros aleatorios y un metodo
// que busca en ese arreglo, en formasecuencial
// pag. 687
package busquedayordenamiento.deitel;

import java.util.Random;

public class ArregloLineal {

	private int[] datos; // Arreglo de valores
	private static Random generador = new Random();
	
	// crea un arreglo de un tamano dado, y lo rellena con enteros aleatorios
	public ArregloLineal( int tamanio ) {
		datos = new int[ tamanio ]; // crea un espacio para el arreglo
		
		//llena el arreglo con valores int aleatorios en el rango de 10 a 99
		for ( int i = 0; i < tamanio; i++ ) {
			datos[ i ] = 10 + generador.nextInt( 90 );
		} // fin del constructor
	}
	
	// realiza una busqueda lineal en los datos
	public int busquedaLineal( int claveBusqueda ) {
		for ( int indice = 0; indice < datos.length; indice++ ) {
			if ( datos[ indice ] == claveBusqueda ) {
				return indice;
			}
		}
		return -1;
	}
	
	// metodo para imprimir los valores del arreglo
	public String toString() {
		StringBuilder temporal = new StringBuilder();
		for ( int elemento : datos ) {
			temporal.append( elemento + " " );
		}
		
		temporal.append( "\n" );
		return temporal.toString();
	} // fin del metodo toString
} // fin de la clase
