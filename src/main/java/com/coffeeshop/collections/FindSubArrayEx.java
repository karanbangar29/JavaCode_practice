package com.coffeeshop.collections;

public class FindSubArrayEx {
//    Given an integer array nums, find the subarray with the largest sum, and return its sum without using inbuilt functions.
//
//    Example 1:  2829
//    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    Output: 6
//    Explanation: The subarray [4,-1,2,1] has the largest sum 6.

    public static void main(String[] args) {

       int[] nums = {5,4,-1,7,8};
       int sum=nums[0];
       int maxSum=nums[0];

       for (int i=1; i<nums.length; i++){
             if(sum + nums[i]> nums[i]){
                 sum =sum+nums[i];

             }else {
                 sum=nums[i];
             }
             if(sum> maxSum){
                 maxSum=sum;
             }

       }
        System.out.println(maxSum);

    }
}
