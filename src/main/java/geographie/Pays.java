package geographie;

public class Pays {
    private String nom;
    private int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
