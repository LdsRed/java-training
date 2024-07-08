package sections.junior;

public class Automovil extends Vehiculo{

    private  String tipoMotor;
    private String tipoCaja; //Mecanico o Automatico
    private int cantPuertas;
    private int cantPasajeros;
    private boolean esElectrico;
    private String modelo;

    
    public Automovil(String tipoMotor, String tipoCaja, int cantPuertas, int cantPasajeros, boolean esElectrico,
            String modelo) {
        this.tipoMotor = tipoMotor;
        this.tipoCaja = tipoCaja;
        this.cantPuertas = cantPuertas;
        this.cantPasajeros = cantPasajeros;
        this.esElectrico = esElectrico;
        this.modelo = modelo;
    }


    public Automovil(String color, String marca, String placa, String tipoMotor, String tipoCaja, int cantPuertas,
            int cantPasajeros, boolean esElectrico, String modelo) {
        super(color, marca, placa);
        this.tipoMotor = tipoMotor;
        this.tipoCaja = tipoCaja;
        this.cantPuertas = cantPuertas;
        this.cantPasajeros = cantPasajeros;
        this.esElectrico = esElectrico;
        this.modelo = modelo;
    }


    

    public String getTipoMotor() {
        return tipoMotor;
    }


    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }


    public String getTipoCaja() {
        return tipoCaja;
    }


    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }


    public int getCantPuertas() {
        return cantPuertas;
    }


    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }


    public int getCantPasajeros() {
        return cantPasajeros;
    }


    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }


    public boolean isEsElectrico() {
        return esElectrico;
    }


    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void acelerar() {
        System.out.println("Automovil acelerandooooooooooooooooooooooooo.......");
    }


}
