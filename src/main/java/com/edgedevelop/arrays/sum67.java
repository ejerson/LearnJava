package com.edgedevelop.arrays;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sum67 {

    /**
     * Return the sum of the numbers in the array,
     * except ignore sections of numbers starting with a 6
     * and extending to the next 7 (every 6 will be followed by at least one 7).
     * Return 0 for no numbers.
     *
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 6, 2, 6, 7, 2, 7};

        System.out.println(sum67(nums));


    }

    public static int sum67(int[] nums) {
        int sum = 0;

        boolean isBetweenSixAndSeven = false;
        boolean isSixFound = false;

        // I need to find the index of the current nums[i]
        // if index of curren nums[i] < indexOfSeven, continue;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) {
                isBetweenSixAndSeven = true;
                isSixFound = true;
                continue;
            } else if (nums[i] == 7 && isSixFound) {
              isBetweenSixAndSeven = false;
              isSixFound = false;
              continue;
            } else if (isBetweenSixAndSeven) {
                continue;
            } else {
                sum += nums[i];
            }


        }


        return sum;


    }

}
