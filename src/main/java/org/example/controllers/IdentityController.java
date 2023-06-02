package org.example.controllers;

import org.example.dao.DataBase;
import org.example.models.Car;
import org.example.models.Human;
import org.example.models.Identity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/identities")
public class IdentityController {
    @Autowired
    private DataBase dataBase;

    public IdentityController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("identities", dataBase.index());
        return "identities/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("identity", dataBase.show(id));
        return "identities/show";
    }

    @GetMapping("/showInfo/{id}")
    public String showHuman(@PathVariable("id") int id, Model model) {
        Identity identity = dataBase.show(id);


        if (identity.getClass().equals(Human.class)) {
            model.addAttribute("Human", identity);
            return "identities/showHuman";
        }

        if (identity.getClass().equals(Car.class)) {
            model.addAttribute("Car", identity);
            return "identities/showCar";
        } else {
            model.addAttribute("identity", identity);
            return "identities/show";
        }
    }

    @GetMapping("/newHuman")
    public String newHuman(Model model) {
        model.addAttribute("Human", new Human());
        return "identities/newHuman";
    }


    @PostMapping()
    public String create(@ModelAttribute("Human") Human human) {
        dataBase.addId(human);
        return "redirect:/identities";
    }


}
