package ejercicios;

import java.util.Iterator;
import java.util.Stack;

public class PruebaStack {
	
	public PruebaStack() {
		
		Stack< Number > pila = new Stack< Number >();
		
		Long numeroTipoLong = 32L;
		Double numeroTipoDouble = 40D;
		Float numeroTipoFloat = 60F;
		Integer numeroTipoInteger = 80;
		
		pila.push( numeroTipoLong );
		pila.push(numeroTipoDouble);
		pila.push(numeroTipoFloat);
		pila.push(numeroTipoInteger);
		
		imprimirPila( pila );
		
		System.out.println( "\n\nMetodos pila:" );
		metodosPila( pila );
		
	}
	
	private void metodosPila( Stack< Number > pila1 ) {
		
		for (Number n : pila1) 
		{
			System.out.printf( "%s", n );
		}
		System.out.println( "\nSima: " );
		pila1.peek();
	}
	
	private void imprimirPila( Stack < Number > pila ) {
		
		Iterator < Number > iterador = pila.listIterator();
		
		while ( iterador.hasNext() ) {
			Number numero = iterador.next();
			System.out.printf("\n\n%s", numero);
		}	
	}

	public static void main(String[] args) {
		new PruebaStack();
	}
	
	
}
