package collections;

/**
 * Created by rench1732786 on 2018-03-19.
 */
public interface List<T> {
    public void add(T contenu);
    public void add(int indice, T contenu);
    public void set(int indice, T contenu);
    public T get(int indice);
    public void remove(int indice);
    public void clear();
    public int size();
}
