package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("one", 5);
        Book book2 = new Book("two", 10);
        Book book3 = new Book("three", 15);
        Book book4 = new Book("Clean code", 20);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Replace 0 and 3");
        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Only books with name \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}
