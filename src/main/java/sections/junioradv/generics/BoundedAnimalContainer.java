package sections.junioradv.generics;

import java.util.ArrayList;
import java.util.Collection;

public class BoundedAnimalContainer<T extends Animal> {
    
    /*En este caso, T podrá acceder o utilizar
     * el metodo makeSounds dado que estanos especificando
     * que T va extender de Animal dentro de la notación de 
     * diamante
    */
    private Collection<T> collection; 

    public BoundedAnimalContainer(){
        this.collection = new ArrayList<T>();
    }

    public void add(T t){
        collection.add(t);
    }   

    public void printAllSounds(){
        for (T t : collection) {
            System.out.println(t.makeSounds());
        }
    }
}
