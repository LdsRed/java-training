package sections.junior;



/*Clase Abstracta
* Caracteristicas:
*   -Puede tener métodos abstractos y concretos
*   -Puede tener variables de instancia
*   -Puede tener constructores
*   -Cumple solo con Herencia Simple
*   -Los métodos pueden tener cualquier modificaord de acceso (public, private, protected, etc)
*   -USOS:
*        - Generalmente se la utiliza para la herencia de codigo y caracteristicas comunes a la subclases
*           siempre y cuando esten relacionadas.
* */
public abstract class Vehiculo {

    private String color;
    private String marca;
    private String placa;

    public Vehiculo(){}

    public Vehiculo(String color, String marca, String placa){
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //Un metodo abstracto no puede tener un body
    //Las clases que deriven de esta deberan implementar dicho metodo
    public abstract void acelerar();

}
