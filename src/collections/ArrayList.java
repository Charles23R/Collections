package collections;

/**
 * Created by RenCh1732786 on 2018-03-12.
 */
public class ArrayList<T> implements List<T>{

    private int tailleTableau=10;
    private int tailleListe=0;
    private T[] tableau = (T[]) new Object[tailleTableau];

    public void add(T contenu){
        if(tailleListe==tailleTableau){
            grow();
        }
        tableau[tailleListe]=contenu;
        tailleListe++;
    }

    public void add(int indice, T contenu){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
        }

        else if (indice<=tailleListe){

            if (tailleListe==tailleTableau){
                grow();
            }
            for (int i=tailleListe; i>=indice; i--){
                tableau[i+1]=tableau[i];
            }
            tableau[indice]=contenu;
            tailleListe++;
        }
    }

    public void set(int indice, T contenu){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
        }
        else {
            if (indice >=0 && indice<=tailleListe-1){
                tableau[indice]=contenu;
            }
            else{
                System.out.println("Erreur");
            }
        }
    }

    public T get(int indice){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
            return null;
        }
        else {
            if (indice >=0 && indice<=tailleListe-1){
                return tableau[indice];
            }
            else {
                return null;
            }
        }

    }

    public void remove(int indice){
        if (indice>tailleListe || indice<0){
            System.out.println("Erreur");
        }
        else{
            tailleListe--;
            for (int i=indice; i<tailleListe; i++){
                tableau[i]=tableau[(i+1)];
            }
        }
    }

    public void clear(){
        tailleListe=0;
    }

    public int size(){
        return tailleListe;
    }

    private void grow(){
        tailleTableau=tailleTableau*2;
        T[] tableauSecours = (T[]) new Object[tailleTableau];
        for (int i=0; i<tailleListe; i++){
            tableauSecours[i] = tableau[i];
        }
        tableau = tableauSecours;
    }
}
