package com.edgedevelop.algorithm;

public class MergeSort {

    public static void main(String[] args) {
        int[] numsToBeSorted = {1, 2, 3};

       int[] mergeSortResult = mergeSort(numsToBeSorted);

        for (int num: mergeSortResult) {
            System.out.println(num);
        }
    }


    public static int[] mergeSort(int[] nums) {
        int[] sortedNums = nums;

        // 1. find the middleIndex
        int middleIndex = (int) Math.floor(nums.length / 2);
        // 2. split the array



        return sortedNums;
    }
}
