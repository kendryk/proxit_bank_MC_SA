package model;


public class CompteEpargne extends Compte {
    private Double tauxRemuneration;

    public CompteEpargne(Integer noCompte, Double solde, Client proprietaire, Double tauxRemuneration) {
        super(noCompte, solde, proprietaire);
        this.tauxRemuneration = tauxRemuneration;
    }

    public CompteEpargne(Integer noCompte, Double solde, Client proprietaire) {
        super(noCompte, solde, proprietaire);
        this.tauxRemuneration = 0.03;
    }

    public Double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(Double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "tauxRemuneration=" + tauxRemuneration +
                "} " + super.toString();
    }
}