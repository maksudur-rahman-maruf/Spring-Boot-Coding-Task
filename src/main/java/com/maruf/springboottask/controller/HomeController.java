package com.maruf.springboottask.controller;

import com.maruf.springboottask.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/home")
    public String home(Model model)
    {
        model.addAttribute("contactLists", contactRepository.findAll());
        return "userhome";
    }

}
