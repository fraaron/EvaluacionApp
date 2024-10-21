package com.example.evaluacion; // Cambia esto por tu paquete

import androidx.appcompat.app.AppCompatActivity;
import org.osmdroid.config.Configuration;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.util.GeoPoint;

import android.os.Bundle;

public class MapActivity extends AppCompatActivity {

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configuración de OSMDroid
        Configuration.getInstance().load(this, getSharedPreferences("osmdroid", MODE_PRIVATE));

        setContentView(R.layout.activity_map);

        mapView = findViewById(R.id.map);
        mapView.setTileSource(org.osmdroid.tileprovider.tilesource.TileSourceFactory.MAPNIK);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);

        // Establecer la ubicación inicial en Nueva York (puedes cambiarla)
        GeoPoint startPoint = new GeoPoint(40.712776, -74.005974); // Nueva York
        mapView.getController().setZoom(10.0);
        mapView.getController().setCenter(startPoint);

        // Agregar un marcador en Nueva York
        Marker marker = new Marker(mapView);
        marker.setPosition(startPoint);
        marker.setTitle("Marcador en Nueva York");
        mapView.getOverlays().add(marker);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume(); // Llama a onResume del mapa
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause(); // Llama a onPause del mapa
    }
}