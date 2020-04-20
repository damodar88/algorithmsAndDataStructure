//Fig. 19.9: Ordenamiento2.java
//Pag 810
package colecciones.deitel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamiento2 {
	
	private static final String palos[] = {"Corazones", "Diamantes", "Bastones", "Espadas"}; 
	
	public void imprimirElementos() {
		List< String > lista = Arrays.asList( palos );
		
		System.out.printf("Elementos del arreglo desordenados: \n%s\n", lista);
		
		Collections.sort( lista, Collections.reverseOrder() );
		
		System.out.printf("Elementos de la lista ordenados: \n%s\n", lista);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenamiento2 ordenamiento = new Ordenamiento2();
		ordenamiento.imprimirElementos();
	}

}
