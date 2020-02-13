package com.edgedevelop.util.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Observes the observable class
 */
public class TropicalFish implements Observer {

    private String name;

    /*
     * This update method will be called only if
     * I call notifyObservers() method inside the class
     * that implemented the Observable class
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getName() + " was just fed.");
    }

    public TropicalFish(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "TropicalFish{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
