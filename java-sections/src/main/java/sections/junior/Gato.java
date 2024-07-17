package sections.junior;

public class Gato implements Animal{

    private String raza;
    private String nombre;

    @Override
    public void hacerSonido() {
        System.out.println("Meowwwwwwwwwwwwwwwwwwwwwww");
    }
}
