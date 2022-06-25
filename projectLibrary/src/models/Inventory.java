package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    public  Inventory() {
    }

    public static List<Book> Books = new ArrayList<>();

    public static Scanner newBook = new Scanner(System.in);
    public static Scanner newTitle = new Scanner(System.in);

    public static Book addBook(Book book) {

        System.out.println("Please enter 5 digit id: ");
        int id = newBook.nextInt();

        System.out.println("Please enter Book Title: ");
        String title = newTitle.nextLine();

        System.out.println("Please enter Book Price: ");
        double price = newBook.nextFloat();

        System.out.println("Thank you for adding " + title  + " id: " + id + " priced at: $ " + price);
        Book book1 = new Book(id, title, price);
        Inventory.Books.add(book1);


        newBook.close();
        newTitle.close();
        return book1;
    }

//    public static Book findBook(int id){
//
//        return book;
//    }
//
//    public static List<Book> displayAllBooks() {
//
//        return;
//    }


}
