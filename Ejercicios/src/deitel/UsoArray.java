//********************************
//** Figura  19.2 Pag795  Deitel *
//********************************
package deitel;

import java.util.Arrays;

public class UsoArray {
	
	private int arregloInt[] = {1,2,3,4,5,6 };
	private double arregloDouble[] = {8.4, 9.3, 0.2, 7.9, 3.4};
	private int arregloIntLleno[], copiaArregloInt[];
	
	//el constructor inicializa los arreglos
	public UsoArray(){
		arregloIntLleno = new int [10]; //crea arreglo int con 10 elementos
		copiaArregloInt = new int [arregloInt.length];
		
		Arrays.fill( arregloIntLleno,7 ); //lleno con 7
		Arrays.sort( arregloDouble ); //ordeno el arreglode forma ascendente
		
		//copia el arreglo arregloInt en el arreglo copiaArregloInt
		System.arraycopy( arregloInt, 0, copiaArregloInt, 0, arregloInt.length );
	}//fin del constructor de UsoArray
	
	//Imprime los valores en cada arreglo
	public void imprimeArreglos() {
		
		System.out.print("arregloDouble");
		for ( double valorDouble : arregloDouble ) {
			System.out.printf("%.1f",valorDouble);
		}
		
		System.out.print("\narregloInt: ");
		for( int valorInt : arregloInt) {
			System.out.printf("%d", valorInt);
		}
		
		System.out.print("\narregloIntLleno: ");
		for( int valorInt : arregloIntLleno ){
			System.out.printf("%d", valorInt);
		}
		
		System.out.print("\ncopiaArregloInt: ");
		for( int valorInt : copiaArregloInt ) {
			System.out.printf("%d", valorInt);
		}
		
		System.out.println("\n");
	}//fin del metodo imprimeArreglo
	
	//busca el el valor en el arreglo arregloInt
	public int buscarUnint( int valor ) {
		
		return Arrays.binarySearch( arregloInt, valor );
	} //fin del metodo buscarUnInt
	
	//compara el contenido del arreglo
	public void imprimirIgualdad(){
		boolean b = Arrays.equals( arregloInt, copiaArregloInt);
		System.out.printf( "arregloInt %s copiaArregloInt\n", ( b ? "==" : "!=") );
		
		b = Arrays.equals( arregloInt, arregloIntLleno );
		System.out.printf( "arregloInt %s arregloIntLleno\n", ( b ? "==" : "!=") );
	} // fin del metodo imprimirIgualdad
	
	public static void main(String args[] ) {
		UsoArray usoArreglos = new UsoArray();
		
		usoArreglos.imprimeArreglos();
		usoArreglos.imprimirIgualdad();

		int ubicacion = usoArreglos.buscarUnint( 5 );
		if( ubicacion >= 0) {
			System.out.printf("Se encontro el 5 en el elemento %d de arregloInt\n", ubicacion);
		}else {
			System.out.printf("No se encontro el 5 en arregloInt");
		    ubicacion = usoArreglos.buscarUnint( 8763 );
		    if ( ubicacion >= 0 ){
		    	System.out.printf("Se encontro el 8763 en el elemento %d en arregloInt\n", ubicacion );
		    }else {
		    	System.out.println( "No se encontro el 8763 en el arregloInt" );
		    }
		}//fin de main
		
	}//fin de la clase UsoArrays	
}
