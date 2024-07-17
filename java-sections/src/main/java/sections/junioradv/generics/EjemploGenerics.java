package sections.junioradv.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploGenerics {
    public static void main(String[] args) {
        
        //Instanciamos la clase Pair 
        Pair<String, String> pair = new Pair<>();

        //Utilizamos los setters para establecer el estado o valor del atributo como tal
        pair.setElemento1("Hola desde ");
        pair.setElemento2("elemento2");

        System.out.println("Ejemplo Pair: " + pair.getElemento1() + " " + pair.getElemento2() );
        
        List<String> listaString = new ArrayList<>();
        listaString.add("Hola");
        listaString.add("Desde");
        listaString.add("ArrayList");

        List<Integer> listaInteger = new LinkedList<>();
        listaInteger.add(1);
        listaInteger.add(2);
        listaInteger.add(10);
        listaInteger.add(20);


        leerListas(listaString);
        leerListas(listaInteger);
    }



    public static <T> void leerListas(List<T> list){
        for (T t : list) {
            System.out.println(t);
        }
    }

    
}
