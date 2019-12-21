package com.example.covoiturage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cnx;
    Button ins;
    Button apropos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cnx = (Button) findViewById(R.id.cnx);
        ins = (Button) findViewById(R.id.ins);
        apropos = (Button) findViewById(R.id.apropos);
    }


    public void Connexion(View view) {
        //avoir le formulaire de cnx
        //puis la liste déroulante des enseignants nom/prenom
    }

    public void Inscription(View view) {
        Intent intentInscription = new Intent(this,activity_inscription.class);
        startActivity(intentInscription);
    }

    public void Apropos(View view) {
    }
}
