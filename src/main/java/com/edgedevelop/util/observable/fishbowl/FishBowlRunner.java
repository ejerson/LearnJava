package com.edgedevelop.util.observable.fishbowl;

import com.edgedevelop.util.observable.fishbowl.observers.FishFeeder;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that will control the interaction between TropicalFish
 * and FishFeeder
 */
public class FishBowlRunner {

    public static void main(String[] args) {
        List<TropicalFish> tropicalFishList = new ArrayList<TropicalFish>();

        tropicalFishList.add(new TropicalFish("Nemo"));
        tropicalFishList.add(new TropicalFish("Dori"));
        tropicalFishList.add(new TropicalFish("Marlin"));

        // Create an instance of the observable class
        FishFeeder fishFeeder = new FishFeeder();

        // Add the individual fish as observers
        // The addition of fish to the Observable class is made possible
        // because only objects that implements the observer interface
        // are okay to be added to an observer
        for (TropicalFish fish: tropicalFishList) {
            fishFeeder.addObserver(fish);
        }

        System.out.println("We are feeding the fish...");
        fishFeeder.feedTheFish();

    }

}
