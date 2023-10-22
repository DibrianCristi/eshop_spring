/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.dao;

import com.mycompany.spring.shop.entity.Angajat;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AngajatDAOImpl implements AngajatDAO{
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<Angajat> getAllAngajat() {

        Session session = sessionFactory.getCurrentSession();
        Query<Angajat> query = session.createQuery("from Angajat", Angajat.class);
        List<Angajat> allAngajat = query.getResultList();

        return allAngajat;
    }
    
    @Override
    public void saveAngajat(Angajat angajat){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(angajat);
    }
    
        @Override
    public Angajat getAngajat(int id) {
        Session session = sessionFactory.getCurrentSession();
        Angajat angajat = session.get(Angajat.class, id);
        return angajat;
    }
        @Override
    public void deleteAngajat(int id){
        Session session = sessionFactory.getCurrentSession();
        Query<Angajat> query = session.createQuery("delete from Angajat where id =:angajatid");
        query.setParameter("angajatid", id);
        query.executeUpdate();
    }
}
