package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio {
	
	private static final String[]  autos = { "toyota ", "ford " };
	private static final String[]  eliminarAutos = {"toyota "};
	
	public Ejercicio() {
		List < String > listaAutos = new ArrayList< String >();
		List < String > eliminarLista = new ArrayList<String>();
		
		for( String marcas : autos ) {
			listaAutos.add(marcas);
		}
		
		for( String eliminarMarca : eliminarAutos ) {
			eliminarLista.add(eliminarMarca);
		}
		
		System.out.printf("Lista autos: ");
		for ( String it : listaAutos ) {
			System.out.printf("%s", it);
		}
		
		System.out.printf("\nA eliminar: ");
		for ( String itt : eliminarLista ) {
			System.out.printf( "%s", itt );
		}	
		
		eliminarAutos(listaAutos, eliminarLista );
		
		System.out.printf("\nLista despues de eliminar: ");
	
		Iterator< String > iterador = listaAutos.iterator();
		
		while( iterador.hasNext() ) {
			System.out.println("--"+ iterador.next() );
		}
		
		System.out.println("--");
		
		listaAutos.stream().forEach(  autos -> {  System.out.println(""+autos);   }   );
		
		System.out.println("---------");
		for ( String it : listaAutos ) {
			System.out.printf("%s",it);
		}
		
		
	}
	
	public void eliminarAutos( Collection< String > collection1, Collection< String > collection2 ) {
		Iterator< String > iterador = collection1.iterator();
		
		while ( iterador.hasNext() ){
			if( collection2.contains( iterador.next() ) ) {
				iterador.remove();
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio();
	}	
}
