package collections;

/**
 * Created by rench1732786 on 2018-03-15.
 */
public class LinkedList<T> implements List<T> {

    private Node head;
    private Node tail;
    private int tailleListe=0;

    public void add(T contenu){

        if (tailleListe==0){
            head=new Node(contenu);
            tail=head;
        }
        else {
            tail.setNext(new Node(contenu));
            tail=tail.getNext();
        }
        tailleListe++;
    }

    public void add(int indice, T contenu){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
        }

        else if(indice==0) {
            if (tailleListe==0){
                head=new Node(contenu);
                tail=head;
            }
            else{
                Node tempo = head;
                head = new Node(contenu);
                head.setNext(tempo);
            }
            tailleListe++;
        }

        else if (tailleListe==indice){
            add(contenu);
        }

        else{
                Node tempo=head;
                Node tempo2=head.getNext();
                for (int i=0; i<indice-1; i++) {
                    tempo = tempo.getNext();
                    tempo2 = tempo2.getNext();
                }

                tempo.setNext(new Node(contenu));
                tempo.getNext().setNext(tempo2);
                tailleListe++;
            }
        }

    public void set(int indice, T contenu){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
        }
        else {
            Node tempo=head;
            for (int i=0; i<indice; i++) {
                tempo = tempo.getNext();
            }
            tempo.setContenu(contenu);
        }
    }

    public T get(int indice){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
            return null;
        }
        else {
            Node tempo=head;
            for (int i=0; i<indice; i++) {
                tempo = tempo.getNext();
            }
            return (T)tempo.getContenu();
        }
    }

    public void remove(int indice){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
        }

        else if(indice==0){
            head = head.getNext();
        }

        else {
            Node tempo=head;
            Node tempo2=head.getNext();
            for (int i=0; i<indice-1; i++) {
                tempo = tempo.getNext();
                tempo2=tempo2.getNext();
            }
            tempo.setNext(tempo2.getNext());
            tailleListe--;
        }
    }

    public void clear(){
        tailleListe=0;
    }

    public int size(){
        return tailleListe;
    }
}
