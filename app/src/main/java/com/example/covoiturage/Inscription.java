package com.example.covoiturage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Inscription extends AppCompatActivity {
    TextView infoPerso;
    Button accueil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ins);

        infoPerso = (TextView) findViewById(R.id.infoPerso);
        Bundle paquet = this.getIntent().getExtras();
        String getEnseignant = paquet.getString("enseignant");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Enseignant UnEnseignant = gson.fromJson(getEnseignant, Enseignant.class);

        infoPerso.setText("Ville : "+ UnEnseignant.getVille() + ", nom : "+ UnEnseignant.getNom() + ", prenom : "+ UnEnseignant.getPrenom() + " !");

    }

    public void Accueil(View vue) {
        Intent intentAccueil = new Intent(this,MainActivity.class);
        startActivity(intentAccueil);
    }

}
