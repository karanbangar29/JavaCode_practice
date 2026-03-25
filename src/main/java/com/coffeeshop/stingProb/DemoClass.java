package com.coffeeshop.stingProb;


class Employee{
private String fName;
private  String lName;
    private Employee(String fName,String lName){
        this.fName=fName;
        this.lName=lName;
    }
}
public class DemoClass {
    private static DemoClass demoClass;
   private DemoClass(){

    }

    public static DemoClass getInstance() {
        if(demoClass ==null){
            demoClass=new DemoClass();
        }
        return demoClass;
    }


}
class SingleTon{
    public static void main(String[] args) {
            DemoClass demoClass1=DemoClass.getInstance();
        }
    }





//{2,5,7,12, 1, 9}  trgt ele = 6