package se.yrgo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.data.TacoRepository;
import se.yrgo.domain.Taco;

@RestController
public class TacoRestController {

    @Autowired
    private TacoRepository data;

    @RequestMapping("/tacos")
    public TacoList allTacos() {
        List<Taco> all = data.findAll();
        return new TacoList(all);
    }

    @RequestMapping(value = "/tacos", method = RequestMethod.POST)
    public ResponseEntity createANewTaco(@RequestBody Taco taco) {
        data.save(taco);
        return new ResponseEntity<Taco>(taco, HttpStatus.CREATED);
    }

    @GetMapping("/tacos/{name}")
    public Taco getTacoByName(@PathVariable String name) {
        return data.findByName(name);
    }


    @PostMapping("/tacos/eat")
    public ResponseEntity<Taco> eatTaco(@RequestParam Long id, @RequestParam int percent) {
        Taco taco = data.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid taco Id:" + id));
        taco.eat(percent);
        data.save(taco);
        return new ResponseEntity<>(taco, HttpStatus.OK);
    }

}