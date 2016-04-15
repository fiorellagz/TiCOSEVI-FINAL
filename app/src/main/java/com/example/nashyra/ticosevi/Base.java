package com.example.nashyra.ticosevi;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class Base extends AppCompatActivity {
    private int nivel;//1 -> 10, 2-> 20, 3-> 40
    private ArrayList<String> preguntas; //el array debe ser de obejtos preguta o de lo que se cargue de la base de datos
    private int buenas;
    private int malas;


    public void Mensaje(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
