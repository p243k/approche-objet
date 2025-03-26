package banque;

public class CompteTaux extends Compte {
    int tauxRemuneration;

    public CompteTaux(String compte, int soldeCompte, int tauxRemuneration) {
        super(compte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + "\n CompteTaux{" +
                "tauxRemuneration=" + tauxRemuneration +
                '}';
    }
}
