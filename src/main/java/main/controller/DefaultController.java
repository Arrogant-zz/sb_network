package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
public class DefaultController {
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
}