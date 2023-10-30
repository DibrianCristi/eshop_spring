package com.mycompany.spring.shop.dao;

import com.mycompany.spring.shop.entity.Log;
import com.mycompany.spring.shop.entity.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class LogDAOImpl implements LogDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveLog(Log log){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(log);
    }
}
