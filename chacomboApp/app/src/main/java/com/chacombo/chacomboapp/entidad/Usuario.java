package com.chacombo.chacomboapp.entidad;

public class Usuario {

    private int id_usuario;
    private String nombre_usuario;
    private String apellido_usuario;
    private String contrasenia_usuario;
    private String direccion_usuario;
    private String numero_usuario;

    public Usuario(int id_usuario, String nombre_usuario, String apellido_usuario, String contrasenia_usuario, String direccion_usuario, String numero_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
        this.direccion_usuario = direccion_usuario;
        this.numero_usuario = numero_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }

    public String getDireccion_usuario() {
        return direccion_usuario;
    }

    public void setDireccion_usuario(String direccion_usuario) {
        this.direccion_usuario = direccion_usuario;
    }

    public String getNumero_usuario() {
        return numero_usuario;
    }

    public void setNumero_usuario(String numero_usuario) {
        this.numero_usuario = numero_usuario;
    }
}
