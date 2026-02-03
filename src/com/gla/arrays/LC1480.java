package com.gla.arrays;

public class LC1480 {

    public int[] runningSum(int[] nums) {   // ❗ method added
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a + nums[i];
            nums[i] = a;
        }
        return nums;
    }

    public static void main(String args[]) {
    }
}
