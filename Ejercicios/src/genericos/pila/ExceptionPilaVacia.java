package genericos.pila;

public class ExceptionPilaVacia extends RuntimeException {

    public ExceptionPilaVacia() {
        this("La Pila esta vacia");
    }

    public ExceptionPilaVacia(String excepcion) {
        super(excepcion);
    }
}
