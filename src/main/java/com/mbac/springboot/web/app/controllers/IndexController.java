package com.mbac.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/","/home"})
    public String home(Model model){
        model.addAttribute("title", "Cardano Tracker");
        model.addAttribute("news", "Latest news");
        model.addAttribute("price", "Price data");
        model.addAttribute("staking","Staking calculator");
        return "home";
    }

}