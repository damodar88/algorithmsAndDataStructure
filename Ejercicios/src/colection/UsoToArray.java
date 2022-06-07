package colection;
//pag 804 Fig 19.5
import java.util.LinkedList;
import java.util.Arrays;

public class UsoToArray {

	//el constructor crea un objeto LinkedList, le agrega elementos y lo convierte en arreglo
	public UsoToArray() {
		
		String colores[] = {"negro ", "azul ", "amarillo "};
		
		LinkedList< String > enlaces = new LinkedList< String >( Arrays.asList( colores ) );
	
		enlaces.add( "rojo" ); //lo agrego como ultimo elemento
		enlaces.add( "rosa" ); //lo agrego al final
		enlaces.add( 3,"verde" ); //lo agrego en el 3er indice
		enlaces.add( "cyan" );  //lo agrego como el primer elemento
		
		//obtiene los elementos de LinkedList como arreglo
		colores = enlaces.toArray( new String[ enlaces.size() ] );
		
		System.out.println("colores: ");
		
		for ( String color : colores ) {
			System.out.println( color );
		}
	}//fin del constructor
	
	public static void main( String args[] ) {
		new UsoToArray();
	}//fin de main
}//fin de la clase UsoToArray
