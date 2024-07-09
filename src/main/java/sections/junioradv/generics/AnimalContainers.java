package sections.junioradv.generics;

import java.util.ArrayList;
import java.util.Collection;

public class AnimalContainers<T> {


    private Collection<T> collection;

    public AnimalContainers(){
        collection = new ArrayList<T>();
    }

    public void add(T t ){
        collection.add(t);
    }
    


    //Esto es ilegal, dado que T 
    //no tiene o no puede implementar
    // makeSound(), el programa dará error en tiempo
    // de compilación
    public void printAllSounds(){
        for (T t : collection) {
            System.out.println(t.makeSound());
        }
    }
}