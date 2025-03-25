public class Compte {
    private int compte;
    private int soldeCompte;

    public Compte(int compte, int soldeCompte) {
        this.compte = compte;
        this.soldeCompte = soldeCompte;
    }

    public int getCompte() {
        return compte;
    }

    public void setCompte(int compte) {
        this.compte = compte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
