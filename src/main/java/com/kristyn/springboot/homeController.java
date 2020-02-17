package com.kristyn.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar1", "Java is so much fun.");
        model.addAttribute("myvar2", "HTML is the bomb.");
        return "hometemplate";
    }
}
