import java.util.Scanner;
class  simpleinterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter  number of p");
		double p=sc.nextDouble();
		System.out.println("enter value of r");
		double r=sc.nextDouble();
		System.out.println("enter value of t");
		double t=sc.nextDouble();
		double a=(p*r*t)/100;
		System.out.println("simple interest=" + a);
    }
}