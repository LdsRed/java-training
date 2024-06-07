package sections.trainee;

public class Archie extends Persona {

    protected String nombre;
    protected int edad;


    public Archie(){};
    public Archie(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
