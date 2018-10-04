public class Book1 {
    public static void main(String[] args) {
        Book book = new Book();

        System.out.print(book.toString());

        Book book1 = new Book("Bilbo Baggins", 69.00, "1234567890", 420);

        System.out.print(book1.toString());
    }
}
