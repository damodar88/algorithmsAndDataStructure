package algoritmos.busquedabinaria;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arreglo, int buscar){

        int centro, menor, mayor;
        menor = 0;
        mayor = arreglo.length - 1;

        while (menor < mayor){

            centro = (menor + mayor)/2;

            if (arreglo[centro] ==  buscar){
                return centro;
            }else {
                if (arreglo[centro] < buscar){
                    menor = centro + 1;
                }else {
                    mayor = centro -1;
                }
            }
        }
      return 1;
    }

    public static void main(String[] args) {

        int arreglo[] = {0,1,3,4,5,6,7,8,9,10,11};
        int buscar = 3;

        Integer result = busquedaBinaria(arreglo, buscar );

        System.out.println("Total es :");
        System.out.println(result);

        for(int i =0; i < arreglo.length; i++){
            System.out.println("["+i+"]->"+ arreglo[i]);
        }


    }

}
