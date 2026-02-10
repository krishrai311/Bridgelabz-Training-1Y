package com.gla.method;

public class Studenta {
    String name;
    String course;
    int age;
    static String collage="GLA";


    public static void main(){
        Studenta s1=new Studenta();
        s1.name="krish";
        s1.course="b tech";
        s1.age=15;

        System.out.println(s1.name);
        System.out.println(s1.course);
        System.out.println(Studenta.collage);


    }
}
