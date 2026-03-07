class Book {

    int bookId;
    String title;
    double price;

    static String libraryName = "Central Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }

    void displayDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}