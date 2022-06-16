package colection.linkedList;

public class ListaEnlazada {

    protected Node beginning ,finish;

    public ListaEnlazada(){
        beginning = null;
        finish = null;
    }


    public void agregarAlInicio(int elemento){
        beginning = new Node(elemento, beginning);

        if (finish == null){
            finish = beginning;
        }

    }

    public void mastrarLista(){
        Node recorrer = beginning;
        while (recorrer != null) {
            System.out.print("[" + recorrer.data + "]--->");
            recorrer=recorrer.siguiente;
        }
    }


    public static void main(String[] args) {

        ListaEnlazada enlazada = new ListaEnlazada();

        enlazada.agregarAlInicio(1);
        enlazada.agregarAlInicio(3);
        enlazada.agregarAlInicio(4);
        enlazada.agregarAlInicio(5);

        enlazada.mastrarLista();

    }

}
