//pag 804 fig 19.5
package colecciones.deitel;

import java.util.Arrays;
import java.util.LinkedList;

public class UsoToArrayLikedList {

	public UsoToArrayLikedList() {
		
		String colores[] = {"Negro ", "azul ", "amarillo "};
		
		System.out.println("Colores antes de agregar: ");
		
		for( String it : colores ) {
			System.out.printf("%s",it);
		}
		
		LinkedList<String> enlaces = new LinkedList<String>( Arrays.asList( colores ) ); 
		
		enlaces.addLast("rojo ");
		enlaces.add("rosa ");
		enlaces.add(3,"verde ");
		enlaces.addFirst("cyan ");
		
		colores = enlaces.toArray( new String[ enlaces.size() ] );
		
		System.out.println("\nColores despues de agregar: ");
		
		for( String it : colores ) {
			System.out.printf("%s",it);
		}
		
	}
	
	public static void main(String args[] ) {
		new UsoToArrayLikedList();
	}
}
