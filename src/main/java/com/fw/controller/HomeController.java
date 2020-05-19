package com.fw.controller;

import com.fw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yqf
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String toHome(){
        return "home";
    }

    @PostMapping
    public ModelAndView addUser(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("user",user);

        modelAndView.setViewName("home");

        return modelAndView;
    }
}
