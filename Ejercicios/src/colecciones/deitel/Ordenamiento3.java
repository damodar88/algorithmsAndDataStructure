package colecciones.deitel;

import java.util.Collections;
import java.util.List;

public class Ordenamiento3 {
	
	public void imprimirElemento() {
		
		List< Tiempo2 > list = new ArrayList< Tiempo2 >(); //Crea obj List
		
		list.add( new Tiempo2( 6, 24, 34 ) );
		list.add( new Tiempo2( 18, 14, 58 ) );
		list.add( new Tiempo2( 6, 05, 34 ) );
		list.add( new Tiempo2( 12, 14, 58 ) );
		list.add( new Tiempo2( 6, 24, 22 ) );
		
		//imprime los elementos del objeto List
		System.out.println("Elementos del arreglo desordenados:\n%s\n", list);
		
		//ordena usando un contador
		Collections.sort(list, new ComparadorTiempo());
		
		//imprime los elementos del obj list
		System.out.println("Elementos de la lista ordenados:\n%s\n", list);
	}//fin del metodo imprimirElementos

	public static void main(String[] args) {
		Ordenamiento3 ordenamiento3 = new Ordenamiento3();
		ordenamiento3.imprimirElemento();
	}

}
