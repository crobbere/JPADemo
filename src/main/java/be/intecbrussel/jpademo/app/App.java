package be.intecbrussel.jpademo.app;


import be.intecbrussel.jpademo.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        Person p = new Person();
        p.setFirstName("Super");
        p.setLastName("Man");
        p.setAge(30);
        p.setAddress("America");
        p.setId(1);

        System.out.println(p);
        EntityManagerFactory emf = null;
        EntityManager entityManager = null;
        try{
            emf = Persistence.createEntityManagerFactory("mypersistenceunit");
            entityManager = emf.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(p);
            transaction.commit();
            System.out.println("person saved");

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            if (entityManager != null){
                entityManager.close();
            }
            if (emf!= null){
                emf.close();
            }
        }


    }

    }

