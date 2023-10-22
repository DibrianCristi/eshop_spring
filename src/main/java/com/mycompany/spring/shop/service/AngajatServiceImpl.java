/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.service;

import com.mycompany.spring.shop.dao.AngajatDAO;
import com.mycompany.spring.shop.entity.Angajat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AngajatServiceImpl implements AngajatService{
    @Autowired
    private AngajatDAO angajatDAO;
    
    @Override
    @Transactional
    public List<Angajat> getAllAngajat(){
        return angajatDAO.getAllAngajat();
    }
    
    @Override
    @Transactional
    public void saveAngajat(Angajat angajat){
        angajatDAO.saveAngajat(angajat);
    }
    
    @Override
    @Transactional
    public Angajat getAngajat(int id){
        return angajatDAO.getAngajat(id);
    }
    @Override
    @Transactional
        public void deleteAngajat(int id){
       angajatDAO.deleteAngajat(id);
}
}
