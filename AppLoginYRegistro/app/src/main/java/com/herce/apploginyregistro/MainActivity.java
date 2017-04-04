package com.herce.apploginyregistro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnregistro = (Button)findViewById(R.id.buttonRegistrarse);
        Button btnlogin = (Button)findViewById(R.id.buttonEntrar);

        btnregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad = new Intent(MainActivity.this, Registro.class);
                startActivity(actividad);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad = new Intent(MainActivity.this, Login.class);
                startActivity(actividad);
            }
        });
    }
}
