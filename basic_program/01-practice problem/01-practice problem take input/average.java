import java.util.Scanner;
class  average{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter  number of one");
		int l=sc.nextInt();
		System.out.println("enter value of two");
		int w=sc.nextInt();
		System.out.println("enter value of three");
		int e=sc.nextInt();
		double a=(l+w+e)/3;
		System.out.println("average of " + a);
    }
}