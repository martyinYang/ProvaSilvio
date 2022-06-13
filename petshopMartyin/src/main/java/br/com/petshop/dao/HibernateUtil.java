/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.entidade.Gato;
import br.com.petshop.entidade.Animal;
import br.com.petshop.entidade.Cachorro;
import br.com.petshop.entidade.Comportamento;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory; 

    static {
        try {
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Animal.class);
            cfg.addAnnotatedClass(Gato.class);
            cfg.addAnnotatedClass(Cachorro.class);
            cfg.addAnnotatedClass(Comportamento.class);

            cfg.configure("/META-INF/hibernate.cfg.xml");
            StandardServiceRegistryBuilder build = new StandardServiceRegistryBuilder().
                    applySettings(cfg.getProperties());
            sessionFactory = cfg.buildSessionFactory(build.build());
        } catch (HibernateException ex) {
            System.err.println("Erro ao criar Hibernate util." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session abrirConexao() {
        return sessionFactory.openSession();
    }
}
