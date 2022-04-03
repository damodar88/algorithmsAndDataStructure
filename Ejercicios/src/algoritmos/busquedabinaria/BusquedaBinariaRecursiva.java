package algoritmos.busquedabinaria;

public class BusquedaBinariaRecursiva {

    public static int busquedaBinaria(int[] arreglo, int search){
        int centro, menor, mayor;
        menor = 0;
        mayor = arreglo.length - 1;

        centro = (menor+mayor)/2;

        if (arreglo[centro]==search){
            return centro;
        }else {
            if (arreglo[centro] < search ){
                mayor = centro + 1;
            }else{
                menor = centro - 1;
            }
            return busquedaBinaria(arreglo,search);
        }
    }

    public static void main(String[] args) {

        int[] array = {0,1,3,4,5,6,7,8,9,10,11};
        int search = 3;

        Integer result = busquedaBinaria(array, search );

        System.out.println("Total es :");
        System.out.println(result);

        for(int i =0; i < array.length; i++){
            System.out.println("["+i+"]->"+ array[i]);
        }


    }
}
