package collections;

/**
 * Created by rench1732786 on 2018-03-19.
 */
public class Pile<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T contenu){
       linkedList.add(linkedList.size(), contenu);
    }

    public T pop(){
        T tempo = linkedList.get(linkedList.size()-1);
        linkedList.remove(linkedList.size()-1);
        return tempo;
    }

    public T peek(){
        return linkedList.get(linkedList.size()-1);
    }

    public void clear(){
        linkedList.clear();
    }

    public int size(){
        return linkedList.size();
    }
}
