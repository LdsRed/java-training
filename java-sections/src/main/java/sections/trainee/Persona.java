package sections.trainee;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(){}
    public Persona(String nombre, int edad){
        setEdad(edad);
        setNombre(nombre);
    }   // la sobrecarga

    public String getNombre() {
        return nombre;
    } // los getters y setters también son llamados accessors

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Datos de la persona: " + "Nombre: " + getNombre() +", edad: " + getEdad();
    }

}
