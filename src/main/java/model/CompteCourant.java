package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CompteCourant {

    @Id
    @GeneratedValue
    private Integer id;
    private Double solde;
    private LocalDateTime dateCreation;
    private Double decouvertMax;
    private TypeCarte typeCarte;
    public enum TypeCarte {ELECTRON, PREMIER}

    @ManyToOne(cascade={CascadeType.PERSIST})
    @JoinColumn(name = "client_id")
    private Client proprietaire;

    //#region *******  CONSTRUCTEURS   *******************  */
    public CompteCourant() {

    }

    public CompteCourant(Double solde, Client proprietaire, Double decouvertMax, TypeCarte typeCarte) {
        this.solde = solde;
        this.proprietaire = proprietaire;
        this.dateCreation = LocalDateTime.now();
        this.decouvertMax = decouvertMax;
        this.typeCarte = typeCarte;
    }

    public CompteCourant(Double solde, Client proprietaire, TypeCarte typeCarte) {
        this.solde = solde;
        this.proprietaire = proprietaire;
        this.dateCreation = LocalDateTime.now();
        this.decouvertMax = 1000.0;
        this.typeCarte = typeCarte;
    }
    //#endregion

    //#region *******  GETTERS SETTERS   *******************  */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    //#endregion





}