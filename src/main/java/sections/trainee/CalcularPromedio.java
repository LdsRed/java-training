package sections.trainee;

import java.util.Scanner;
import java.util.logging.Logger;

public class CalcularPromedio {

    public static void main(String[] args) {
        Logger log = Logger.getLogger("ejercicio06");
        Scanner scanner = new Scanner(System.in);
        log.info("Ingrese tres números enteros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.close();
        log.info("El promedio es: " + calcularPromedio(n1, n2, n3));
    }


    public static int calcularPromedio(int n1, int n2, int n3){
        return (n1+n2+n3)/3;
    }
}
