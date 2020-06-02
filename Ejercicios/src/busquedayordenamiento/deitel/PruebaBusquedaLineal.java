// Fig. 16.3: PruebaBusquedaLineal
// Busca un elemento en el arreglo, en forma secuencial
// Pag 688
package busquedayordenamiento.deitel;

import java.util.Scanner;

public class PruebaBusquedaLineal {
	
	public static void main( String args[] ) {
		// crea objeto Scanner para los datos de entrada
		Scanner entrada = new Scanner( System.in );
		
		int enteroBusqueda; // clave de busqueda
		int posicion; // ubicacion de la clave de busqueda en el arreglo
		
		// crea el arreglo y lo muestra en pantall
		ArregloLineal arregloBusqueda = new ArregloLineal( 10 );
		System.out.println( arregloBusqueda );
		
		//obtiene la entrada del usuario
		System.out.print( "Escriba un valor entero ( -1 para terminar ):" );
		enteroBusqueda = entrada.nextInt(); // lee el primer entero del usuario
		
		// recibe en forma repetiaun entero como entrada; -1 termina el programa
		while( enteroBusqueda != -1 ) {
			posicion = arregloBusqueda.busquedaLineal( enteroBusqueda );
			
			if ( posicion == -1 ) { // no se encontro el entero
				System.out.println( "El entero " + enteroBusqueda + " no se encontro.\n" );
			}else {
				System.out.println( "El entero " + enteroBusqueda + " se encontro el entero en la posicion" + posicion + ".\n"  );
			}
			// obtiene la entrada del usuario
			System.out.println( "Escriba un valor entero (-1 para terminal): " );
			enteroBusqueda = entrada.nextInt(); // lee el siguiente entero del usuario
		} // fin del while
	} // fin del main
} // fin de la clase pruebabusquedalineal
