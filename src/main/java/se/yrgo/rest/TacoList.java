package se.yrgo.rest;

import java.util.List;
import se.yrgo.domain.Taco;

public class TacoList {
    private List<Taco>tacos;

    public TacoList() {}

    public TacoList(List<Taco> tacos) {
        this.tacos=tacos;
    }

    public List<Taco> getTacos() {
        return tacos;
    }

    public void setTacos(List<Taco> tacos) {
        this.tacos = tacos;
    }
}