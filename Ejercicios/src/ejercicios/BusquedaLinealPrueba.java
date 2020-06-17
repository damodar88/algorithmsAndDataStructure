package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class BusquedaLinealPrueba {
	
	private int arreglonumerico[];
	private static Random generadorAleatorio = new Random();
	
	public BusquedaLinealPrueba( int tamanoArreglo ) {
		arreglonumerico = new int[ tamanoArreglo ];
		for( int i = 0; i < tamanoArreglo; i++ ) {
			arreglonumerico[ i ] = 10 + generadorAleatorio.nextInt( 90 ); 
		}
	}
	
	private int busquedaLineal( int claveBusqueda ) {
		for( int indice = 0; indice < arreglonumerico.length; indice++ ) {
			if( arreglonumerico[ indice ] == claveBusqueda ) {
				return indice;
			}
		}
		return -1;
	}
	
	private void imrimirArreglo() {
		for( int i : arreglonumerico ) {
			System.out.printf( "%s",i+"," );
		}
	}
	
	public static void main(String[] args) {
		BusquedaLinealPrueba busquedaLinealPrueba = new BusquedaLinealPrueba( 10 );
		Scanner sc = new Scanner( System.in );
		System.out.println( "Ingrese un numero entero: " );
		int entrada = sc.nextInt();
		
		int posicion = busquedaLinealPrueba.busquedaLineal( entrada );
		if( posicion > 0 ) {
			System.out.println( "Se encontro el "+ entrada +" en la posicion"+ posicion+" en el arreglo: " );
		}else {
			System.out.println("El valor "+ entrada +" no se encontro en el arreglo: ");
		}
		busquedaLinealPrueba.imrimirArreglo();
	}
}
