package Inheritance;

class Car{
    String  colour;
    String brand;
    int seat;
    int price;
    void printDetail(){
        System.out.println("Colour " + colour);
        System.out.println("Brand " + brand);
        System.out.println("Seat " + seat);
        System.out.println("Price " + price);
    }
}
class Defender extends Car{
    boolean offRoading;
    void printDetail(){
        System.out.println("offRoading " + offRoading);
    }
}
public class Main{
    public static void main(String[] args){
        Defender obj=new Defender();
        obj.colour="Whitee";
        obj.brand="Land rover";
        obj.seat=5;
        obj.price=1200000;
        obj.printDetail();
    }
}