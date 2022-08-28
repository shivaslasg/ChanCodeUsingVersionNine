package com.example.chancodeusingversionnine;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.Style;

public class OneMap3 extends FragmentActivity {

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, getResources().getString(R.string.mapbox_access_token));

        setContentView(R.layout.activity_one_map3);

        mapView = findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(mapboxMap -> {
            mapboxMap.setStyle(
                    new Style.Builder().fromUri("https://maps-json.onemap.sg/Default.json"),
                    style -> {

                    }
            );
            CameraPosition cameraPosition = new CameraPosition.Builder()
                    .target(new LatLng(1.2867888749929002, 103.8545510172844))
                    .zoom(12.0)
                    .build();
            mapboxMap.setCameraPosition(cameraPosition);
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }
}