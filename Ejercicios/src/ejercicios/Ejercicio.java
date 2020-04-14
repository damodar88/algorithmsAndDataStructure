package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {

	private int arregloIntGloval[];
	private int arregloCopy[];
	private int arregloLleno[];
	
	public int buscarArreglo( int valor) {
		return Arrays.binarySearch(arregloIntGloval, valor);
	}
	
	public int  copiarArray( int  valor ) {
		
		return System.arraycopy( arregloIntGloval, 0, arregloCopy, 0, arregloIntGloval.length  );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese una opcion: ");
		System.out.println("1) Rellenar un arregloInt ");
		
		Scanner capturaTeclado = new Scanner(System.in);
		int opcionMenu = capturaTeclado.nextInt();
		
		int opcionCompararMenu= 1;
		
		while(opcionCompararMenu == opcionMenu ) {
			System.out.println("Ingrese numeros para el arreglo: ");
			Scanner capturaArrglo = new Scanner(System.in);
			int datosArray  = capturaArrglo.nextInt();
			
			int arregloInt[] = {datosArray};
			System.out.println("ArregloInt");
			for (int valorInt : arregloInt ) {
				System.out.printf("%d",valorInt);
			}
	
			System.out.println("Buscar enteros en el array: ");
			Scanner numeroTeclado = new Scanner(System.in);
			int numeroBuscarArray = numeroTeclado.nextInt();
		
			 
		   	
			break;
		}
		
		

		
		
	}


	
}
