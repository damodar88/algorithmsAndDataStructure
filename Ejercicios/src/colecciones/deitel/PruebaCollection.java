package colecciones.deitel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PruebaCollection {

	
	private static final String[] colores = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
	private static final String[] eliminarColores = {"ROJO", "BLANCO", "AZUL" };

	//crea el obj ArrayList , le agrega los colores y lo manipula
	public PruebaCollection() {
		List< String > lista = new ArrayList< String >();
		List< String > eliminarLista = new ArrayList< String >();
		
		//agrega los elementos en el arreglo colores a la lista
		for ( String color : colores ) {
			lista.add( color );
		}
		
		for ( String color : eliminarColores ) {
			eliminarLista.add( color );
		}
		
		System.out.println("ArrayList: ");
	
		//imprime en pantalla el contenido de la lista
		for ( int cuenta = 0; cuenta <lista.size(); cuenta++ ) {
			System.out.printf( "%s", lista.get( cuenta ) );
		}
	
		//eliminar los colores contenidos en eliminarLista
		eliminarColores( lista, eliminarLista );
		
		System.out.println("\n\nArrayList despues de llamar a eliminarColores: ");

		//imprime en pantalla el contenido de la lista
		for ( String color : lista ) {
			System.out.printf("%s", color);
		}	
	}// fin del constructor de PruebaColection

	//elimina de coleccion1 los colores especificados en coleccion2
	private void eliminarColores( Collection< String > coleccion1, Collection< String > coleccion2 ) {
		
		//obtiene el iterador
		Iterator< String > iterador = coleccion1.iterator();
		
		//itera mientras la coleccion tenga elementos
		while( iterador.hasNext() ) {
			if( coleccion2.contains( iterador.next() ) ) {
				iterador.remove();
			}
		}
	}//fin del metodo eliminarcolores
	
	public static void main ( String args[] ) {
		new PruebaCollection();
	}//fin de main
	

}//fin de la clase PruebaCollection
