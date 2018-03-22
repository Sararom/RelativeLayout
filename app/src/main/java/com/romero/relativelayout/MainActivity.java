package com.romero.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGuardar = findViewById(R.id.guardar);

        btnGuardar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("Holi", "No manches");
            }

        }); }


        public void cancelar(View view){
            Log.d("Hola","cancelar");
        }

    }

