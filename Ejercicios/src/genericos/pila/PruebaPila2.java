package genericos.pila;

public class PruebaPila2 {

    private Double[] elementosDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
    private Integer[] elementosInteger =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};


    private Pila<Double> pilaDouble;
    private Pila<Integer> pilaInteger;

    public void probarPila(){
        pilaDouble = new Pila<Double>(5);
        pilaInteger = new Pila<Integer>(10);

        probarPush("pilaDouble", pilaDouble, elementosDouble);
        probarPop("pilaDouble", pilaDouble);
        probarPush("pilaInteger", pilaInteger, elementosInteger);
        probarPop("pilaInteger", pilaInteger);

    }

    public <T> void probarPush(String nombre, Pila<T> pila, T[] elementos ){
        try {
            System.out.printf("\nMetiendo elementos a %s\n", nombre);
            for (T elemento : elementos) {
                System.out.printf("%s ", elemento);
                pila.push(elemento);
            }
        }catch (ExceptionPilaLlena exceptionPilaLlena){
            System.out.println();
            exceptionPilaLlena.printStackTrace();
        }
    }

    public <T> void probarPop(String nombre, Pila<T> pila){
        try {
            System.out.printf("\nSacando elementos de %s\n", nombre);
            T valorASacar;
            while (true){
                valorASacar = pila.pop();
                System.out.printf("%s ", valorASacar);
            }
        }catch (ExceptionPilaVacia exceptionPilaVacia){
            System.out.println();
            exceptionPilaVacia.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PruebaPila2 aplication = new PruebaPila2();
                aplication.probarPila();
    }
}
