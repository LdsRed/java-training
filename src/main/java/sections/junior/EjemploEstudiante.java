package sections.junior;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploEstudiante {

    public static void main(String[] args) {


        Estudiante estudiante = new Estudiante("Jordan", 28, Arrays.asList("Java", "C++", "C#"));

        System.out.println(estudiante);
    }
}
