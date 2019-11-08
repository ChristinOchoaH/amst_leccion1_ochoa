package com.example.amst_l1_ochoa_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inSidweb(View view) {
        Intent intent = new Intent(this, Sidweb.class);
        startActivity(intent);
    }

    public void inAcademico(View view) {
        Intent intent = new Intent(this, SistemaAcademico.class);
        startActivity(intent);
    }

    public void inSociedad(View view) {
        Intent intent = new Intent(this, VinculosSociedad.class);
        startActivity(intent);
    }

    public void inBienestar(View view) {
        Intent intent = new Intent(this, Bienestar.class);
        startActivity(intent);
    }
}
