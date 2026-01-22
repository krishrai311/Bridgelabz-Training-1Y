import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ah=sc.next().charAt(0);
        if(ah=='a' || ah=='e' || ah=='i' || ah=='o' || ah=='u')
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("Consonent");
        }
    }
}