package com.exemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel", 1);
        Aluno aluno2 = new Aluno("Joao", 1);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(aluno1);
        em.persist(aluno2);

        em.getTransaction().commit();
        em.close();
    }
}