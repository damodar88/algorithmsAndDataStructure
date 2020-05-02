package colecciones.deitel;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {
	
	private static final String nombres[] = {"amarillo", "verde", "negro", "carne", "gris", "blanco", "naranjo", "rojo", "verde"};
	
	//crea un constructor ordenado con TreeSet y despues lo manipula
	public PruebaSortedSet() {
		//crea el objeto treeSet
		SortedSet< String > arbol = new TreeSet< String >( Arrays.asList( nombres ) );
	
		System.out.println( "conjunto ordenado: n" );
		imprimirConjunto( arbol );
		
		System.out.print( "\nheadSet (\"naranja\"): " );
		imprimirConjunto( arbol.headSet( "naranja" ) );
		
		//obtiene subconjunto mediante tailSet, con base en "naranja"
		imprimirConjunto( arbol.tailSet( "naranja" ) );
		
		//obtiene los elementos primero y ultimo
		System.out.printf( "primero: %s\n", arbol.first() );
		System.out.printf( "ultimo : %s\n", arbol.last() );
	}//fin del constructor
	
	private void imprimirConjunto( SortedSet< String > conjunto ) {
		for ( String s : conjunto ) {
			System.out.printf( "%s", s);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new PruebaSortedSet();
	}
}
