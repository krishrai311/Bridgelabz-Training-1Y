import java.util.Scanner;
class  volumeofcylinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter  number of r");
		int r=sc.nextInt();
		System.out.println("enter value of h");
		int h=sc.nextInt();
		double pi=Math.PI;
		double volume=pi*r*r*h;
		System.out.println("volume of cylinder=" + volume);
    }
}