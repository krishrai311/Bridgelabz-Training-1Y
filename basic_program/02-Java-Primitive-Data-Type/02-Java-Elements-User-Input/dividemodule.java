import java.util.Scanner;
class dividemodule{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  a=sc.nextDouble();
		double b=sc.nextDouble();
		double divide=a/b;
		double module=a%b;
        System.out.println("The Quotient is " + divide +" and Reminder is " + module);
	}
}