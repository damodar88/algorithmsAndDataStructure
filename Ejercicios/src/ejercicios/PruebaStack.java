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
		
	}
	
	public void imprimirPila( Stack < Number > pila ) {
		
		Iterator < Number > iterador = pila.listIterator();
		
		while ( iterador.hasNext() ) {
			Number numero = iterador.next();
			System.out.printf("%s", numero);
		}
		
	}

	
	
	
}
