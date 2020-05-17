package ejercicios;

import java.util.EmptyStackException;
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
		
		System.out.println( "\nSima: " );
		metodosPila( pila );
		
		System.out.println( "\nElimina elementos de la pila: " );
		eliminarElementoPila( pila );
		
	}
	
	
	private void metodosPila( Stack< Number > pila1 ) {
		
		Number objPila = null;

		objPila = pila1.peek();
		System.out.printf( "%s", objPila );
	}
	
	private void imprimirPila( Stack < Number > pila ) {
		
		if ( pila.isEmpty() )
		{
			System.out.println( "\nLa pila esta vacia" );
		}else
		{
			System.out.println( "\nLa pila contiene: " );
			Iterator < Number > iterador = pila.listIterator();
			
			while ( iterador.hasNext() ) {
				Number numero = iterador.next();
				System.out.printf("\n\n%s", numero);
			}//fin while
		}//fin else	
	}//fin metodo imprimirPila
	
	private void eliminarElementoPila( Stack< Number > pilaEliminar ) {
		try
		{
			Number objEliminado = null;
			while( true )
			{
				objEliminado = pilaEliminar.pop();
				System.out.printf( "%s se saco\n", objEliminado );
				imprimirPila( pilaEliminar );
			}
		}catch( EmptyStackException emptyStackException ) 
		{
			emptyStackException.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new PruebaStack();
	}
	
	
}
