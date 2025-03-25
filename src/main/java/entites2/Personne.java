package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adressePostale;


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void afficherIdentite() {
        System.out.println("Vous êtes " + this.prenom + " " + this.nom.toUpperCase());
    }

    public void modifierNom(String nom) {
        this.nom = nom;
    }

    public void modifierPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void modifierAdresse(AdressePostale adresse) {
        this.adressePostale = adresse;
    }

    public String retournerNom() {
        return this.nom;
    }

    public String retournerPrenom() {
        return this.prenom;
    }

    public AdressePostale retournerAdresse() {
        return this.adressePostale;
    }
}
