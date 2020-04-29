package colecciones.deitel;

import colecciones.deitel.Carta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MazoDeCartas {
	
	private List< Carta > lista;
	
	public MazoDeCartas() {
		Carta[] mazo = new Carta[ 52 ];
		int cuenta = 0;
		for ( Carta.Palo palo : Carta.Palo.values() ) {
			for ( Carta.Cara cara : Carta.Cara.values() ) {
				mazo[ cuenta ] = new Carta( cara, cara );
				cuenta++;
			}
		}
		lista = Arrays.asList( mazo );
		Collections.shuffle( lista );
	}
	
	public void imprimirCartas() {
		for( int i = 0; i < lista.size(); i++ ) {
			System.out.printf("%-20s%s", lista.get( i ),
			( ( i + 1 ) % 2 == 0 ) ? "\n" : "\t" );
		}
	}
	
	public static void main(String args[] ) {
		MazoDeCartas cartas = new MazoDeCartas();
		cartas.imprimirCartas();
	}
}
