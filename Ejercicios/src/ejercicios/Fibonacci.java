package ejercicios;

import java.util.Scanner;

public class Fibonacci {
	
	public static int funcionFibonacci( int numeroEntrada ) {
		if ( ( numeroEntrada == 0 ) || ( numeroEntrada == 1 ) ) {
			return numeroEntrada;
		}else {
			return funcionFibonacci( numeroEntrada -1 ) + funcionFibonacci( numeroEntrada -2 );
		}
	}
	
	public static void mostrarFibonacci( int n ) {
		for (int contador = 0; contador < n ; contador++) {
			System.out.printf( "Fibonacci de %d es: %d\n", contador, funcionFibonacci( contador ));
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		Scanner scanner = new Scanner( System.in );
		int n = scanner.nextInt();
		
		mostrarFibonacci( n );
		System.out.printf( "%s", n  );
	}

}
