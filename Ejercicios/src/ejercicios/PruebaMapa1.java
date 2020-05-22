package ejercicios;

import java.util.HashMap;
import java.util.Map;

public class PruebaMapa1 {
	
	private static String nombres[] = { "damodar", "navarrete" };
	Map< String, Integer > map;
	
	public PruebaMapa1() {
		map = new HashMap< String, Integer >();
		
		String cuenta = "damodar";
		
		map.put( cuenta , 1);
		
		for ( String s : nombres ) {
			int contador = 0;
			map.put( s , contador + 1 );
		}
		
		for ( ) {
			
		}
		
	}

	public static void main(String[] args) {
		new PruebaMapa1();
	}
	
}
