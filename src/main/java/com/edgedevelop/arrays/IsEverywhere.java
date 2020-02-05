package com.edgedevelop.arrays;

public class IsEverywhere {

    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 2, 2, 1, 2, 1};
        System.out.println(isEverywhere(nums, 2));

    }

    public static boolean isEverywhere(int[] nums, int val) {

        // return true if val is found in every pair that I search for
        boolean isEverywhere = true;

        if (nums.length <= 1) {
            return true;
        } else {

            for (int i = 0; i < nums.length - 1; i++) {
                System.out.println(isEverywhere);
                if (nums[i] == val && nums[i + 1] != val) {
                    continue;
                } else if (nums[i] != val && nums[i + 1] == val) {
                    continue;
                } else if (nums[i] == val && nums[i + 1] == val) {
                    continue;
                } else {
                    isEverywhere = false;
                }

            }

        }



        // CASE 1: if val is equal to the first index but not equal in second index
        // CASE 2: if val is not equal in the first index but is equal in second index
        // CASE 3: val is not equal in either

        return isEverywhere;


    }
}
