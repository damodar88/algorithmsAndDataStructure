package genericos;

public class ExceptionPilaLlena extends RuntimeException {

    public ExceptionPilaLlena() {
        super("La Pila esta llena");
    }

    public ExceptionPilaLlena(String excepcion){
        super(excepcion);
    }

}
