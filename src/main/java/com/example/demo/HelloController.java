package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value="/mo",method = RequestMethod.GET)
    public  String sel(Model model){
            model.addAttribute("hello1","hello2");
        return "hello";
    }
}
