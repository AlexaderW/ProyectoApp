package com.chacombo.chacomboapp.entidad;

public class Pedido {
    private int id_ped;
    private int userID_ped;
    private String metodoDepago;
    private double total_ped;

    public Pedido(int id_ped, int userID_ped, String metodoDepago, double total_ped) {
        this.id_ped = id_ped;
        this.userID_ped = userID_ped;
        this.metodoDepago = metodoDepago;
        this.total_ped = total_ped;
    }

    public int getId_ped() {
        return id_ped;
    }

    public void setId_ped(int id_ped) {
        this.id_ped = id_ped;
    }

    public int getUserID_ped() {
        return userID_ped;
    }

    public void setUserID_ped(int userID_ped) {
        this.userID_ped = userID_ped;
    }

    public String getMetodoDepago() {
        return metodoDepago;
    }

    public void setMetodoDepago(String metodoDepago) {
        this.metodoDepago = metodoDepago;
    }

    public double getTotal_ped() {
        return total_ped;
    }

    public void setTotal_ped(double total_ped) {
        this.total_ped = total_ped;
    }
}
