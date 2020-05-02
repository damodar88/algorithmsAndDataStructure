package colecciones.deitel;

import java.util.PriorityQueue;

public class PruebaPriorityQueue {
	
	public static void main(String[] args) {
		
		//cola con capacidad de 11
		PriorityQueue< Double > cola = new PriorityQueue< Double >();
		
		//inserta elementos en la cola
		cola.offer( 3.2 );
		cola.offer( 9.8 );
		cola.offer( 5.4 );
		
		System.out.println("Sondeando de cola: ");

		//muestra los elementos de la cola
		while( cola.size() > 0 ) 
		{
			System.out.printf("%.1f ", cola.peek());
			cola.poll();
		}
		
	}

}
