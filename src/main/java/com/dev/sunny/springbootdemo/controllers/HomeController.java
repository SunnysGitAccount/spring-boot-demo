package com.dev.sunny.springbootdemo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class HomeController {

    @GetMapping(value = "/hello")
    public String hello(Model model, @RequestParam(name = "greeterName") String name) {
        model.addAttribute("name", name);
        log.info("Model: {}", model);
        return "index";
    }

}
