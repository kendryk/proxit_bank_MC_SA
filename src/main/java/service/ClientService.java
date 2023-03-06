package service;

import model.Client;
import model.CompteCourant;
import persistance.ClientDAO;

import javax.persistence.EntityManager;

public class ClientService {

    public static void addClient(EntityManager entityManager, Client client){
        ClientDAO.save(entityManager, client);
    }
    public static Client findClient(EntityManager entityManager,Long id){
        return ClientDAO.find(entityManager, id);
    }
    public static void updateClient(EntityManager entityManager, Client client){
        ClientDAO.save(entityManager, client);
    }
    public static void deleteClient(EntityManager entityManager, Client client){
        ClientDAO.delete(entityManager, client);
    }
    public static void addCompte(EntityManager entityManager, Client client, CompteCourant compteCourant){
        client.getComptes().add(compteCourant);
        compteCourant.setProprietaire(client);

    }


}
