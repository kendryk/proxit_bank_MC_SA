package model;

public class Client {

    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;
    private String tel;

    /* **************  CONSTRUCTEURS   *******************  */
    public Client(String nom, String prenom, String adresse, String cp, String ville, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.tel = tel;
    }

    /* **************   GETTERS SETTERS    *******************  */
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    /* **************   TO STRING   *******************  */
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cp='" + cp + '\'' +
                ", ville='" + ville + '\'' +
                ", tel=" + tel +
                '}';
    }
}