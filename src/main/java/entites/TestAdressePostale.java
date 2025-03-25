package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale a = new AdressePostale();
        AdressePostale b = new AdressePostale();
        a.codePostal = 59000;
        a.libelleRue = "Colette";
        a.numeroRue = 6;
        a.ville = "Lille";

        b.codePostal = 59000;
        b.libelleRue = "Bruno";
        b.numeroRue = 7;
        b.ville = "Lille";
    }
}
