package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MetodosCollections {

	private Character[] letras = { 'A', 'B', 'c', 'D', 'E' };
	private Character[] copiaLetras;
	private List< Character > lista;
	private List< Character > copiaLista;
	
	public MetodosCollections() {
		lista = Arrays.asList( letras );
		imprimir( lista );
		
		System.out.println("\nLista inversa: ");
		Collections.reverse(lista);
		imprimir( lista );
		
		copiaLetras = new Character[3];
		copiaLetras = { 'Z', 'W', 'V' };
		
		copiaLista = Arrays.asList( copiaLetras );
		
		
		System.out.println("\nCopia Lista: ");
		Collections.copy( copiaLista , lista );
		//imprimir( copiaLista );
		
		
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
