package sections.junior;

public class Perro implements Animal {

    private String raza;
    private String nombre;


    @Override
    public void hacerSonido() {
        System.out.println("Guauuuuuuu");
    }

    public void lalala(){
        Animal gato = () -> {
            System.out.println("Hola");
        };
    }

}
