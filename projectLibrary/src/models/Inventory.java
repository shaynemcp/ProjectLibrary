package models;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Inventory {

    public  Inventory() {
    }

    public static List<Book> Books = new ArrayList<>();

    public static Scanner newBook = new Scanner(System.in);
    public static Scanner newTitle = new Scanner(System.in);

    //TODO 4: Exception Handling all methods
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

        return book1;
    }
    //TODO 3: write method for findById
//    public static Book findBook(int id){
//
//        return book;
//    }

    //TODO 2: write method for removeById
    public static List<Book> displayAllBooks() {
        List<Book> allBooks = Books;
        allBooks.add(new Book(23232, "Interscope Records",232.2)); //Used as a filler book
        //TODO 1: Get id & price fields to display
        ListIterator<Book> bookListIterator = allBooks.listIterator();
        while (bookListIterator.hasNext()) {
            System.out.println(bookListIterator.next().getTitle());
        }
        return allBooks;
    }


}
