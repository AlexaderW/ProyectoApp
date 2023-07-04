package com.chacombo.chacomboapp.entidad;

import java.time.LocalDate;

public class Historial {

    private  int id_his;
    private  int pedID_his;
    private int userID_his;
    private String fecha_hist;
    private String descrip_hist;
    private double total_hist;

    public Historial(int id_his, int pedID_his, int userID_his, String fecha_hist, String descrip_hist, double total_hist) {
        this.id_his = id_his;
        this.pedID_his = pedID_his;
        this.userID_his = userID_his;
        this.fecha_hist = fecha_hist;
        this.descrip_hist = descrip_hist;
        this.total_hist = total_hist;
    }

    public int getId_his() {
        return id_his;
    }

    public void setId_his(int id_his) {
        this.id_his = id_his;
    }

    public int getPedID_his() {
        return pedID_his;
    }

    public void setPedID_his(int pedID_his) {
        this.pedID_his = pedID_his;
    }

    public int getUserID_his() {
        return userID_his;
    }

    public void setUserID_his(int userID_his) {
        this.userID_his = userID_his;
    }

    public String getFecha_hist() {
        return fecha_hist;
    }

    public void setFecha_hist(String fecha_hist) {
        this.fecha_hist = fecha_hist;
    }

    public String getDescrip_hist() {
        return descrip_hist;
    }

    public void setDescrip_hist(String descrip_hist) {
        this.descrip_hist = descrip_hist;
    }

    public double getTotal_hist() {
        return total_hist;
    }

    public void setTotal_hist(double total_hist) {
        this.total_hist = total_hist;
    }
}
