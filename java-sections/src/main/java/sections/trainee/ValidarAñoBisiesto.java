package sections.trainee;

import java.util.Scanner;

public class ValidarAñoBisiesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Esta aplicación le permite determinar si un año es bisiesto o no.");
        System.out.println("Para comenzar ingrese el año que quiere analizar: ");
        int año = sc.nextInt();

        if ((año % 4 == 0) && ( año % 100 != 0 || año % 400 == 0)) {
            System.out.println("Luego de analizar, se determino que el año ingresado es bisiesto.");
        }else {
            System.out.println("El año ingresado no es bisiesto.");
        }

    }
}
