package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Mabuso";
        personne1.prenom = "Pierre";
        personne1.adressePostale = new AdressePostale();

        personne2.nom = "Andre";
        personne2.prenom = "Jean";
        personne2.adressePostale = new AdressePostale();
    }
}
