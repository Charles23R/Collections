package collections;

/**
 * Created by rench1732786 on 2018-03-19.
 */
public class File<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void add(T contenu){
       linkedList.add(0, contenu);
    }

    public T remove(){
        T tempo = linkedList.get(0);
        linkedList.remove(0);
        return tempo;
    }

    public T peek(){
        return linkedList.get(0);
    }

    public void clear(){
        linkedList.clear();
    }

    public int size(){
        return linkedList.size();
    }
}
