package algorithms.ordenamientoPorSelecion;

public class OrdenamientoPorSeleccion {



    public static void ordenarPorSeleccion(int[] arreglo ){

        int minimo,auxiliar;

        for (int i = 0; i < arreglo.length; i++ ){
            minimo = i;

            for (int j = i+1; j < arreglo.length; j++){
                if (arreglo[j] < arreglo[minimo]){
                    minimo = j;
                }
            }
        auxiliar = arreglo[i];
        arreglo[i] = arreglo[minimo];
        arreglo[minimo] =auxiliar;
        }

        for (int i = 0; i < arreglo.length; i ++) {
            System.out.println("["+i+"]-->"+ arreglo[i]);
        }

    }


    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,1,1,4,3,2};

        ordenarPorSeleccion(array);

    }
}
