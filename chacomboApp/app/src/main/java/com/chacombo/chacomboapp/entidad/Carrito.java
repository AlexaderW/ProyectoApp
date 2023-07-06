package com.chacombo.chacomboapp.entidad;

public class Carrito {

    private int id_carrito;
    private int id_usuario;
    private int id_producto;
    private int cantidad_carrito;

    //CONSTRUCTOR
    public Carrito(int id_carrito, int id_usuario, int id_producto, int cantidad_carrito) {
        this.id_carrito = id_carrito;
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
        this.cantidad_carrito = cantidad_carrito;
    }
    public Carrito(int id_usuario, int id_producto, int cantidad_carrito) {
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
        this.cantidad_carrito = cantidad_carrito;
    }
    //GET AND SET

    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad_carrito() {
        return cantidad_carrito;
    }

    public void setCantidad_carrito(int cantidad_carrito) {
        this.cantidad_carrito = cantidad_carrito;
    }
}