package traineeSection.ejercicio01;
import java.util.Scanner;
import java.util.logging.Logger;

// Calcular el área de un triángulo dado la base y la altura
/* Scenarios a tomar en cuenta:
* 1. El usuario ingresa un valor negativo
* 2. El usuario ingresa un valor decimal
* 3. El usuario ingresa un valor decimal negativo
* 4. El usuario ingresa 0 como base o altura (si dicho fuera el caso, no debería ser un triangulo)
* */
public class ejercicio01 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("ejercicio01");
        int base;
        int altura;
        boolean flag = true;

        while (flag) {


            try{
                logger.info("Ingrese un número positivo para la base del triangulo: ");
                base = Integer.parseInt(scanner.next());
                logger.info("Ingrese un número positivo para la altura del triangulo: ");
                altura = Integer.parseInt(scanner.next());

                if (base < 0 || altura < 0 ) {
                    logger.info("Los valores no pueden ser negativos, vuelva a ingresar un valor valido");
                } else if (base == 0 || altura == 0) {
                    logger.info("Los valores no pueden ser 0, vuelva a ingresar un valor valido");
                }else {
                    logger.info("El área del triángulo es: " + areaTriangulo(base, altura));
                    flag = false;
                }
            }catch (NumberFormatException e){
                logger.info("Usted ha ingresado un valor no numérico, vuelva a ingresar un valor correcto.");
                System.out.println();
            }

        }

        scanner.close();
    }
    public static int areaTriangulo(int base, int altura) {
        return (base*altura)/2;
    }



}
