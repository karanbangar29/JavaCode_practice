package com.coffeeshop.Exception;

public class TryCatchFinallyEx {
    public static void main(String[] args) {

        System.out.println(name("karan"));
    }

    public static String name(String name){
        try{
            name="karan";
            return name;

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("finally block");
        }

     return "null";
    }
}
