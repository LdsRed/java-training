package sections.trainee;

public class DividirDosNumeros {

    public static void main(String[] args) {

        int dividendo = 10;
        int divisor = 0;

        try {
            System.out.println(dividendo / divisor);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }



}
