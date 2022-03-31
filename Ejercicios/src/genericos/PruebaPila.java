package genericos;

public class PruebaPila {

    private double[] elementosDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
    private int[] elementosInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    private Pila<Double> pilaDouble;
    private Pila<Integer> pilaInteger;

    public void  pruebaPila(){

        pilaDouble = new Pila<Double>();
        pilaInteger = new Pila<Integer>();

        pruebaPushDouble();
        pruebaPopDouble();
        //pruebaPushInteger();
        //pruebaPopInteger();
    }

    public void pruebaPushDouble(){
        try {
            System.out.println("\nMete elementos en la pilaDouble");
            for (double elemento : elementosDouble) {
                System.out.printf("%.1 ", elemento);
                pilaDouble.push(elemento);
            }
        }catch (ExceptionPilaLlena exceptionPilaLlena){
            System.out.println();
            exceptionPilaLlena.printStackTrace();
        }
    }

    public void pruebaPopDouble(){



    }



}
