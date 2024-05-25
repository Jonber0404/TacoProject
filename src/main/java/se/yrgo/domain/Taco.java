package se.yrgo.domain;

import jakarta.persistence.*;

@Entity
public class Taco {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private float meat;
    private float chicken;
    private float fish;
    private float beans;
    private float cheese;
    private float cucumber;
    private float sauce;
    private float corn;
    private Tortilla tortillaSize;
    private int size;
    private float weight;
    @Column(name = "percentage_left")
    private int percentageLeft = 100;

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

    public float getMeat() {
        return meat;
    }

    public void setMeat(float meat) {
        this.meat = meat;
    }

    public float getChicken() {
        return chicken;
    }

    public void setChicken(float chicken) {
        this.chicken = chicken;
    }

    public float getFish() {
        return fish;
    }

    public void setFish(float fish) {
        this.fish = fish;
    }

    public float getBeans() {
        return beans;
    }

    public void setBeans(float beans) {
        this.beans = beans;
    }

    public float getCheese() {
        return cheese;
    }

    public void setCheese(float cheese) {
        this.cheese = cheese;
    }

    public float getCucumber() {
        return cucumber;
    }

    public void setCucumber(float cucumber) {
        this.cucumber = cucumber;
    }

    public float getSauce() {
        return sauce;
    }

    public void setSauce(float sauce) {
        this.sauce = sauce;
    }

    public float getCorn() {
        return corn;
    }

    public void setCorn(float corn) {
        this.corn = corn;
    }

    public Tortilla getTortillaSize() {
        return tortillaSize;
    }

    public void setTortillaSize(Tortilla tortillaSize) {
        this.tortillaSize = tortillaSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void calculateWeight() {
        this.weight = (meat + fish + chicken + beans + cheese + cucumber + sauce + corn) * (size / 100);
    }

    public int getPercentageLeft() {
        return percentageLeft;
    }

    public void setPercentageLeft(int percentageLeft) {
        this.percentageLeft = percentageLeft;
    }

    @PrePersist
    @PreUpdate
    private void ensurePercentageLeft() {
        if (this.percentageLeft == 0) {
            this.percentageLeft = 100;
        }
    }

    public boolean eat(int percent) {
        if (percentageLeft >= percent) {
            percentageLeft -= percent;
        } else {
            percentageLeft = 0;
        }
        return percentageLeft == 0;
    }
}
