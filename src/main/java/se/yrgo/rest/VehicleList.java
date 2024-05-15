package se.yrgo.rest;

import java.util.List;
import se.yrgo.domain.Vehicle;

public class VehicleList {
    private List<Vehicle>vehicles;

    public VehicleList() {}

    public VehicleList(List<Vehicle> vehicles) {
        this.vehicles=vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}