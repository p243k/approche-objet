package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne("MABUSO", "Pierre");
        Personne personne2 = new Personne("Andre", "Jean", new AdressePostale(6, "Colette", 59000, "Lille"));
        AdressePostale adressePostale = new AdressePostale(4, "Serge", 74000, "Paris");
        personne1.modifierAdresse(adressePostale);
    }
}
