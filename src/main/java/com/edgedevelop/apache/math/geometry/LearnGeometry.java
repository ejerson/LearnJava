package com.edgedevelop.apache.math.geometry;

import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;

public class LearnGeometry {


    // I don't know what to use IntervalSet fo
    public static void main(String[] args) {
        IntervalsSet intSet = new IntervalsSet(3);

        if (intSet.asList().iterator().hasNext()) {
            System.out.println(intSet.asList());
        }
        System.out.println(intSet.asList().iterator().hasNext());
    }
}
