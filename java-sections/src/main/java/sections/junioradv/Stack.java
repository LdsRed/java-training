package sections.junioradv;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {


    private List<E> stackList;

    public Stack(){
        this.stackList = new ArrayList<>();
    }

    /*
    * Operaciones:
    * Añadir/add
    * Eliminar/Delete
    * Obtener/get/peek
    * Tamaño/size
    * Limpiar/clear
    * Vacia/isEmpty
    * */

    //Add / push
    public void push(E element){
        stackList.add(element);
    }

    //Delete/remove/pop
    public void remove(E element){
        if (stackList.isEmpty()){
            throw new IllegalStateException("La pila esta vacia, no existe elemento para eliminar");
        }else {
            stackList.remove(stackList.size() -1);
            System.out.println("Ultimo elemento eliminado.");
        }
    }

    //Get/peek
    public E peek(){
        if (isEmpty()){
            throw new IllegalStateException("La pila esta vacia, no se encontraron elementos");
        }else {
            return stackList.get(stackList.size() -1 );
        }

    }

    //isEmpty
    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    //Tamaño de la lista
    public int size(){
        return stackList.size();
    }

    //Limpiar la pila
    public void clear(){
        stackList.clear();
        System.out.println("Se ha limpiado la pila \n " +
                "el tamaño actual es: " + stackList.size());
    }


    //ToString


    @Override
    public String toString() {
        return "Elementos de la pila: " + stackList;
    }
}
