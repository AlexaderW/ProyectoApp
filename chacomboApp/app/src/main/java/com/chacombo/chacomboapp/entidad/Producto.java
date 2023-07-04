package com.chacombo.chacomboapp.entidad;

public class Producto {

    private int id_prod;
    private String nombre_prod;
    private String descripcion_prod;
    private double precio_prod;
    private String categoria_prod;

    public Producto(int id_prod, String nombre_prod, String descripcion_prod, double precio_prod, String categoria_prod) {
        this.id_prod = id_prod;
        this.nombre_prod = nombre_prod;
        this.descripcion_prod = descripcion_prod;
        this.precio_prod = precio_prod;
        this.categoria_prod = categoria_prod;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public String getDescripcion_prod() {
        return descripcion_prod;
    }

    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }

    public double getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(double precio_prod) {
        this.precio_prod = precio_prod;
    }

    public String getCategoria_prod() {
        return categoria_prod;
    }

    public void setCategoria_prod(String categoria_prod) {
        this.categoria_prod = categoria_prod;
    }
}
