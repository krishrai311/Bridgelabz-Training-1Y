import java.util.Scanner;
class  CelsiustoFahrenheitConversion{
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter  number");
		int c=sc.nextInt();
		double a=c*9.0/5.0+32.0;
		System.out.println("Celsius to Fahrenheit Conversion=" + a);
    }
}