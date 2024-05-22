package se.yrgo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Taco {
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
    private String name;


    public Taco() {}

    public String toString() {
        return this.name + " " + this.id;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}