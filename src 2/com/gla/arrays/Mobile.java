package com.gla.arrays;

public class Mobile {
    String Company;
    String Model;
    String colour;
    static String C="nexon";

    public static void main(String[] args){
        Mobile m1=new Mobile();
        m1.Company="Apple";
        m1.Model="mm";
        m1.colour="Red";

        Mobile m2=new Mobile();
        m2.colour="Black";
        m2.Company="poco";

        System.out.println(m1.Company);
        System.out.println(m1.Model);
        System.out.println(m1.colour);
        System.out.println(m2.Company);
        System.out.println(m2.colour);
        System.out.println(Mobile.C);
    }

}
