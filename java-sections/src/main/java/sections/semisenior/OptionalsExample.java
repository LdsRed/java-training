package sections.semisenior;

import java.util.Optional;

public class OptionalsExample {

    public static void main(String[] args) {

        String name = "Jordan";

        //Optional<String> optional = Optional.of(name);
        //para manejar los nulls podemos usar Optiona.ofNullable


        Optional<String> optionalNullable = Optional.ofNullable(name);

        if(optionalNullable.isPresent()){
            System.out.println(optionalNullable.get());
        }

        System.out.println(optionalNullable.isPresent(nombre -> {
            System.out.println(nombre);
        }));
    }


}
