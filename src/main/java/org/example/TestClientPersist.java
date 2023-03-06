package org.example;

import model.Client;
import model.CompteCourant;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestClientPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistanceBankProject");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();

        try {
            txn.begin();

            Client newClient = new Client("bidule", "truc","rue", "35", "rennes", "0666778899" );

            CompteCourant comptecourant1 = new CompteCourant(5000.0, newClient, 5000.0, CompteCourant.TypeCarte.ELECTRON );
            em.persist(newClient);
            em.persist(comptecourant1);

            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }


    }
}
