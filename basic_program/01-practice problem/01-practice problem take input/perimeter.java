import java.util.Scanner;
class  perimeterofrectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter  number of l");
		double l=sc.nextDouble();
		System.out.println("enter value of w");
		double w=sc.nextDouble();
		double a=2*(l+w);
		System.out.println("perimeter of rectangle=" + a);
    }
}