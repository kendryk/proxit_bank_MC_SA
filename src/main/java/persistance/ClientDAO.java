package persistance;

import model.Client;

import javax.persistence.EntityManager;

public interface ClientDAO {

    static void save(EntityManager entityManager, Client client){
        entityManager.persist(client);
    }
    static void delete(EntityManager entityManager, Client client){
        entityManager.remove(client);
    }
    static void find(EntityManager entityManager, Long id ){
        entityManager.find(Client.class,id);
    }
}
