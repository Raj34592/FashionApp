package com.example.fashionapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShortDress = findViewById(R.id.btnShortDress);
        Button btnBikini = findViewById(R.id.btnBikini);

        btnShortDress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Loading Short Dress Mode...", Toast.LENGTH_SHORT).show();
                // Model file reading process will start here
            }
        });

        btnBikini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Loading Bikini Mode...", Toast.LENGTH_SHORT).show();
                // Model file reading process will start here
            }
        });
    }
}
