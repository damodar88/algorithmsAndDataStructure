package algorithms.burbuja;

public class BurbujaPrueba {


    public static void main(String[] args) {

        int array[] = {7,9,8,6,5,3,4,2,1};
        int aux = 0;

        for (int i = 0; i < array.length-1; i++) {

            for (int j = i; j < array.length ; j++) {
                if (array[i] < array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }

            }

        }


        for (int k : array) {
            System.out.println(k);
        }

    }



    public void burbuja(int ...array){


    }


}
