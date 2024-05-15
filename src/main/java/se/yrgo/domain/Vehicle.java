package se.yrgo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private int odometer;
    private String status;
    private String latlong;
    private String currentDriver;

    public Vehicle() {}

    public String toString() {
        return this.name + " odometer " + this.odometer;
    }

    public String getCurrentDriver() {
        return currentDriver;
    }
    public void setCurrentDriver(String currentDriver) {
        this.currentDriver = currentDriver;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setLatlong(String latlong) {
        this.latlong = latlong;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getLatlong() {
        return latlong;
    }

}