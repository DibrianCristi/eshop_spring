/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.spring.shop.service;

import com.mycompany.spring.shop.entity.Electrica;
import java.util.List;

/**
 *
 * @author LG Dibrian
 */
public interface ElectricaService {
        public List<Electrica> getAllElectrica();
    public void saveElectrica(Electrica electrica);
    public Electrica getElectrica(int id);
    public void deleteElectrica(int id);
}
