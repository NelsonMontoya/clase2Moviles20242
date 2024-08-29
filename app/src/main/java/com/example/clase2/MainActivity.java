package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ingresarUsuario;
    TextView usuario;
    Button hola,mundo;

    String nombreUsuario;
    String TAG = "Test";

    Persona datosUsuario;   //defino el tipo de dato y el nombre

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Estoy en el onCreate");

        ingresarUsuario = (EditText) findViewById(R.id.editarUsuario);
        usuario = (TextView) findViewById(R.id.txvUsuario);
        hola = findViewById(R.id.btnHola);
        mundo = findViewById(R.id.btnMundo);
        datosUsuario = new Persona(1020304050,(byte)50,"Pedro","Perez");



        hola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(TAG,"eSTOY EN EL BOTON");

                Intent pasarDatos = new Intent(MainActivity.this, MainActivity2.class);
                pasarDatos.putExtra("Nombre","Juan");
                pasarDatos.putExtra("Edad",20);
                startActivity(pasarDatos);

            }
        });

        //Log.d(TAG,datosUsuario.getNombre());
        //datosUsuario.setNombre("Alonso");
        //Log.d(TAG,datosUsuario.getNombre());


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en el onStart");


        mundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG,"Estoy en el onResume");
        //poner mensaje en pantalla
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en el onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estoy en el onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Estoy en el onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Estoy en el onDestroy");
    }
}