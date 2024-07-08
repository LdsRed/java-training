package sections.junior;

/*
* La herencia es el proceso mediante el cual una clase adquire las propiedades (métodos, atributos)  de otra clase
* Para que se pueda realizar la herencia de la clase Vehiculo se debe utilizar la palabra clave extends
* Dicha clase derivada de la clase base o padre podrá acceder a todos sus atributos y metodos
* La subclase podrá implementar sus propios métodos
* La subclase podrá utilizar los métodos constructores de la superclase
* La subclase podrá sobreescribir los métodos de la superclase
*  */
public class Motocicleta extends Vehiculo {

    private int cilindrada;
    private int cantRuedas;
    private boolean esElectrica;

    public Motocicleta(){}

    public Motocicleta(String color, String marca, String placa, int cilindrada, int cantRuedas, boolean esElectrica) {
        super(color, marca, placa);
        this.cilindrada = cilindrada;
        this.cantRuedas = cantRuedas;
        this.esElectrica = esElectrica;
    }

    public Motocicleta(int cilindrada, int cantRuedas, boolean esElectrica) {
        this.cilindrada = cilindrada;
        this.cantRuedas = cantRuedas;
        this.esElectrica = esElectrica;
    }


    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    @Override
    public void acelerar() {
        System.out.println("Motocicleta acelerandoooooooooooo");
    }
}
