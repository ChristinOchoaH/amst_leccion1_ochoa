package com.example.amst_l1_ochoa_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Bienestar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestar);
        login();
    }

    public void login(){
        Toast toast=Toast.makeText(getApplicationContext(),"Horario de Atención: 08:00 - 15:00",Toast.LENGTH_SHORT);
        toast.show();
    }
}
