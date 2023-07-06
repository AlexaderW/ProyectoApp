package com.chacombo.chacomboapp.entidad;

public class Pedido {

    private int id_pedido;
    private int id_usuario;
    private String metodoPago_pedido;
    private Double total_pedido;

    //CONSTRUCTOR
    public Pedido(int id_pedido, int id_usuario, String metodoPago_pedido, Double total_pedido) {
        this.id_pedido = id_pedido;
        this.id_usuario = id_usuario;
        this.metodoPago_pedido = metodoPago_pedido;
        this.total_pedido = total_pedido;
    }
    public Pedido(int id_usuario, String metodoPago_pedido, Double total_pedido) {
        this.id_usuario = id_usuario;
        this.metodoPago_pedido = metodoPago_pedido;
        this.total_pedido = total_pedido;
    }
    //GET AND SET
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getMetodoPago_pedido() {
        return metodoPago_pedido;
    }

    public void setMetodoPago_pedido(String metodoPago_pedido) {
        this.metodoPago_pedido = metodoPago_pedido;
    }

    public Double getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_pedido(Double total_pedido) {
        this.total_pedido = total_pedido;
    }
}