package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PruebaMapa1 {
	
	private static String nombres[] = { "damodar", "navarrete" };
	Map< String, Integer > map;
	private Scanner scanner;
	
	public PruebaMapa1() {
	
		map = new HashMap< String, Integer >();
		
		System.out.println("\nIngrese los valores: ");
		String entrada = scanner.nextLine();

		StringTokenizer  tokenizar = new StringTokenizer( entrada ); 
		
		ingresarValoresMapa( tokenizar );
		
		imprimirMapa( map );
		
	}
	private void ingresarValoresMapa( StringTokenizer  tokenizar) {
			
		while ( tokenizar.hasMoreTokens() ) {
			String palabra = tokenizar.nextToken().toLowerCase();
			if (map.containsKey( palabra ) )// esta la palabra en el mapa
			{
				int cuenta = map.get( palabra );
				map.put( palabra, cuenta + 1 );
			} else {
				map.put( palabra, 1 );
			}
		}
		
	}
	
	private void imprimirMapa( Map< String, Integer > map ) {
		for ( Map.Entry< String, Integer > entry : map.entrySet() ) {
			System.out.println( "Clave = " + entry.getKey() + "\nValor = " + entry.getValue() );
		}
	}
	

	public static void main(String[] args) {
		new PruebaMapa1();
	}
	
}
