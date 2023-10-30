package com.mycompany.spring.shop.service;

import com.mycompany.spring.shop.dao.LogDAO;
import com.mycompany.spring.shop.entity.Log;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDAO logDAO;

    @Override
    @Transactional
    public void saveLog(Log log) {
        try {
            logDAO.saveLog(log);
        } catch (Exception e) {
            System.out.println("Log DAO " + e.getMessage());
        }

    }
}
