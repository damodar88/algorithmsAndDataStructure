package colecciones.deitel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PruebaBusquedaBinaria {

	private static final String colores[] = { "rojo", "blanco", "azul", "negro", "amarillo", "morado", "carne", "rosa" };
	private List< String > lista;

	public PruebaBusquedaBinaria() {
		lista = new ArrayList< String >( Arrays.asList( colores ) );
		Collections.sort( lista );
		System.out.printf( "ArrayList ordenado: %s\n", lista );
	}
	
	private void buscar() {
		imprimirResultadosBusqueda( colores[ 3 ] );
		imprimirResultadosBusqueda( colores[ 0 ] );
		imprimirResultadosBusqueda( colores[ 7 ] );
		imprimirResultadosBusqueda( "aqua" );
		imprimirResultadosBusqueda( "gris" );
		imprimirResultadosBusqueda( "verdeazulado" );
	}
	
	private void imprimirResultadosBusqueda( String clave ) {
		int resultado = 0;
		System.out.printf( "\nBuscando: %s\n", clave );
		
		if ( resultado >= 0 ) {
			System.out.printf( "No se encontro en el indice %d\n", resultado );
		}else {
			System.out.printf( "No se encontro (%d)\n", resultado );
		}//fin else
	}//fin metodo imprimirResultado
	
	public static void main( String args[]) {
		PruebaBusquedaBinaria pruebaBusquedaBinaria = new PruebaBusquedaBinaria();
		pruebaBusquedaBinaria.buscar();
	}
}
