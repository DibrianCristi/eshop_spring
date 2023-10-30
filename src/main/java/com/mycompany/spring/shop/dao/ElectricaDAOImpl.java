/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.dao;

import com.mycompany.spring.shop.entity.Electrica;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ElectricaDAOImpl implements ElectricaDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Electrica> getAllElectrica() {

        Session session = sessionFactory.getCurrentSession();
        Query<Electrica> query = session.createQuery("from Electrica", Electrica.class);
        List<Electrica> allElectrica = query.getResultList();

        return allElectrica;
    }

    @Override
    public void saveElectrica(Electrica electrica) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(electrica);
    }

    @Override
    public Electrica getElectrica(int id) {
        Session session = sessionFactory.getCurrentSession();
        Electrica electrica = session.get(Electrica.class, id);
        return electrica;
    }

    @Override
    public void deleteElectrica(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Electrica> query = session.createQuery("delete from El;ectrica where id =:electricaid");
        query.setParameter("electricaid", id);
        query.executeUpdate();
    }
}
