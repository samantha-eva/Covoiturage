package com.example.covoiturage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class activity_inscription extends AppCompatActivity{

    EditText ville ;
    EditText nom ;
    EditText prenom;
    Button valider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        ville= (EditText) findViewById(R.id.ville);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        valider = (Button) findViewById(R.id.valider);

    }

    public void inscription(View vue) {

        Toast toast = Toast.makeText(this, "Inscription", Toast.LENGTH_LONG);
        toast.show();
    }

    public void connexion(View vue) {

        Toast toast = Toast.makeText(this, "Connexion", Toast.LENGTH_LONG);
        toast.show();
    }

    public void apropos(View vue) {

        Toast toast = Toast.makeText(this, "A propos", Toast.LENGTH_LONG);
        toast.show();
    }
    public void Valider(View view) {

        String villePersonneSaisie = ville.getText().toString();
        String nomPersonneSaisie = nom.getText().toString();
        String prenomPersonneSaisie = prenom.getText().toString();

        Enseignant UnEnseignant = new Enseignant(villePersonneSaisie, nomPersonneSaisie, prenomPersonneSaisie);
        Gson gson = new GsonBuilder().create();
        String jsonEnseignant = gson.toJson(UnEnseignant);


        Bundle paquet = new Bundle();
        paquet.putString("enseignant", jsonEnseignant);
       /* paquet.putString("ville", villePersonneSaisie);
        paquet.putString("nom", nomPersonneSaisie);
        paquet.putString("prenom", prenomPersonneSaisie);*/
        Intent intentEnvoyer = new Intent(this, Inscription.class);
        intentEnvoyer.putExtras(paquet);
        startActivity(intentEnvoyer);
    }
}


