import java.util.Scanner;
class opedouble{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double f=a + b *c;
		double s=a * b + c;
		double t=c + a / b;
		double n=a % b + c; 
        System.out.println("The results of Int Operatin is "+ f +" or "+ s + " or " +t +" and " +n);
	}
}