public class WrapperBoxing{
    public static void main(String[] args) {
        int a = 10;    // Manual Boxing.
        Integer obj = Integer.valueOf(a);
        System.out.println("Primitive value: " + a);
        System.out.println("Boxed object: " + obj);
    }
}

