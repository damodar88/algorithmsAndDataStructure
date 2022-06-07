package generic.pila;

public class Pila <E>{

    private final int tamanio;
    private int superior;
    private E[] elementos;

    public Pila() {
        this(10);
    }

    public Pila(int s){
        tamanio = s > 0 ? s : 10;
        superior = -1;
        elementos = (E[]) new Object[tamanio];
    }

    public void push(E valorAMeter){
        if (superior == tamanio -1){
            throw new ExceptionPilaLlena(String.format("La pila llena, no sepuede meter %s", valorAMeter));
        }
        elementos[++superior] = valorAMeter;
    }

    public E pop(){
        if (superior == -1){
            throw new ExceptionPilaVacia("La pila esta vacia, no se puede sacar");
        }
        return elementos[superior-- ];
    }

}
