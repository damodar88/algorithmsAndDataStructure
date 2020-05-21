package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PruebaMapa {
	
	private Map< String, Integer > mapa;
	private Scanner scanner;
	
	public PruebaMapa() {
		mapa = new HashMap< String, Integer >();
		scanner = new Scanner( System.in );
		crearMapa();
		mostrarMap();
	}
	
	private void crearMapa() {
		
	}
	
	private void mostrarMap() {
		
	}
	
	public static void main(String[] args) {
		new PruebaMapa();
	}
	
}
