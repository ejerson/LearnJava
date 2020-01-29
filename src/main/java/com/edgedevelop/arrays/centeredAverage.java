package com.edgedevelop.arrays;

import sun.applet.Main;

public class centeredAverage {

    public static void main(String[] args) {




        int[] nums = {1, 1, 100};

        // include in average if it is not the smallest or the largest value
        int minCopyCounter = 0;
        int maxCopyCounter = 0;

        // Save min
        int minVal = 0;
        // Save max
        int maxVal = 0;

        // save sum
        int sum = 0;

        // find average

        // find min and find max
        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                minVal = Math.min(nums[i], nums[i+1]);
                maxVal = Math.max(nums[i], nums[i+1]);

            } else {
                minVal = Math.min(minVal, nums[i]);
                maxVal = Math.max(maxVal, nums[i]);
            }



            if ((nums[i] == minVal)) {
                minCopyCounter++;
            } else if (nums[i] == maxVal) {
                maxCopyCounter++;
            }
        }

        System.out.println(minVal);
        System.out.println(maxVal);

        for (int i = 0; i < nums.length; i++) {

            // if minCopyCounter is greater than one and current index is equal to minVal
            if (minCopyCounter > 0 && nums[i] == minVal) {
                // skip i and reduce counter count
                minCopyCounter--;
                continue;

            } else if (maxCopyCounter > 0 && nums[i] == maxVal) {
                maxCopyCounter--;
                continue;
            } else {

                if (minVal <= nums[i] && maxVal >= nums[i]) {
                    sum += nums[i];

                }

            }
        }

        // if counter is greater than 1, skip
        // reduce copy count

        // How do I make sure that only one copy of given number is added to the sum?

        System.out.println(sum / (nums.length - 2));

    }
}
