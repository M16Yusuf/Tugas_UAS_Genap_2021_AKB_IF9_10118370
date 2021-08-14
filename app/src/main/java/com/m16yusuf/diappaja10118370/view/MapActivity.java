package com.m16yusuf.diappaja10118370.view;
//Nama : Muhammad Yusuf
//Kelas : IF-9
//NIM : 10118370
//tanggal : Selasa, 10 Agustus 2021
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
import com.m16yusuf.diappaja10118370.R;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this::onMapReady);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap;
        float zoomLevel = 11.0f;
        LatLng gedungSate = new LatLng(-6.902278824541198,107.6188207254519);
        LatLng curugCimahi = new LatLng(-6.797163015295453, 107.57849784602448);
        LatLng transStudio = new LatLng(-6.924962038991913, 107.63648883390613);
        LatLng museumGoe = new LatLng(-6.900535126025427, 107.62147675428729);
        LatLng kebunBin = new LatLng(-6.889149773413878, 107.6078462565295);
        map.addMarker(new MarkerOptions().position(gedungSate).title("Gedung Sate "));
        map.addMarker(new MarkerOptions().position(curugCimahi).title("Curug Cimahi"));
        map.addMarker(new MarkerOptions().position(transStudio).title("Trans Studio Bandung"));
        map.addMarker(new MarkerOptions().position(museumGoe).title("Museum Geologi Bandung"));
        map.addMarker(new MarkerOptions().position(kebunBin).title("Kebun Binatang Bandung"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(gedungSate, zoomLevel));
    }
}