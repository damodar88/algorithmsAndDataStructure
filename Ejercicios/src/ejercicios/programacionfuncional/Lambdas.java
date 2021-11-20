package ejercicios.programacionfuncional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lambdas {
	
	
		
		
	public void ordenar() {
		
		List<String> listaString = Arrays.asList("1","3","2","5","0");
		
		
		Collections.sort(listaString);
		
		//Iterator<String> iterador = listaString.iterator();
		
		listaString.stream().filter(s ->   );
		
		listaString.forEach( s ->  System.out.println(s));
		
	}
	
	
	public static void main(String[] args) {
		
		Lambdas lamdas = new Lambdas();
		
		lamdas.ordenar();
		
	}
	
}
