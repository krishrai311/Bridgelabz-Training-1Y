import java.util.Scanner;
class discount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  fee=sc.nextDouble();
		double dis=sc.nextDouble();
		double disamount=fee*dis;
		double finaldis=fee-disamount;
        System.out.println("The discount amount is " + disamount +" and final discounted fee is " + finaldis);
	}
}