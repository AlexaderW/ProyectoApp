package com.chacombo.chacomboapp.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {

    public BaseDatos(Context context){
        super(context, "restaurante.db", null,1);//Cuando quieran hacer cambios actualicen la version
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query;
        query = "CREATE TABLE usuario ("+
                "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "nombre_usuario TEXT NOT NULL, "+
                "apellido_usuario TEXT NOT NULL, "+
                "email_usuario TEXT NOT NULL, "+
                "contrasenia_usuario TEXT NOT NULL, "+
                "direccion_usuario TEXT NOT NULL, "+
                "telefono_usuario TEXT NOT NULL);";
        db.execSQL(query);

        query = "CREATE TABLE producto ("+
                "id_producto INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre_producto TEXT NOT NULL, "+
                "descripcion_producto TEXT NOT NULL, "+
                "precio_producto DOUBLE NOT NULL, "+
                "categoria_producto TEXT NOT NULL, "+
                "imagen_producto TEXT NOT NULL); ";
        db.execSQL(query);

        query = "CREATE TABLE historial ("+
                "id_historial INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "id_pedido INTEGER NOT NULL, "+
                "id_usuario INTEGER NOT NULL, "+
                "fecha_historial TEXT NOT NULL, "+
                "descripcion_historial TEXT NOT NULL, "+
                "total_historial DOUBLE NOT NULL); ";
        db.execSQL(query);

        query = "CREATE TABLE pedido ("+
                "id_pedido INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "id_usuario INTEGER NOT NULL, "+
                "metodoPago_pedido TEXT NOT NULL, "+
                "total_pedido DOUBLE NOT NULL); ";
        db.execSQL(query);

        query = "CREATE TABLE carrito ("+
                "id_carrito INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "id_usuario INTEGER NOT NULL, "+
                "id_producto INTEGER NOT NULL, "+
                "cantidad_carrito INTEGER NOT NULL); ";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
