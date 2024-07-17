package sections.trainee;

import java.util.Scanner;
import java.util.logging.Logger;
public class VerificarNumero {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("ejercicio03");
        Scanner scanner = new Scanner(System.in);
        logger.info("Ingrese un número positivo, negativo o cero: ");
        int numero = scanner.nextInt();

        if(numero < 0) {
           logger.info("El número es negativo");
        } else if(numero > 0) {
            logger.info("El número es positivo");
        } else {
            logger.info("El número es cero");

        }

        scanner.close();
    }
}
