package com.edgedevelop.arrays;

public class HaveThree {

    public static void main(String[] args) {

        int[] nums = {3, 1, 3, 3};
        System.out.println(haveThree(nums));
    }

    public static boolean haveThree(int[] nums) {

        int threeCount = 0;

        for (int i = 0; i < nums.length; i++) {
            // increment threeCount if
                // 1. found a three and the next or previous is not a three
            if (i == 0) {

                if (nums[i] == 3 && nums[i + 1] != 3) {
                    threeCount++;
                } else {
                    continue;
                }

            } else if (i == nums.length - 1) {

                if (nums[i - 1] != 3 && nums[i] == 3) {
                    threeCount++;
                } else {
                    continue;
                }

            } else {

                if (nums[i - 1] != 3 && nums[i] == 3 && nums[i + 1] != 3) {
                    threeCount++;
                } else {
                    continue;
                }

            }



        }

        return threeCount == 3;


    }
}
