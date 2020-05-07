package colecciones.deitel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ConteoTipoPalabras {

	private Map< String, Integer > mapa;
	private Scanner scanner;
	
	public ConteoTipoPalabras() 
	{
		mapa = new HashMap< String, Integer >();
		scanner = new Scanner( System.in );
		crearMap();
		mostrarMap();
	}
	
	private void crearMap() {
		System.out.println("Escriba una cadena: ");
		String entrada = scanner.nextLine();
		
		//crea obj StringTokenizer para los datos entrada
		StringTokenizer tokenizer = new StringTokenizer( entrada );
		
		//procesamiento del toxto de entrada
		while ( tokenizer.hasMoreTokens() )  //mientras haya mas palabras
		{
			String palabra = tokenizer.nextToken().toLowerCase();//obtiene una palabra
			
			//si el mapa contiene la palabra
			if ( mapa.containsKey( palabra ) )
			{
				int cuenta = mapa.get( palabra ); //obtiene la cuenta actual
				mapa.put( palabra, cuenta + 1 );
			}//fin if
			else
			{
				mapa.put( palabra, 1 );
			}//fin else
		}//fin while
	}//fin del metodo crearMap
	
	//muestra el contenido del mapa
	private void mostrarMap()
	{
		Set< String > claves = mapa.keySet();
		
		//ordena las claves
		TreeSet< String > clavesOrdenadas = new TreeSet< String >( claves );
		
		System.out.println("El mapa contiene:\nClave\t\tValor");
		
		//genera la salida para cada clave en el mapa
		for ( String clave : clavesOrdenadas )
		{
			System.out.printf("%-10s%10s\n", clave, mapa.get( clave ) );
		}//fin for
		
		System.out.printf( "\nsize:%d\nisEmpty:%d\n", mapa.size(), mapa.isEmpty() );
	}//fin del metodo mostrarMap
	
	public static void main(String[] args) 
	{
		new ConteoTipoPalabras();
	}//fin del main
}//fin de la clase ConteoTipoPalabras
