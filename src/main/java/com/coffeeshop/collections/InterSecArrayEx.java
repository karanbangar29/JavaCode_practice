package com.coffeeshop.collections;

import java.util.*;

public class InterSecArrayEx {
//    {1,1,2,2,3,4,4,4,4,4,}
//    {1,2,2,2,4,4}
//
//    1,2,2,4,4

     public static  int[]   intersec(int[] a, int[] b){
         Map<Integer,Integer> map=new HashMap<>();

         for(int num : b){
             map.put(num,map.getOrDefault(num,0)+1);

         }
         List<Integer>output=new ArrayList<>();
         for (int num : a){
             if(map.getOrDefault(num,0)>0){
                 output.add(num);
                 map.put(num,map.get(num)-1);
             }


         }
         return output.stream()
                 .mapToInt(Integer :: intValue).toArray();
     }
    public static void main(String[] args) {
        //int array

        int[] a={1,1,2,2,3,4,4,4,4,4,};
        int [] b={1,2,2,2,4,4};

        System.out.println(Arrays.toString(intersec(a,b)));


    }
}
