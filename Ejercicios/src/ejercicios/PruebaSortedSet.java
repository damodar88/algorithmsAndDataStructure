package ejercicios;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {
	
	private static final String heroes[] = {"fergus", "cuchulain", "Duque Godofredo", "Pendragon", "Sir Lancelot"};

	public PruebaSortedSet() {
		
		SortedSet< String > arbol = new TreeSet< String >( Arrays.asList( heroes ) );
		
		System.out.println( "conjunto ordenado: " );
		imprimirConjunto( arbol );
		
		System.out.println( "\nHeadSet fergus: " );
		imprimirConjunto( arbol.headSet( "fergus" ) );
		
		System.out.println( "\ntailSet fergus: " );
		imprimirConjunto( arbol.tailSet( "fergus" ) );
		
		System.out.printf( "primero: %s\n", arbol.first() );
		System.out.printf( "ultimo: %s\n", arbol.last() );
	}
	
	private void imprimirConjunto( SortedSet< String > conjunto ) {
		Iterator< String > iterador = conjunto.iterator();
		while( iterador.hasNext() ) {
			String it = iterador.next();
			System.out.printf( "%s\n", it );
		}
	}
	
	public static void main(String[] args) {
		new PruebaSortedSet();
	}
	
}
