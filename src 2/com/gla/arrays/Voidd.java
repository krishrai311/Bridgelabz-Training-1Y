package com.gla.arrays;

public class Voidd {
    String name;
    int age;

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public static void main(String[] args){
        Voidd s1=new Voidd();
        s1.name="Krish";
        s1.age=18;

        String name=s1.getname();
        System.out.println(name);

        int age=s1.getage();
        System.out.println(age);
    }
}




