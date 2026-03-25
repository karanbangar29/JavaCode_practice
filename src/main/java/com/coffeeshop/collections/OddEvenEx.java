package com.coffeeshop.collections;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenEx {
    int num=0;
    private static final int MAX=20;
    private final Lock lock=new ReentrantLock();
    private final Condition even=lock.newCondition();
    private final  Condition odd= lock.newCondition();


    public  void printOdd() {
        lock.lock();
        try{
            while(num<=MAX){
                while(num %2 ==0){
                    odd.await();

                }
                System.out.println("odd "+num);
                num++;
                even.signal();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }

    }


    public  void printEven() {
       lock.lock();
       try{
           while(num<=MAX){
               while(num %2 !=0){
                   even.await();

               }
               System.out.println("even "+num);
               num++;
               odd.signal();
           }
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }finally {
           lock.unlock();
       }

    }
    public static void main(String[] args) {
        OddEvenEx oddEvenEx=new OddEvenEx();
        Thread evenThread=new Thread(oddEvenEx ::printEven,"EvenThread");
        Thread oddThread=new Thread(oddEvenEx :: printOdd, "OddThread");

        evenThread.start();
        oddThread.start();

    }
}
