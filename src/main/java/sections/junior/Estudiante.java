package sections.junior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estudiante {

    private String nombre;
    private int edad;
    List<String> asignaturas = new ArrayList<>();

    public Estudiante(){}

    public Estudiante(String nombre, int edad, List<String> asignaturas) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", edad: " + edad + ", asignaturas = " + asignaturas;
    }
}
