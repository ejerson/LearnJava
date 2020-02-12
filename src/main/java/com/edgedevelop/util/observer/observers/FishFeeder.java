package com.edgedevelop.util.observer.observers;

import java.util.Observable;

/**
 * Allows the FishFeeder to inherit all non private methods from Observable
 */
public class FishFeeder extends Observable {

    public void feedTheFish() {

        // this will ??
        setChanged();
        notifyObservers();

    }


}
