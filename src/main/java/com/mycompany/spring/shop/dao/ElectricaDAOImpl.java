/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.dao;

import com.mycompany.spring.shop.entity.Log;
import com.mycompany.spring.shop.entity.Electrica;
import com.mycompany.spring.shop.service.LogService;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ElectricaDAOImpl implements ElectricaDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    LogService logService;

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
        try {

            Query<Electrica> query = session.createQuery("delete from El;ectrica where id =:electricaid");
            query.setParameter("electricaid", id);
            query.executeUpdate();
        } catch (Exception exc) {
            Date time = new Date();
            Log log = new Log();
            log.setMsg(exc.getMessage());
            log.setDate(time.toString());
            log.setLogLevel("Default level");
            System.out.println(time.toString());
            System.out.println(exc.getMessage());
            System.out.println("The time of the log " + log.getDate());
            System.out.println("The message of the log is " + log.getMsg());
            System.out.println("The level of the log is " + log.getLogLevel());
            logService.saveLog(log);
        }
    }
}
