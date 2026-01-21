import java.util.Scanner;
class operation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int f=a + b *c;
		int s=a * b + c;
		int t=c + a / b;
		int n=a % b + c;
        System.out.println("The results of Int Operatin is "+ f +" or "+ s + " or " +t +" and " +n);
	}
}