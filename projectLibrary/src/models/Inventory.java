package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {


    private ArrayList<Book> inventory = new ArrayList<Book>();

    public static Scanner newBook = new Scanner(System.in);

    public static Book addBook(Book book) {

        System.out.println("Please enter 5 digit id: ");
        int id = newBook.nextInt();

        System.out.println("Please enter Book Title: ");
        String title = newBook.nextLine();

        System.out.println("Please enter Book Price: ");
        float price = newBook.nextFloat();

        System.out.println("Thank you for adding " + title  + "id: " + id + "priced at: $ " + price);
        return new Book(id, title, price);

    }

}
