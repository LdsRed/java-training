package traineeSection.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero para la base: ");
        int base = sc.nextInt();

        System.out.println("Ingrese el segundo numero para la altura: ");
        int altura = sc.nextInt();

        Rectangulo rect = new Rectangulo(base, altura);

        System.out.println("El área del Rectangulo es: " + rect.areaRectangulo(base, altura));

        sc.close();
    }
}
