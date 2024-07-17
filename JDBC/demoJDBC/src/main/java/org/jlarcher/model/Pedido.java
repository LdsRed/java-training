package org.jlarcher.model;

public class Pedido {

    private Long id_pedidos;
    private String nombre_producto;
    private int cantidad_productos;
    private int numero_serie;
    private Long id_cliente;


    public Pedido() {
    }

    public Pedido( String nombre_producto, int numero_serie, Long id_cliente, int cantidad_productos) {
        this.nombre_producto = nombre_producto;
        this.numero_serie = numero_serie;
        this.id_cliente = id_cliente;
        this.cantidad_productos = cantidad_productos;
    }

    public Long getId_pedidos() {
        return id_pedidos;
    }

    public void setId_pedidos(Long id_pedidos) {
        this.id_pedidos = id_pedidos;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad_productos() {
        return cantidad_productos;
    }

    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }
}
