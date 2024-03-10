package com.base.leetco;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        new Test().nums();
        new Test().calcNums();

    }
    public int[] nums(){
        int nums[]= {1,2,3,4};
        int count=0;
        for (int i = 0; i <nums.length; i++) {
            count+=nums[i];
            nums[i]=count;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    public int[] calcNums(){
        int nums[]= {1,2,3,4};
        for (int i = 1; i <nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];

        }
        System.out.println("calcNums    "+Arrays.toString(nums));
        return nums;
    }
}
