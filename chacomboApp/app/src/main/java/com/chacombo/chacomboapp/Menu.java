package com.chacombo.chacomboapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;


public class Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    ImageButton imgBtnChicharron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        asignarReferencias();

        /*----------------Hooks------------------*/
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);

        /*----------------Tool Bar------------------*/
        setSupportActionBar(toolbar);
        /*----------------Navigation Drawer Menu------------------*/
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navi_drawer_open,R.string.navi_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);
    }

    private void  asignarReferencias(){

    imgBtnChicharron = findViewById(R.id.imgBtnChicharron);

    imgBtnChicharron.setOnClickListener(view -> {

        Intent intent = new Intent(Menu.this, chicharron1k.class);
        startActivity(intent);
    });

    }


    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

    int id = menuItem.getItemId();

    if(id==R.id.nav_home){
        Intent intent =new Intent(Menu.this, Menu.class);
        startActivity(intent);
        }
    if(id==R.id.nav_perfil){
        Intent intent = new Intent(Menu.this,Perfil.class);
        startActivity(intent);
        }
    if(id==R.id.nav_historial){
        Intent intent =new Intent(Menu.this, Historial.class);
        startActivity(intent);
    }
    if (id==R.id.nav_carrito){
        Intent intent = new Intent(Menu.this, Carrito.class);
        startActivity(intent);
    }

    if (id==R.id.nav_ubicanos){
            Intent intent = new Intent(Menu.this, Ubicanos_mapa.class);
            startActivity(intent);
        }
        return true;

    }
}