package colecciones.deitel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algoritmos1 {
	
	private Character[] letras = { 'P', 'C', 'M' };
	private Character[] copiaLetras;
	private List< Character > lista;
	private List< Character > copiaLista;
	
	public Algoritmos1() {
		
		lista = Arrays.asList( letras ); //obtiene el obj List
		copiaLetras = new Character[ 3 ];
		copiaLista = Arrays.asList( copiaLetras ); //vista List de copiaLetras
		
		System.out.println( "Lista inicial: " );
		imprimir( lista );
		
		Collections.reverse(lista);
		System.out.println( "\nDespues de llamar a reverse: " );
		imprimir( lista );
		
		Collections.copy( copiaLista, lista ); //copia el obj List
		System.out.println( "\nDespues de copy: " );
		imprimir( lista );
		
		Collections.fill( lista, 'R' );
		System.out.println( "\nDespues de llamar a fill: " );
		imprimir( lista );
	}//fin del constructor Algoritmos1
	
	private void imprimir( List< Character > refList ) {
		
		System.out.print( "La lista es: " );
		for ( Character elementos : refList ) {
			System.out.printf( "%s ", elementos );
		}
		
		System.out.printf( "\nMax: %s", Collections.max( refList ) );
		System.out.printf( "\nMin: %s\n", Collections.min( refList ) );
	}
	
	public static void main( String args[] ) {
		new Algoritmos1();
	}//fin del main
}//
