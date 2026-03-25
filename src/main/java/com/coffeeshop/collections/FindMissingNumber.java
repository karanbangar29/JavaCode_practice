package com.coffeeshop.collections;

public class FindMissingNumber {
    public static void main(String[] args) {
      int[] arr={0,1,2,3,4,6};
        System.out.println(findMissing(arr));
    }

    private static int findMissing(int[] arr) {
        int n=arr.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num:arr){
            actualSum +=num;
        }
        return expectedSum-actualSum;
    }
}
