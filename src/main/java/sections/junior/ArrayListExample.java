package sections.junior;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {


        /*Las listas siempre utilizarán los tipos de datos Wrapper
        * Las listas permiten elementos duplicados
        * Las listas por detras implementan un array, por lo que permite el acceso
        * por medio de los indexs utilizando el metodo get
        * * */

        List<Integer> myIntegerList = new ArrayList<>();

        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        myIntegerList.add(4);
        myIntegerList.add(5);
        myIntegerList.add(6);
        myIntegerList.add(6);



        //Mantine el orden de Inserción
        myIntegerList.forEach(System.out::println);

        System.out.println(myIntegerList.get(2));

    }
}
