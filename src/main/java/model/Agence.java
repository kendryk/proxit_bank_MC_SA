package model;

import java.util.ArrayList;

public class Agence {

    private String numero;
    private ArrayList<Client> clients;
    private ArrayList<Compte> comptes;

    public Agence(String numero) {
        this.numero = numero;
        this.clients = new ArrayList<>();
        this.comptes = new ArrayList<>();
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(ArrayList<Compte> comptes) {
        this.comptes = comptes;
    }

    public void listeClients() {
        clients.forEach((c) -> {
            System.out.println(c.toString());
        });
    }

    public void listeComptes() {
        comptes.forEach((c) -> {
            System.out.println(c.toString());
        });
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}