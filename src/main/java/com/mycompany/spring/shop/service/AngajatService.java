/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.spring.shop.service;

import com.mycompany.spring.shop.entity.Angajat;
import java.util.List;

/**
 *
 * @author LG Dibrian
 */
public interface AngajatService {
        public List<Angajat> getAllAngajat();
    public void saveAngajat(Angajat angajat);
    public Angajat getAngajat(int id);
    public void deleteAngajat(int id);
}
