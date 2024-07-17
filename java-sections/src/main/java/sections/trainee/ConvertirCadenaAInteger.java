package sections.trainee;

import java.util.Scanner;

public class ConvertirCadenaAInteger {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String texto;
        int valor;

        System.out.println("Este programa le permitirá convertir una cadena de texto\n" +
                "en un número entero.");

        try {
            System.out.println("Ingrese una cadena de texto: ");
            texto = sc.nextLine();
            valor = Integer.parseInt(texto);
        }catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: Ha occurido un problema con la cadena que ha ingresado\n" +
                    "dado que no se puede realizar la conversión de una cadena de texto de caracteres a un número entero");
        }

        sc.close();
    }
}
