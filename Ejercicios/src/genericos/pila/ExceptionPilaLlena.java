package genericos.pila;

public class ExceptionPilaLlena extends RuntimeException {

    public ExceptionPilaLlena() {
        this("La Pila esta llena");
    }

    public ExceptionPilaLlena(String excepcion){
        super(excepcion);
    }

}
