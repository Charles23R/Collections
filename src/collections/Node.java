package collections;

/**
 * Created by rench1732786 on 2018-03-15.
 */
public class Node<T> {

    private Node next;
    private T contenu;

    public Node(T contenu){
        this.contenu=contenu;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

}
