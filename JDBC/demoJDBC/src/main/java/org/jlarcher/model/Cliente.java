package org.jlarcher.model;

public class Cliente {

    private Long id_cliente;
    private String nombre;
    private String direccion;
    private int cantidad_pedidos;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, int cantidad_pedidos) {
        this.nombre = nombre;
        this.cantidad_pedidos = cantidad_pedidos;
        this.direccion = direccion;
    }

    public Cliente(Long id_cliente, String nombre, String direccion, int cantidad_pedidos) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidad_pedidos = cantidad_pedidos;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad_pedidos() {
        return cantidad_pedidos;
    }

    public void setCantidad_pedidos(int cantidad_pedidos) {
        this.cantidad_pedidos = cantidad_pedidos;
    }

    @Override
    public String toString() {
        return " | "
                + id_cliente +
                " | "
                + nombre +
                " | "
                + direccion +
                " | "
                + cantidad_pedidos +
                " | " ;
    }
}
