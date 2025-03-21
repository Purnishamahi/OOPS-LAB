class Book {
    String title;
    String author;
    double price;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class ConstructorExample2 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 29.99);
        Book book2 = new Book(book1);
        System.out.println("Original Book:");
        book1.display();
        System.out.println("\nCopied Book:");
        book2.display();
    }
}
