package model;

import java.time.LocalDateTime;

public abstract class Compte {
    private Integer noCompte;
    private Double solde;
    private LocalDateTime dateCreation;
    private Client proprietaire;

    public Compte(Integer noCompte, Double solde, Client proprietaire) {
        this.noCompte = noCompte;
        this.solde = solde;
        this.dateCreation = LocalDateTime.now();
        this.proprietaire = proprietaire;
    }

    public Integer getNoCompte() {
        return noCompte;
    }

    public void setNoCompte(Integer noCompte) {
        this.noCompte = noCompte;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }
}