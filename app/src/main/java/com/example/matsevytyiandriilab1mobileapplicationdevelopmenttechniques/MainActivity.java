package com.example.matsevytyiandriilab1mobileapplicationdevelopmenttechniques;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing
        Button btnChangeColor = findViewById(R.id.btnChangeColor);
        Button btnChangeText = (Button) findViewById(R.id.btnChangeText);
        this.textView = findViewById(R.id.textView);

        // Changing the color
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.parseColor("RED"));
            }
        });



        btnChangeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText("Heroyam Slava!");
            }
        });
    }
}