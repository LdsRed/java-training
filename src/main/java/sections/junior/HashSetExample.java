package sections.junior;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {



        /*
        * Los hashset no mantienen el orden de inserción
        * Los sets pueden contener elementos únicos
        * HashSet es la implementación de la interface set
        * Set extiende de Collection*/

        Set<String> hashSetFrutas = new HashSet<>();

        hashSetFrutas.add("Manzana");
        hashSetFrutas.add("Mandarina");
        hashSetFrutas.add("Banana");
        hashSetFrutas.add("Naranja");
        hashSetFrutas.add("Uvas");
        hashSetFrutas.add("Tomate");
        hashSetFrutas.add("Kiwi");
        hashSetFrutas.add("Pera");


        hashSetFrutas.add("Manzana");


        hashSetFrutas.forEach(System.out::println);


    }
}
