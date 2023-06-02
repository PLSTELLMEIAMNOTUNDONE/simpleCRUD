package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @GetMapping()
    public String start() {
        return "identities/index";
    }

    @GetMapping("/hello")
    public String welcomePage() {
        return "first/Hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", name);
        return "first/Goodbye";
    }


}
