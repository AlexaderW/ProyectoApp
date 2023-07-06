package com.chacombo.chacomboapp.entidad;

import java.time.LocalDate;

public class Historial {

    private int id_historial;
    private int id_pedido;
    private int id_usuario;
    private String fecha_historial;
    private String descripcion_historial;
    private double total_historial;

    //CONSTRUCTOR
    public Historial(int id_historial, int id_pedido, int id_usuario, String fecha_historial, String descripcion_historial, double total_historial) {
        this.id_historial = id_historial;
        this.id_pedido = id_pedido;
        this.id_usuario = id_usuario;
        this.fecha_historial = fecha_historial;
        this.descripcion_historial = descripcion_historial;
        this.total_historial = total_historial;
    }
    public Historial(int id_pedido, int id_usuario, String fecha_historial, String descripcion_historial, double total_historial) {
        this.id_pedido = id_pedido;
        this.id_usuario = id_usuario;
        this.fecha_historial = fecha_historial;
        this.descripcion_historial = descripcion_historial;
        this.total_historial = total_historial;
    }

    //GET AND SET
    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

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

    public String getFecha_historial() {
        return fecha_historial;
    }

    public void setFecha_historial(String fecha_historial) {
        this.fecha_historial = fecha_historial;
    }

    public String getDescripcion_historial() {
        return descripcion_historial;
    }

    public void setDescripcion_historial(String descripcion_historial) {
        this.descripcion_historial = descripcion_historial;
    }

    public double getTotal_historial() {
        return total_historial;
    }

    public void setTotal_historial(double total_historial) {
        this.total_historial = total_historial;
    }
}
