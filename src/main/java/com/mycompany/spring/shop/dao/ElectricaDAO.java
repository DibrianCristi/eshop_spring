/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.spring.shop.dao;

import com.mycompany.spring.shop.entity.Electrica;
import java.util.List;

public interface ElectricaDAO {
            public List<Electrica> getAllElectrica();
    public void saveElectrica(Electrica electrica);
    public Electrica getElectrica(int id);
    public void deleteElectrica(int id);
}
