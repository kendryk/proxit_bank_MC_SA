package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;
    private String tel;

    @OneToMany(mappedBy = "proprietaire", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<CompteCourant> comptes = new HashSet<>();

    //#region *******  CONSTRUCTEURS   *******************  */

    protected Client() {

    }

    public Client(String nom, String prenom, String adresse, String cp, String ville, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.tel = tel;
    }
    //#endregion

    //#region *******   GETTERS SETTERS    *******************  */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Set<CompteCourant> getComptes() {
        return comptes;
    }

    public void setComptes(Set<CompteCourant> comptes) {
        this.comptes = comptes;
    }

    //#endregion

    //#region *******   TO STRING   *******************  */

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cp='" + cp + '\'' +
                ", ville='" + ville + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    //#endregion
}
