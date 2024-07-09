package sections.junioradv;

public class Employee {
    private Person persona;
    private long salario;
    private String cargo;

    public Employee(){}
    public Employee(Person persona, long salario, String cargo){
        this.persona = persona;
        this.salario = salario;
        this.cargo = cargo;
    }
    public Person getPersona() {
        return persona;
    }
    public void setPersona(Person persona) {
        this.persona = persona;
    }
    public long getSalario() {
        return salario;
    }
    public void setSalario(long salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    

}
