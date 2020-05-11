package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MetodosCollections {

	private Character[] letras = { 'A', 'B', 'C', 'D', 'E' };
	private Character[] letrasMinusculas = { 'a', 'b', 'c', 'd', 'e'};
	private List< Character > lista;
	private List< Character > copiaLista;
	
	public MetodosCollections() {
		lista = Arrays.asList( letras );
		imprimir( lista );
		System.out.println("");
		
		System.out.println("\nLista inversa: ");
		Collections.reverse(lista);
		imprimir( lista );
		
		
		copiaLista = Arrays.asList( letrasMinusculas );
		System.out.println("");
		
		
		System.out.println("\nCopia Lista: ");
		Collections.copy( lista, copiaLista );
		imprimir( copiaLista );
		
		System.out.println( "\n" );
		System.out.println( "Relleno con R con el metodo fill: " );
		Collections.fill( lista, 'R');
		imprimir( lista );
		
		System.out.println( "\n" );
		System.out.println( "Imprimo la lista ordenada metodo sort: " );
		Collections.sort( copiaLista );
		imprimir( copiaLista );
		

	}
	
	private void imprimir( List< Character > refLista ) {
		System.out.println("La lista es: ");
		
		for ( Character caracter : refLista ) 
		{
			System.out.printf("%s", caracter);
		}
		System.out.printf( "\nMax: %s", Collections.max( refLista ) );
		System.out.printf( "\nMin: %s", Collections.min( refLista ) );
	}
	
	
	public static void main(String[] args) {
		new MetodosCollections();
	}
	
}
