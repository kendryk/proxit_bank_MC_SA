package persistance;

import model.Client;
import model.CompteCourant;

import javax.persistence.EntityManager;

public interface CompteCourantDAO {
    static void save(EntityManager entityManager, CompteCourant compteCourant){
        entityManager.persist(compteCourant);
    }
    static CompteCourant find(EntityManager entityManager, Long id ){
        return entityManager.find(CompteCourant.class,id);
    }
    static void delete(EntityManager entityManager, CompteCourant compteCourant){
        entityManager.remove(compteCourant);
    }
}
