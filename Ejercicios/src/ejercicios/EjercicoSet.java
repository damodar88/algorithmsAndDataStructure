package ejercicios;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EjercicoSet {
	
	private static final String instrumentos[] = { "flauta", "oboe", "eufonium", "violin", "piano", "piano", "piano" };
	
	public EjercicoSet() {
		
		List< String > lista = Arrays.asList( instrumentos );
		
		System.out.println( "\nAntes de set: " );
		imprimirList( lista );
		
		System.out.println( "\nDespues de set: " );
		
		Set< String > listSet = new HashSet< String >( lista );
		imprimirList( listSet );
		
	}

	private void imprimirList( Collection< String > list ) {
		
		Iterator iterador = list.iterator();

		while( iterador.hasNext() ) {
			String it = (String) iterador.next();
			System.out.printf( "%s", it );
		}
	}
	
	public static void main(String[] args) {
		new EjercicoSet();
	}
}
