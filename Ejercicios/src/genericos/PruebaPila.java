package genericos;

public class PruebaPila {

    private double[] elementosDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
    private int[] elementosInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    private Pila<Double> pilaDouble;
    private Pila<Integer> pilaInteger;

    public void  pruebaPila(){

        pilaDouble = new Pila<Double>(5);
        pilaInteger = new Pila<Integer>(10);

        pruebaPushDouble();
        pruebaPopDouble();
        pruebaPushInteger();
        pruebaPopInteger();
    }

    public void pruebaPushDouble(){
        try {
            System.out.println("\nMete elementos en la pilaDouble");
            for (double elemento : elementosDouble) {
                System.out.printf("%.1f", elemento);
                pilaDouble.push(elemento);
            }
        }catch (ExceptionPilaLlena exceptionPilaLlena){
            System.out.println();
            exceptionPilaLlena.printStackTrace();
        }
    }

    public void pruebaPopDouble(){
        try {
            System.out.println("\nSacando elementos de la pilaDouble");
            double valorASacar;
            while (true){
                valorASacar = pilaDouble.pop();
                System.out.printf("%.1f", valorASacar);
            }
        }catch (ExceptionPilaVacia exceptionPilaVacia){
            System.out.println();
            exceptionPilaVacia.printStackTrace();
        }
    }

    public void pruebaPushInteger(){
        try {
            System.out.println("\nMetiendo elementos a pilaInteger");
            for (int elemento : elementosInteger){
                System.out.printf("%d", elemento);
                pilaInteger.push(elemento);
            }
        }catch (ExceptionPilaLlena exceptionPilaLlena){
            exceptionPilaLlena.printStackTrace();
        }
    }

    public void pruebaPopInteger(){
        try {
            System.out.println("\nSacando elementos de pilaInteger");
            int valerASacar;
            while (true){
                valerASacar = pilaInteger.pop();
                System.out.printf("%d", valerASacar);
            }
        }catch (ExceptionPilaVacia exceptionPilaVacia){
            System.out.println();
            exceptionPilaVacia.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PruebaPila aplicacion = new PruebaPila();
        aplicacion.pruebaPila();
    }
}
