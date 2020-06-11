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
	
	private static String ID[] = { "1", "2", "3", "4" };
	private static String nombres[] = { "damodar", "Balaram", "Simon", "Ringo" };
	
	public Mapas() {
		Map< String, Integer > mapLinkedHasMap = new LinkedHashMap< String, Integer >();
		Map< String, Integer > mapTree = new TreeMap< String, Integer>();
		//Map< String, Integer > mapEnum = new EnumMap< String, Integer>();
		Map< String, Integer > mapWeakHashMap = new WeakHashMap< String, Integer>();
		Map< String, Integer > mapHashTable = new Hashtable< String, Integer>();
		Map< String, Integer > mapConcurrentHashMap = new ConcurrentHashMap< String, Integer>();
	}
	
	public void rellenarMapa( Map< String, String > mapa ) {
		for( String id : ID ) {
		
		}
		for ( String n : nombres ) {
			
		}
	}
	
	public void mostrarMapa( Map< String, String > mapa ) {
		if ( mapa.isEmpty() ) {
			System.out.println( "El mapa no contiene datos" );
		}else {
			Iterator<String> iterador = mapa.keySet().iterator();
			while( iterador.hasNext() ) {
				String key = iterador.next();
				System.out.println( "Clave: "+ key +"-> Valor:"+ mapa.get( key ) );
			}
		}
	}
	
	private void mostratmapafor( Map< String, String > mapa ) {
		
		for ( Map.Entry<String, String> valormapa : mapa.entrySet() ) {
			String clave = valormapa.getKey();
			String valor = valormapa.getValue();
			System.out.println( "Clave: "+ clave +" Valor: "+ valor );
		}
	}
	
	
	public static void main(String[] args) {
		Mapas mapa = new Mapas();
		Map< String, String > mapHash = new HashMap< String, String>();
		mapa.rellenarMapa( mapHash );
		mapa.mostrarMapa( mapHash );
	}
}