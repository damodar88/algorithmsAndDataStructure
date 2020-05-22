package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PruebaMetodosCollections2 {
	
	private static final String paises[] = {"Chile", "Argentina", "Brasil", "Bolivia", "Peru" };
	
	public PruebaMetodosCollections2() {
		List< String > lista = new ArrayList< String >( Arrays.asList( paises ) );
		List< String > lista2 = new ArrayList< String >();
		List< String > copia2 = new ArrayList<>();
		imprimirArray( lista );
		
		lista2.add( "Mexico" );
		
		System.out.println( "\nSingleton: " );
		List< String > copia = Collections.singletonList( "valor" );
		imprimirArray( copia );
		
		lista.addAll( lista2 );
				
		System.out.println( "\nLista concatenada: " );
		imprimirArray( lista );
		
		
		for ( String s : lista ) {
			copia2.add( s );
		}
		
		System.out.printf( "\nLista copia2 contiene: " );
		imprimirArray(copia2);
		
	} 

	private void imprimirArray( Collection< String > list ) {
		Iterator< String > iterator = list.iterator();
		while( iterator.hasNext() ) {
			String it = iterator.next();
			System.out.printf( "%s", it );
		}
	}
	
	public static void main(String[] args) {
		new PruebaMetodosCollections2();
	}
}
