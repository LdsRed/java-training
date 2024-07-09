package sections.junioradv.generics;


/*
 * Java Generics da facilidad en la programación generica
 * Permite a una clase u metodo, operar sobre diferentes tipos de objetos
 * Un claro ejemplo de generics es el Collection framework.
 * Java permite el uso de mas de un parametro, solo se necesita usar la coma <T, S, E>. 
 * Se puede utilizar multiples parametros tanto en clases como en interfaces 
*/
public class Pair<E,T> {

    private E elemento1;
    private T elemento2;



    public Pair(){

    }

    public Pair(E element1, T element2){
        this.elemento1 = element1;
        this.elemento2 = element2;
    }

    public E getElemento1() {
        return elemento1;
    }

    public void setElemento1(E elemento1) {
        this.elemento1 = elemento1;
    }

    public T getElemento2() {
        return elemento2;
    }

    public void setElemento2(T elemento2) {
        this.elemento2 = elemento2;
    }


    
    
}
