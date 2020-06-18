package busquedayordenamiento.deitel;

import java.util.Scanner;

public class PruebaBusquedaBinaria {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner( System.in );
		
		int enteroABuscar;
		int posicion;
		
		// crea un arreglo y lo muestra en pantalla
		ArregloBinario arregloBusqueda = new ArregloBinario( 15 );
		
		System.out.println( arregloBusqueda );
		
		// obtiene la entrada del usuario
		System.out.print(
				"Escriba un valor entero ( -1 para salir ): "
				);
		enteroABuscar = entrada.nextInt();
		System.out.println();
		
		// recibe un entero como entrada en la forma repetida; -1 termina el programa
		while( enteroABuscar != -1 ) {
			posicion = arregloBusqueda.busquedabinaria( enteroABuscar );
			// el valor de retorno -1 indica que no encontro el entero
			if ( posicion == -1 ) {
				System.out.println( "El entero "+ enteroABuscar +" no se encontro.\n" );
			}else {
				System.out.println( "El entero "+ enteroABuscar +" se encontro en la posicion "+ posicion + ".\n" );
			}
			// obtiene entrada el usuario
			System.out.println(
					"Escriba un valor entero entre (-1 para salir): "
					);
			enteroABuscar = entrada.nextInt(); //lee un entero del usuario
			System.out.println();
		} // fin del while
	} // fin del metodo main
} // fin de la clase PruebaBusquedaBinaria
