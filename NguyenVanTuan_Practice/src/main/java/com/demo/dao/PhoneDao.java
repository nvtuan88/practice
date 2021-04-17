package com.demo.dao;

import com.demo.entity.PhoneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PhoneDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertPhone(PhoneEntity phone){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(phone);
        em.getTransaction().commit();
        em.close();
    }

    public List<PhoneEntity> getPhone(){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<PhoneEntity> list = em.createQuery("select s from PhoneEntity s", PhoneEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }


}
