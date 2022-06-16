package colection.linkedList;

public class Node {

    public int data;
    public Node siguiente;


    /**
     * @param d
     */
    public Node(int d) {
        this.data = d;
    }

    /**
     * @param d
     * @param node
     */
    public Node(int d, Node node) {
        data = d;
        siguiente = node;
    }


}
