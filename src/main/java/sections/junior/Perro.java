package sections.junior;

public class Perro implements Animal {

    private String raza;
    private String nombre;



    @Override
    public void hacerSonido() {
        System.out.println("Guauuuuuuu");
    }
}
