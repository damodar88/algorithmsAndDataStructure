package ejercicios;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEjemplos {
	
	public QueueEjemplos() {
		
		PriorityQueue< Double > cola = new PriorityQueue< Double >();
		
		cola.offer( 3.2 );
		cola.offer( 8.8 );
		cola.offer( 8.9 );
		
		imprimirElementosCola( cola );
		eliminarElementosPila( cola );
		imprimirElementosCola( cola );
	}
	
	private void imprimirElementosCola( PriorityQueue< Double > cola1 ) {
		
		if( cola1.isEmpty() ) 
		{
			System.out.println( "\nLa cola no contiene elementos" );
		}else 
		{
			Iterator< Double > iterador = cola1.iterator();
			while( iterador.hasNext() )
			{
				Double doble = iterador.next();
				System.out.printf( "\n%s", doble );
			}//fin while
		}//fin de else
	}//fin del metodo eliminarElementosCola
	
	private void eliminarElementosPila( PriorityQueue< Double > pilaEliminar ) {
		while( !pilaEliminar.isEmpty() ) 
		{
			Double doble = pilaEliminar.poll();
			System.out.printf( "\n%sEliminado",doble );
		}//fin while
	}//fin metodo eliminar
	
	public static void main(String[] args) {
		new QueueEjemplos();
	}
}
