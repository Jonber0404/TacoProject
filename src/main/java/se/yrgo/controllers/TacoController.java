package se.yrgo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import se.yrgo.data.TacoRepository;
import se.yrgo.domain.Taco;

@Controller
@RequestMapping("/website/tacos")
public class TacoController {
    @Autowired
    private TacoRepository data;

    @RequestMapping(value = "/newTaco.html", method = RequestMethod.POST)
    public String createNewTaco(Taco taco) {
        //taco.setSize(100);
        taco.calculateWeight();
        taco.setPercentageLeft(100);
        data.save(taco);
        return "redirect:/website/tacos/list.html";
    }

    @RequestMapping(value = "/newTaco.html", method = RequestMethod.GET)
    public ModelAndView renderNewTacoForm() {
        Taco newTaco = new Taco();
        return new ModelAndView("createTaco", "taco", newTaco);
    }

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView tacos() {
        List<Taco> allTacos = data.findAll();
        return new ModelAndView("allTacos", "tacos",
                allTacos);
    }

    @RequestMapping(value = "/taco/{name}")
    public ModelAndView showTacoByName(@PathVariable("name") String name) {
        Taco taco = data.findByName(name);
        return new ModelAndView("tacoInfo", "taco", taco);
    }
}
