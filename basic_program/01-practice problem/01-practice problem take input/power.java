import java.util.Scanner;
class  Power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter  number ");
		int b=sc.nextInt();
		double a=Math.pow(b,3);
		System.out.println("power=" + a);
    }
}