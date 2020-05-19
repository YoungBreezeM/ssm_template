package com.fw.controller;

import com.fw.dao.TestDao;
import com.fw.domain.User;
import com.fw.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author yqf
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private TestService testService;

    @GetMapping
    public String toHome(){
        return "home";
    }

    @PostMapping
    public ModelAndView addUser(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("user",testService.findAll());

        modelAndView.setViewName("home");

        return modelAndView;
    }
}
