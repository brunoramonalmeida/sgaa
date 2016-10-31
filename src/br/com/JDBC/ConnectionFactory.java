package br.com.JDBC;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    public EntityManager getEM() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoPratica_II_2.0_UsiJPA_PU");

        return factory.createEntityManager();
    }

}
