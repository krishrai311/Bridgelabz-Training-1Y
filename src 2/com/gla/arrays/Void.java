package com.gla.arrays;

public class Void {
    String name;
    int age;

    void printage(){
        System.out.println(age);
    }

    void printname(){
        System.out.println(name);
    }

    public static void main(String[] args){
        Void s1=new Void();
        s1.name="Krish";
        s1.age=18;

        s1.printage();
        s1.printname();
    }
}
