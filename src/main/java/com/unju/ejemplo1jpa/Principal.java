/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.ejemplo1jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
/**
 *
 * @author david
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("UPpersistencia");
        EntityManager manejador=fabrica.createEntityManager();
        
        Personas per=new Personas();
        per.setAyn("Juana");
        per.setEdad(25);
        
        manejador.getTransaction().begin();
        manejador.persist(per);
        manejador.getTransaction().commit();
    }
    
}
