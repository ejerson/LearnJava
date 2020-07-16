package com.edgedevelop.util.observable.event.observer;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class ButtonObserver extends JButton implements Observer {

    String name;

    public ButtonObserver(String name) {
        super();
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getName() + " was just fed.");
    }

    @Override
    public String toString() {
        return "TextFieldModified {" +
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
