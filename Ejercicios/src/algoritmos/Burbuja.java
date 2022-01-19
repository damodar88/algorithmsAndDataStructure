package algoritmos;

public class Burbuja {
	
	public static void main(String[] args) {
		int arreglo[] = { 8,7,6,5,4,3,2,1 };
		int arregloPrueba[] = { 8,7,6,5,4,3,2,1 };
		
		int aux;
		System.out.println("Antes de ordenar: ");
		
		for ( int s : arreglo ) {
			System.out.printf("%s", s);
		}
		
		System.out.printf( "\n" );
		
		for ( int i = 0; i < arreglo.length; i++ ) {
			for ( int j = i + 1; j < arreglo.length; j++ ) {
				if ( arreglo[i] > arreglo[j] ) {
					aux = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = aux;
				}
			}
		}
		
		System.out.println( "Arreglo despues de burbuja: " );
		for ( int i : arreglo ) {
			System.out.printf( "%s",i );
		}
	}

}
