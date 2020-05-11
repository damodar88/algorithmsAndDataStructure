package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class BusquedaEjercicio {
	
	
	private static String colores[] = { "Amarillo", "Verde", "rojo", "azul" }; 
	private static String arboles[] = { "castaño" , "cereso", "manzano", "araucaria" };
	private List< String > lista;
	private Vector< String > listaCompleta = new Vector< String >(); 
	
	public BusquedaEjercicio() {
		
		lista = Arrays.asList( colores );
		busqueda( "rojo", lista );
		
		
		System.out.println("\n");
		Collections.addAll( listaCompleta , colores );
		Collections.addAll( listaCompleta , arboles );
		for ( String s : listaCompleta ) {
			System.out.printf( "%s", s );
		}
		
	}
	
	private void busqueda( String clave, List< String > listaBusqueda ) {
		
		int result = 0;
		result = Collections.binarySearch( listaBusqueda, clave );
		
		System.out.printf( "A buscar %s\n", clave );
		if ( result >= 0 ) {
			System.out.printf( "Se encontro en el indice %d", result );
		}else {
			System.out.printf( "No se encontro (%d)", result );
		}
	}
	
	public static void main(String[] args) {
		new BusquedaEjercicio();
	}
	

}
