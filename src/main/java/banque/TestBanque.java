package banque;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("FR123456", 150);
        comptes[1] = new CompteTaux("LIVRETA", 150, 25);

        for (Compte cpt : comptes) {
            System.out.println(cpt);
        }

    }
}
