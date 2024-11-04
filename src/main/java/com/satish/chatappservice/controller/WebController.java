package com.satish.chatappservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Satish Yadav
 * @purpose :
 */
@Controller
public class WebController {

    @GetMapping("/home")
    public String showHomePage(Model model) {
        // Add attributes to the model if needed
        model.addAttribute("message", "Welcome to the Home Page!");
        return "index"; // This maps to src/main/resources/templates/home.html
    }
}
