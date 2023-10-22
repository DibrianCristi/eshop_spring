/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.controller;

import com.mycompany.spring.shop.entity.Electrica;
import com.mycompany.spring.shop.service.ElectricaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/electrica")
public class ElectricaController {
    @Autowired
    private ElectricaService electricaService;

    @GetMapping("/")
    public String showAllAngajat(Model model) {
        List<Electrica> allElectrica = electricaService.getAllElectrica();
        model.addAttribute("allPrd", allElectrica);
        return "electrica";
    }
    @GetMapping("/addNewElectrica")
    public String addNewElectrica(Model model) {
        Electrica electrica = new Electrica();
        model.addAttribute("electrica", electrica);

        return "electrica-info";
    }
    @PostMapping("/saveElectrica")
    public String saveElectrica(@ModelAttribute("electrica") Electrica electrica) {

        electricaService.saveElectrica(electrica);

        return "redirect:/electrica/";
    }
        @RequestMapping("/updateInfo")
    public String updateElectrica(@RequestParam("prdId") int id, Model model) {
        Electrica electrica = electricaService.getElectrica(id);
        model.addAttribute("electrica", electrica);
        return "electrica-info";
    }
 
        @RequestMapping("/deleteElectrica")
    public String deleteElectrica(@RequestParam("prdId") int id) {
        electricaService.deleteElectrica(id);
        return "redirect:/electrica/";
    }
}
