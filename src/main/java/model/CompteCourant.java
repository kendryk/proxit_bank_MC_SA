package model;

public class CompteCourant extends Compte {

    private Double decouvertMax;

    private TypeCarte typeCarte;

    public CompteCourant(Integer noCompte, Double solde, Client proprietaire, Double decouvertMax, TypeCarte typeCarte) {
        super(noCompte, solde, proprietaire);
        this.decouvertMax = decouvertMax;
        this.typeCarte = typeCarte;
    }

    public CompteCourant(Integer noCompte, Double solde, Client proprietaire, TypeCarte typeCarte) {
        super(noCompte, solde, proprietaire);
        this.decouvertMax = 1000.0;
        this.typeCarte = typeCarte;
    }

    public Double getDecouvertMax() {
        return decouvertMax;
    }

    public void setDecouvertMax(Double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public TypeCarte getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(TypeCarte typeCarte) {
        this.typeCarte = typeCarte;
    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                "decouvertMax=" + decouvertMax +
                ", typeCarte=" + typeCarte +
                "} " + super.toString();
    }

    public enum TypeCarte {ELECTRON, PREMIER}

}