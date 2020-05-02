package colecciones.deitel;

import java.util.EmptyStackException;
import java.util.Stack;

public class PruebaStack {
	
	public PruebaStack() {
		
		Stack< Number > pila = new Stack< Number >();
		
		//crea numeros para almacenarlos en la pila
		Long numerolong = 12L;
		Integer numeroInt = 34567;
		Float numeroFloat = 1.0F;
		Double numeroDouble = 1234.5678;
		
		//usa el metodo push
		pila.push( numerolong );
		imprimirPila( pila );
		pila.push( numeroInt );
		imprimirPila( pila );
		pila.push( numeroFloat );
		imprimirPila( pila );
		pila.push( numeroDouble );
		imprimirPila( pila );
		
		//elimina los elementos de la pila
		try {
			Number objetoEliminado = null;
			
			//saca elementos de la pila
			while ( true ) {
				objetoEliminado = pila.pop();
				System.out.printf("%s se acabo\n", objetoEliminado);
				imprimirPila( pila );
			}//fin while
		}catch ( EmptyStackException emptyStackException){
			emptyStackException.printStackTrace();
		}//fin catch
	}//fin constructor de pruebaStack

	private void imprimirPila( Stack< Number > pila ) {
		if ( pila.isEmpty() ) {
			System.out.print("la pila esta vacia\n\n");
		}else{
			System.out.print("la pila contiene: ");
			//itera a travez de los elementos
			for ( Number numero : pila ) {
				System.out.printf("%s", numero );
			}//fin for
			System.out.println( "(superior) \n\n" );
		}//fin else
	}//fin del metodo
	
	public static void main(String[] args) {
		new PruebaStack();
	}
}
