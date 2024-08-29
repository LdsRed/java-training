package sections.semisenior;

import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {


        // 1) Crear un Optional a partir de un valor no nulo y verificar si está presente.

        Optional<String> myOptional = Optional.of("Hello");
        System.out.println(myOptional.isPresent());

        // 2) Usar Optional para manejar un valor potencialmente nulo sin usar condicionales.
        /*Nullable ayuda a manejar valores potencialmente nulos, y devuelve un optional vacio (empty)
        * Cuando se le pasa un valor nulo ofNullable no hará nada */
        String myNull = null;

        Optional<String> myOptional2 = Optional.ofNullable(myNull);
        System.out.println(myOptional2.isPresent()); // returns false


        // 3) Implementar una operación que devuelva un valor predeterminado si el Optional está vacío.
            // Valor por defaul con .orElse()
        String name  = "Jordan Larcher";
        String defaultName = Optional.ofNullable(name).orElseGet( () -> "John Doe");

        System.out.println(defaultName);





    }


}
