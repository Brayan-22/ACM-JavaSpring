package com.acm;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;


import com.acm.models.JavaBeanPersona;
import com.acm.models.Parqueadero;
import com.acm.models.Producto;
import com.acm.models.Recibo_Producto;
import com.acm.models.Recibos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;


public class App 
{
    private static EntityManager em;
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
    public static void main( String[] args )
    {
        emf = Persistence.createEntityManagerFactory("Persistencia");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        JavaBeanPersona persona = new JavaBeanPersona(1000, "Alejandro", "Riveros", LocalDate.of(2000, Month.APRIL, 2));
        JavaBeanPersona persona2 = new JavaBeanPersona(2000,"Brayan","Rodriguez",LocalDate.of(2000, Month.AUGUST, 2));
        em.persist(persona);
        em.persist(persona2);
        Recibos recibos = new Recibos(1, 200d);
        Recibos recibos2 = new Recibos(2, 20, persona);
        em.persist(recibos);
        recibos.setPersona(persona);
        em.persist(recibos2);
        Parqueadero parqueadero = new Parqueadero(1, 10);
        em.persist(parqueadero);
        persona.setParqueadero(parqueadero);
        em.getTransaction().commit();
        // em.getTransaction().begin();
        // Recibo_Producto recibo_Producto = new Recibo_Producto(new Producto("cafe", 200d, LocalDate.of(2025, 2, 2)),new Recibos(1, 200d));
        // em.persist(recibo_Producto);
        // em.getTransaction().commit();
        App.imprimirPantalla();
    }
    public static void imprimirPantalla(){
        em = emf.createEntityManager();
        JavaBeanPersona persona = em.find(JavaBeanPersona.class, 1);
        System.out.println(persona);
        List<Recibo_Producto> personas = (List<Recibo_Producto>) em.createQuery("FROM Recibo_Producto").getResultList();
        personas.forEach(System.out::println);
    }
}