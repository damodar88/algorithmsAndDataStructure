//Fig 15.3: calculo de factorial
//Pag 657 Metodo factorial recursivo
package recursividad.deitel;

public class CalculoFactorial {
	
	public long factorial( long numero ) {
		if ( numero <= 1 ) { //evalua el caso base
			return 1; //caso base: 0! = 1 y 1! = 1
		}else { //paso recursivo
			return numero * factorial( numero - 1 );
		} //
	}//fin del metodo recursivo

	public void mostrarFactorial() {
		for (int contador = 0; contador <= 10 ; contador++) {
			System.out.printf( "%d! = %d\n", contador, factorial( contador ) );
		}
	}

}
