package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ejercicios2 {
	
	private static final String frutas[] = {"platano ", "manzana ", "durasno " };

	private static final String semillas[] = {"girasol ", "zapallo "};
	
	String semillas2[] = {"girasol ", "zapallo "};
	
	public void operacionConListas() {
		
		List< String > listaFrutas = new LinkedList< String >();
		List< String > listaSemillas = new LinkedList< String >();
		
		for ( String f : frutas ) {
			listaFrutas.add(f);
		}
		
		for ( String s : semillas ) {
			listaSemillas.add(s);
		}
		
		imprimirLista(listaFrutas);
		System.out.println("");
		imprimirLista(listaSemillas);
		System.out.println("");
		listaSemillas.addAll( listaFrutas );
		System.out.println("");
		imprimirLista(listaSemillas);
		System.out.println("");
		convertirAMallusculas(listaSemillas);
		imprimirLista(listaSemillas);
		
		System.out.println("");
		imprimirListaInversa( listaSemillas );
		
		System.out.println("");
		eliminarLista(listaSemillas, 0, 2);
		
		System.out.println("");
		imprimirLista( listaSemillas );
		
		
		LinkedList< String > copia= new LinkedList < String >( Arrays.asList( semillas2  ) );
		
		copia.addLast( "magnolias" );
		copia.add("rosas");
		copia.addFirst("pensamientos");
		copia.add(2, "rododendro");
		
		Collections.sort( copia );
		
		semillas2 = copia.toArray( new String[ copia.size() ] );
		
		System.out.println("");
		for ( String it : semillas2  ) {
			System.out.printf("%s",it);
		}
		
		
		
	}
	
	public void convertirAMallusculas( List < String > list ) {
		ListIterator< String > iterador = list.listIterator();
		
		while ( iterador.hasNext() ) {
			String semillas = iterador.next();
			 iterador.set( semillas.toUpperCase() ); 
		}		
	}
	
	
	public void imprimirLista( List< String > lista ) {
		for ( String itt : lista ) {
			System.out.printf("%s",itt);
		}
	}
	
	public void imprimirListaInversa( List< String > lista ) {
		
		ListIterator< String > iterador = lista.listIterator( lista.size() );
		
		System.out.println("\n Lista inversa: ");
		
		while ( iterador.hasPrevious() ) {
			System.out.printf("%s", iterador.previous());
		}
	}
	
	public void eliminarLista( List < String > list , int inicio, int fin ) {
		list.subList(inicio, fin).clear();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicios2 ej2 = new Ejercicios2();
		ej2.operacionConListas();

	}

}
