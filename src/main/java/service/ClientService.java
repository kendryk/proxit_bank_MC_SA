package service;

import model.Client;
import persistance.ClientDAO;

import javax.persistence.EntityManager;

public class ClientService {

    public static void addClient(EntityManager entityManager, Client client){
        ClientDAO.save(entityManager, client);

    }
}
