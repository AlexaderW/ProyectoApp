package com.chacombo.chacomboapp.entidad;

public class Producto {

   private int id_producto;
   private String nombre_producto;
   private String descripcion_producto;
   private Double precio_producto;
   private String categoria_producto;
   private String imagen_producto;

   //CONSTRUCTOR
    public Producto(int id_producto, String nombre_producto, String descripcion_producto, Double precio_producto, String categoria_producto, String imagen_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.precio_producto = precio_producto;
        this.categoria_producto = categoria_producto;
        this.imagen_producto = imagen_producto;
    }
    //GET AND SET
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(String categoria_producto) {
        this.categoria_producto = categoria_producto;
    }

    public String getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(String imagen_producto) {
        this.imagen_producto = imagen_producto;
    }
}
