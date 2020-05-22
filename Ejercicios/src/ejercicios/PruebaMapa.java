package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class PruebaMapa {

	private Map<String, Integer> mapa;
	private Scanner scanner;

	public PruebaMapa() {
		mapa = new HashMap<String, Integer>();
		scanner = new Scanner(System.in);
		crearMapa();
		mostrarMap();
	}

	private void crearMapa() {
		System.out.println("\nIngrese caracteres: ");
		String entrada = scanner.nextLine();

		StringTokenizer tokenizer = new StringTokenizer(entrada);

		while (tokenizer.hasMoreTokens()) {
			String palabra = tokenizer.nextToken().toLowerCase();
			// si el mapa contiene la palabra
			if (mapa.containsKey( palabra ) )// esta la palabra en el mapa
			{
				int cuenta = mapa.get( palabra );
				mapa.put( palabra, cuenta + 1 );
			} else {
				mapa.put( palabra, 1 );
			}
		}

	}

	private void mostrarMap() {
		Set<String> claves = mapa.keySet();
		TreeSet< String > claveOrdenadas = new TreeSet< String >( claves );
		
		System.out.println( "\nEl mapa contiene: \nClave\t\tValor" );
		
		for ( String clave : claveOrdenadas ) {
			System.out.printf( "%-10s%10s\n", clave, mapa.get( clave ) );
		}
		System.out.printf( "\nsize:%d\nisEmpty:%b\n", mapa.size(), mapa.isEmpty() );
	}

	public static void main(String[] args) {
		new PruebaMapa();
	}

}
