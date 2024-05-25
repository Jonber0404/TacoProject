package se.yrgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import se.yrgo.data.TacoRepository;
import se.yrgo.domain.Taco;

import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private TacoRepository tacoRepo;

    @RequestMapping("/home.html")
    public ModelAndView firstPage() {
        Date dateAndTime = new Date();
        return new ModelAndView("welcome", "dateAndTime" , dateAndTime);
    }

    @RequestMapping("/taco.html")
    public ModelAndView tacoPage(@RequestParam("taco") String tacoName) {
        Taco taco = tacoRepo.findByName(tacoName);
        return new ModelAndView("taco", "taco", taco);
    }

}
