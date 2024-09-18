class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title) {
        this.title = title;
        this.author = "Missing";
        this.price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void BookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price+"\n");
    }
}

public class Books {
    public static void main(String args[]) {
        Book book1 = new Book("Ikigai");
        Book book2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book book3 = new Book("Dream with Your Eyes Open", "Ronnie Screwala", 600);

        System.out.println("Book 1 Details:");
        book1.BookInfo();

        System.out.println("Book 2 Details:");
        book2.BookInfo();

        System.out.println("Book 3 Details:");
        book3.BookInfo();
    }
}
