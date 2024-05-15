package se.yrgo.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import se.yrgo.data.VehicleRepository;
import se.yrgo.domain.Vehicle;

@RestController
public class VehicleRestController {

    @Autowired
    private VehicleRepository data;

    @RequestMapping("/vehicles")
    public VehicleList allVehicles() {
        List<Vehicle>all = data.findAll();
        return new VehicleList(all);
    }

    @RequestMapping(value= "/vehicles", method=RequestMethod.POST)
    public ResponseEntity createANewVehicle(@RequestBody Vehicle
                                                    vehicle) {
        data.save(vehicle);
        return new ResponseEntity<Vehicle>(vehicle,HttpStatus.CREATED);
    }
}