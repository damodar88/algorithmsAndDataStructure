package algorithms;

import java.util.Arrays;

public class MergeSort {

	private static int arreglo[] = { 5, 4, 3, 2, 1, 7 };

	int arregloIzq[] = {};
	int arregloDer[] = {};
	
	private void dividir(int arregloInt[]) {

		int tamanoArreglo = arregloInt.length;

		int[] arregloIzquierda = null;
		int[] arregloDerecha = null;

		if (tamanoArreglo > 1) {
			int mitad = tamanoArreglo / 2;
			arregloIzquierda = Arrays.copyOfRange(arregloInt, 0, mitad);
			arregloDerecha = Arrays.copyOfRange(arregloInt, mitad, tamanoArreglo);
		}

		imprimirarreglo(arregloIzquierda);

		System.out.println("\n");

		imprimirarreglo(arregloDerecha);

	}

	private void imprimirarreglo(int[] arreglo) {

		for (int a : arreglo) {
			System.out.printf("\n %s", a);
		}

	}

	private int[] mezclaDirecta(int[] arreglo) {

		int i, j, k;

		if (arreglo.length > 1) {
			int nElementosIzq = arreglo.length / 2;
			int nElementosDer = arreglo.length - nElementosIzq;
			// Copiamos los elementos de parte primera al arreglo
			for (i = 0; i < nElementosIzq; i++) {
				arregloIzq[i] = arreglo[i];
			}
			// Copiamos los elementos de parte segunda al arregloDer
			for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
				arregloDer[i - nElementosIzq] = arreglo[i];
			}

			// Recursividad
			arregloIzq = mezclaDirecta(arregloIzq);
			arregloDer = mezclaDirecta(arregloDer);

			i = 0;
			j = 0;
			k = 0;
			
			while ( arregloIzq.length != j && arregloDer.length != k ) {
				if ( arregloIzq[j] < arregloDer[k] ) {
					arreglo[i] = arregloIzq[j];
					i++;
					j++;
				}else{
					arreglo[i] = arregloDer[k];
					i++;
					k++;
				}
			}
			
			// Arreglo final
			while ( arregloIzq.length != j ) {
				arreglo[i] = arregloIzq[j];
				i++;
				j++;
			}
			while ( arregloDer.length != k ) {
				arreglo[i] = arregloDer[k];
				i++;
				k++;
			}
		} // fin del if

		return arreglo;
	}
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int vector[] = mergeSort.mezclaDirecta(arreglo);
		mergeSort.imprimirarreglo( vector );
		
		System.out.println( "" );
	}
}
