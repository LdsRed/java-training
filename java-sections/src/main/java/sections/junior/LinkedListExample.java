package sections.junior;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> array_ciudades = new LinkedList<>();
        array_ciudades.add("Barcelona");
        array_ciudades.add("Bogota");
        array_ciudades.add("Resistencia");
        array_ciudades.add("Cordoba");
        array_ciudades.add("La Plata");
        array_ciudades.add("Chubut");
;

        List<String> ciudades = new LinkedList<>(array_ciudades);


        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(ciudades.get(i));

        }


        System.out.println("Ciudades desde stream");
        ciudades.forEach(System.out::println);

    }
}
