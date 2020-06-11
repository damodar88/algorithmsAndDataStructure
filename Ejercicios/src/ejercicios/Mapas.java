package ejercicios;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Mapas {
	
	private static int ID[] = {1, 2, 3, 4 };
	private static String nombres[] = { "damodar", "Balaram", "Simon", "Ringo" };
	
	public Mapas() {
		Mapas mapa = new Mapas();
		
		Map< String, Integer > mapHash = new HashMap< String, Integer>();
		mapa.rellenarMapa( mapHash );
		mapa.mostrarMapa( mapHash );
		
		Map< String, Integer > mapLinkedHasMap = new LinkedHashMap< String, Integer >();
		Map< String, Integer > mapTree = new TreeMap< String, Integer>();
		//Map< String, Integer > mapEnum = new EnumMap< String, Integer>();
		Map< String, Integer > mapWeakHashMap = new WeakHashMap< String, Integer>();
		Map< String, Integer > mapHashTable = new Hashtable< String, Integer>();
		Map< String, Integer > mapConcurrentHashMap = new ConcurrentHashMap< String, Integer>();
	}
	
	private void rellenarMapa( Map< String, Integer > mapa ) {
		for( int id : ID ) {
			for ( String n : nombres ) {
				mapa.put(n, id);
			}
		}
	}
	
	private void mostrarMapa( Map< String, Integer > mapa ) {
		
		Iterator iterador = mapa.keySet().iterator();
		while( iterador.hasNext() ) {
			Integer key = (Integer) iterador.next();
			System.out.println( "Clave: "+ key +"-> Valor:"+ mapa.get( key ) );
		}
	}
	
	public static void main(String[] args) {
		new Mapas();
	}
}