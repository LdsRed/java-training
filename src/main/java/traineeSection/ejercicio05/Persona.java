package traineeSection.ejercicio05;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(){}
    public Persona(String nombre, int edad){
        setEdad(edad);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

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
