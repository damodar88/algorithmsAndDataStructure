package colecciones.deitel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamiento1 {

	private static final String palos[]= { "Corazones", "Diamantes", "Bastones", "Espadas" };
	
	public void imprimirElementos() {
		List< String > lista = Arrays.asList( palos );
		System.out.printf("Elementos del arreglo desordenados: \n%s\n", lista);
		
		Collections.sort( lista );
		
		System.out.printf("elementos en el arreglo ordenados: \n%s\n", lista);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenamiento1 orden1 = new Ordenamiento1();
		orden1.imprimirElementos();
	}

}
