package sections.junioradv.generics;

public class AbstractGeneric<T> {

    private T descripcion;


    public AbstractGeneric(){}
    public AbstractGeneric(T descripcion){
        this.descripcion = descripcion;
    }

    public T getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(T descripcion){
        this.descripcion = descripcion;
    }
    
}
