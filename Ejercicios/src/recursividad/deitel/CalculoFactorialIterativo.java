//Fig. 15.10: Calculo Fibonacci iterativo
//Pag 662 
package recursividad.deitel;

public class CalculoFactorialIterativo {

	public long factorial( long numero ) {
	
		long resultado =1;
		
		//declaro iteratividad
		for ( long i = numero; i >= 1; i-- ) {
			resultado *= i;
		}
		return resultado;
	}
	
	//muetra los factoriales para los valores del 0 al 10
	public void mostrarFactoriales() {
		for (int contador = 0; contador <= 10; contador++ ) {
			System.out.printf( "%d! = %d\n", contador, factorial( contador ) );
		}//fin del for
	}//fin del metodo
	
	
}
