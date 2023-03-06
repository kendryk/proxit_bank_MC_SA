package service;

import model.Client;
import model.CompteCourant;
import persistance.ClientDAO;
import persistance.CompteCourantDAO;

import javax.persistence.EntityManager;

public class CompteCourantService {

    public static void addCompteCourant(EntityManager entityManager, CompteCourant CompteCourant){
        CompteCourantDAO.save(entityManager, CompteCourant);
    }
    public static CompteCourant findCompteCourant(EntityManager entityManager,Long id){
        return CompteCourantDAO.find(entityManager, id);
    }
    public static void updateCompteCourant(EntityManager entityManager, CompteCourant compteCourant){
        CompteCourantDAO.save(entityManager, compteCourant);
    }
    public static void deleteCompteCourant(EntityManager entityManager, CompteCourant compteCourant){
        CompteCourantDAO.delete(entityManager, compteCourant);
    }


}
