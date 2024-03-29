package colection;
//pag 801 Fig 19.4
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaList {
	
	private static final String colores[] = {"negro ", "amarillo ", "verde ", "azul ", "violeta ", "plateado "};
	private static final String colores2[] = {"dorado ", "blanco ", "cafe ", "azul ", "gris ", "plateado "};
	
	//establece y manipula objetos LinkedList
	public PruebaList() {
		List< String > lista1 = new LinkedList< String >();
		List< String > lista2 = new LinkedList< String >();
		
		//agrega elementos ala lista enlace
		for ( String color : colores ) {
			lista1.add( color );
		}
		
		//agrega elementos ala lista enlace2
		for ( String color : colores2 ) {
			lista2.add( color );
		}
		
		lista1.addAll( lista2 ); //concatena las listas
		lista2 = null; //libera los recursos
		imprimirLista( lista1 ); //imprime los elementos de la lista1
		
		convertirCadenasAMayusculas( lista1 ); //convierte cadena a mayusculas
		imprimirLista( lista1 ); //imprime los elementos de la lista1
		
		System.out.print("\nEliminando elementos 4 a 6...");
		eliminarElementos( lista1, 4, 7 ); //eliminar los elementos 4 a 7 de la lista
		imprimirLista( lista1 ); //imprime los elementos de lista1
		imprimirListaInversa( lista1 ); //imprime la lista en orden inverso	
	}//fin del constructor de PruebaList

	//imprime el contenido del objeto List
	public void imprimirLista( List< String > lista ) {
		System.out.println("\nlista: ");
		
		for ( String color : lista ) {
			System.out.printf("%s", color);
		}
		
		System.out.println();
	}//fin del metodo imprimirLista
	
	//localiza los objetos String y los convierte a mayusculas
	private void convertirCadenasAMayusculas( List< String > lista ) {
		ListIterator< String > iterador = lista.listIterator();
		
		while ( iterador.hasNext() ) {
			String color = iterador.next(); //obtiene elemento
			iterador.set( color.toUpperCase() ); //convierte a mayusculas
		}//fin while
	}//fin del metodo convertirCadenasAMayusculas
	
	//obtine sublista y utiliza elmetodo clear para eliminar los elementos de la misma
	private void eliminarElementos( List< String > lista, int inicio, int fin ) {
		lista.subList( inicio, fin ).clear(); //elimina los elementos
	}//fin del metodo eliminarElementos

	//imprime la lista inversa
	private void imprimirListaInversa( List< String > lista ) {
		ListIterator< String > iterador = lista.listIterator( lista.size() );
		
		System.out.println("\nLista inversa:");
		
		//imprime la lista en orden inverso
		while ( iterador.hasPrevious() ) {
			System.out.printf("%s", iterador.previous() );
		}
	}//fin del metodo imprimirListaInversa
	
	public static void main(String args[]) {
		new PruebaList();
	}//fin del metodo main
}//fin de la clase PruebaList









