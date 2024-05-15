package se.yrgo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import se.yrgo.data.VehicleRepository;
import se.yrgo.domain.Vehicle;

@Controller
@RequestMapping("/website/vehicles")
public class VehicleController {
    @Autowired
    private VehicleRepository data;

    @RequestMapping(value = "/newVehicle.html", method = RequestMethod.POST)
    public String newVehicle(Vehicle vehicle) {
        data.save(vehicle);
        return "redirect:/website/vehicles/list.html";
    }

    @RequestMapping(value = "/newVehicle.html", method = RequestMethod.GET)
    public ModelAndView renderNewVehicleForm() {
        Vehicle newVehicle = new Vehicle();
        return new ModelAndView("newVehicle", "form", newVehicle);
    }

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView vehicles() {
        List<Vehicle> allVehicles = data.findAll();
        return new ModelAndView("allVehicles", "vehicles",
                allVehicles);
    }

    @RequestMapping(value = "/vehicle/{name}")
    public ModelAndView showVehicleByName(@PathVariable("name") String name) {
        Vehicle vehicle = data.findByName(name);
        return new ModelAndView("vehicleInfo", "vehicle", vehicle);
    }
}
