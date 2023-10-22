/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.service;

import com.mycompany.spring.shop.dao.ElectricaDAO;
import com.mycompany.spring.shop.entity.Electrica;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ElectricaServiceImpl implements ElectricaService {

    @Autowired
    private ElectricaDAO electricaDAO;
    @Override
    @Transactional
    public List<Electrica> getAllElectrica() {
        return electricaDAO.getAllElectrica();
    }
    @Override
    @Transactional
    public void saveElectrica(Electrica electrica) {
        electricaDAO.saveElectrica(electrica);
    }
    @Override
    @Transactional
    public Electrica getElectrica(int id) {
        return electricaDAO.getElectrica(id);
    }
    @Override
    @Transactional
    public void deleteElectrica(int id) {
        electricaDAO.deleteElectrica(id);
    }
}
