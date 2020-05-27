package ejercicios;

public class Recurciviadejemplo {
	
	public String reverseString( String str ) {
		if ( str.isEmpty() ) {
			return str;
		}else {
			return reverseString( str.substring( 1 ) )  + str.charAt( 0 ) ;
		}
	}
	
	public static void main( String[] args ) {
		Recurciviadejemplo recurciviadejemplo = new Recurciviadejemplo();
		String result = recurciviadejemplo.reverseString( "Algoritmo" );
		System.out.println( result );
	}
	
}
