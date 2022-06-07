package algorithms.ordenamientoPorSelecion;

public class OrdonamientoSeleccion {



    public static void main(String[] args) {

        int array[] = { 9,8,7,1,5,2,3,4,5,6};

        OrdonamientoSeleccion ordenamiento = new OrdonamientoSeleccion();

        ordenamiento.selectionSort(array);

        for (int i: array) {
            System.out.println(i);
        }

    }

    public void selectionSort(int...array){
       int aux,minimo;

        for (int i = 0; i < array.length -1 ; i++) {
            minimo = array[i];
            for (int j = i+1; j < array.length ; j++) {

                if (array[j] < array[minimo]) {
                    minimo = j;
                }
            }

            aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }



    }


}
