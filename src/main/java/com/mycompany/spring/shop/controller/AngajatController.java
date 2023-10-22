
package com.mycompany.spring.shop.controller;

import com.mycompany.spring.shop.entity.Angajat;
import com.mycompany.spring.shop.service.AngajatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/angajat")
public class AngajatController {
    @Autowired
    private AngajatService angajatService;

    @GetMapping("/")
    public String showAllAngajat(Model model) {
        List<Angajat> allAngajat = angajatService.getAllAngajat();
        model.addAttribute("allAng", allAngajat);
        return "angajat";
    }
    @GetMapping("/addNewAngajat")
    public String addNewAngajat(Model model) {
        Angajat angajat = new Angajat();
        model.addAttribute("angajat", angajat);

        return "angajat-info";
    }
    @PostMapping("/saveAngajat")
    public String saveAngajat(@ModelAttribute("angajat") Angajat angajat) {

        angajatService.saveAngajat(angajat);

        return "redirect:/angajat/";
    }
        @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("angId") int id, Model model) {
        Angajat angajat = angajatService.getAngajat(id);
        model.addAttribute("angajat", angajat);
        return "angajat-info";
    }
 
        @RequestMapping("/deleteAngajat")
    public String deleteEmployee(@RequestParam("angId") int id) {
        angajatService.deleteAngajat(id);
        return "redirect:/angajat/";
    }
    
}
