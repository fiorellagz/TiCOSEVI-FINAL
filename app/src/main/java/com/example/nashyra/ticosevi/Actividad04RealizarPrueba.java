package com.example.nashyra.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Actividad04RealizarPrueba extends AppCompatActivity {


    public void Mensaje(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad04_realizar_prueba);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new
                                                      RadioGroup.OnCheckedChangeListener() {
                                                          public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                              RadioButton rb1 = (RadioButton) findViewById(R.id.rbFacil);
                                                              RadioButton rb2 = (RadioButton) findViewById(R.id.rbMedio);
                                                              RadioButton rb3 = (RadioButton) findViewById(R.id.rbDificil);
                                                              if (rb1.isChecked()) {

                                                                  Intent intento = new Intent(getApplicationContext(), Pregunta01.class);
                                                                  startActivity(intento);
                                                              }
                                                              if (rb2.isChecked()) {
                                                                  Intent intento = new Intent(getApplicationContext(), Pregunta21.class);
                                                                  startActivity(intento);
                                                              }
                                                              if (rb3.isChecked()) {
                                                                  Mensaje("tres");
                                                              }
                                                          }
                                                      });
    }

}
