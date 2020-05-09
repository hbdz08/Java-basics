package com.lau.javabasics.java.basics.arithmetic;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("["+i+","+j+"]");
                }

            }
            
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] s = {3,5,7,3,1};
        TwoSum t = new TwoSum();
        t.twoSum(s, 10);
    }
}
