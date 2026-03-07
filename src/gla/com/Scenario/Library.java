public class LibraryApp {

    public static void main(String[] args) {

        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(102, "Tech Monthly", 150);

        b1.displayDetails();
        System.out.println("Fine for 4 days late: ₹" + b1.calculateFine(4));

        System.out.println(" ");

        b2.displayDetails();
        System.out.println("Fine for 4 days late: ₹" + b2.calculateFine(4));
    }
}