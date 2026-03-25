package com.coffeeshop.collections;

public class NewEx {
    //create two thhread and one -> even
   // 2.no should be sequence
    public static void main(String[] args) {
        OddEvenEx oddEvenEx=new OddEvenEx();
        Thread evenThread=new Thread(oddEvenEx ::printEven,"EvenThread");
        Thread oddThread=new Thread(oddEvenEx :: printOdd, "OddThread");

       evenThread.start();
       oddThread.start();

    }


    }


