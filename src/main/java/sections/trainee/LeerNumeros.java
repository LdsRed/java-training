package sections.trainee;

import java.util.Scanner;

public class LeerNumeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int suma = 0;

        System.out.println("El siguiente programa le pedirá que ingrese " +
                "números enteros positivos, y si quiere terminar con el programa deberá " +
                "ingresar un número negativo.");
        System.out.println();

        do {
            System.out.println("Ingrese un número: ");
            num = Integer.parseInt(scan.nextLine());
            if (num > 0) {
                suma += num;
            }
        }while (num >= 0);

        System.out.println("La suma de los números es: " + suma);
        scan.close();
    }
}
