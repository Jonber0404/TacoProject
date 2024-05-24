package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/home.html")
    public ModelAndView firstPage() {
        Date dateAndTime = new Date();
        return new ModelAndView("welcome", "dateAndTime" , dateAndTime);
    }

    @RequestMapping("/taco.html")
    public ModelAndView tacoPage(@RequestParam("taco") String taco) {
        return new ModelAndView("taco", "tacoName", taco);
    }

}
