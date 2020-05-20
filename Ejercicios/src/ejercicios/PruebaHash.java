package ejercicios;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;	

public class PruebaHash {
	
	private static final String sibilizaciones[] = {"aztecas", "mayas", "bizantinos", "ingleses", "hunos", "mongoles", "mongoles", "mongoles"};
	
	public PruebaHash() {
		List< String > lista = Arrays.asList( sibilizaciones );
		System.out.printf( "ArrayList: %s\n", lista );
		imprimirSinDuplicados( lista );
	}

	private void imprimirSinDuplicados( Collection< String > coleccion ) {
		Set< String > conjuntoSet = new HashSet< String >( coleccion );
		
		Iterator< String > iterador = conjuntoSet.iterator();
		while( iterador.hasNext() ) {
			String it = iterador.next();
			System.out.printf( "%s\n", it );
		}
	}
	
	public static void main(String[] args) {
		new PruebaHash();
	}
}