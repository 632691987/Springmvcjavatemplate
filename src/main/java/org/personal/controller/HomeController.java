package org.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(ModelMap model){
        model.addAttribute("message", "This is Java configuration case sample");
        return "index";
    }

}
