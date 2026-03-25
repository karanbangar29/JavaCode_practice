package com.coffeeshop.collections;

public class SingletonExample {
    private static SingletonExample singletonExample;

    private SingletonExample(){

    }
    public static SingletonExample getInstance(){
        if(singletonExample==null){
            singletonExample=new SingletonExample();

        }
      return   singletonExample;
    }
}
