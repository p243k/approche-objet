package banque;

public class Compte {
    private String compte;
    private int soldeCompte;

    public Compte(String compte, int soldeCompte) {
        this.compte = compte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "compte=" + compte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
