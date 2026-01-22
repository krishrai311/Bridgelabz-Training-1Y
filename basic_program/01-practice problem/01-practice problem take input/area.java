import java.util.Scanner;
class  area{
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter  number");
		double pi=Math.PI;
		int c=sc.nextInt();
		double area=pi*c*c;
		System.out.println("Area of circle=" + area);
    }
}