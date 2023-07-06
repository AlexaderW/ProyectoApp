package com.chacombo.chacomboapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Ubicanos_mapa extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicanos_mapa);
        SupportMapFragment mapFragment =
                (SupportMapFragment)getSupportFragmentManager()
                        .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng restaurante = new LatLng(-11.965147, -76.995838);
        mMap.addMarker(new MarkerOptions()
                .position(restaurante).title("RESTAURANTE - CHACOMBO CHICHARRONES"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(restaurante,20));
    }
}