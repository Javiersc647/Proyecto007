package com.example.proyecto007;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mitexto = new TextView(this);
        mitexto.setText("Hola mi gente de zona!!!!");
        setContentView(mitexto);
    }
}