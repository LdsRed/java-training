package traineeSection.ejercicio10;

public class Rectangulo {

    private int base;
    private int altura;


    public Rectangulo() {}

    public Rectangulo(int base, int altura){
       setAltura(altura);
       setBase(base);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int areaRectangulo(int base, int altura){
        return base*altura;
    }
}
