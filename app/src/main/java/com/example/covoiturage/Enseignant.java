package com.example.covoiturage;

class Enseignant {

    private final String ville;
    private final String nom;
    private final String prenom;

    public Enseignant(String villePersonneSaisie, String nomPersonneSaisie, String prenomPersonneSaisie) {
        this.ville = villePersonneSaisie;
        this.nom = nomPersonneSaisie;
        this.prenom = prenomPersonneSaisie;
    }

    public String getVille() {
        return ville;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
