package models;

import java.util.*;

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
    //TODO 3: Exception handling for indexOutOfBoundsException
    public static Book findBook(int id) throws IndexOutOfBoundsException{
        System.out.print("Please enter 5 digit id: ");
        id = newBook.nextInt();
        int i;

        for(i = 0; i < Books.size()-1; i++) {
            if( Books.get(i).getId() == id) {
                System.out.println("id: " + Books.get(i).getId() + " \"" + Books.get(i).getTitle() + "\" $" + Books.get(i).getPrice());
            }
        }

        return new Book(id, Books.get(i).getTitle(),Books.get(i).getPrice());
    }

    //TODO 2: write method for removeById
    public static void removeBook(int id){
      findBook(id);
      System.out.println("Is this the book you would like to remove?");
      Scanner delete = new Scanner(System.in);
      int choice = delete.nextInt();

      if(choice == 1){
          newBook.close(); //closing scanner so that method does not infinitely invoke findBook
          Books.remove(Books.indexOf(findBook(id)));

      }
    }
    public static List<Book> displayAllBooks() {
        List<Book> allBooks = Books;

        for(int i = 0; i < allBooks.size(); i++) {
            System.out.println("id: " + allBooks.get(i).getId() + " \"" + allBooks.get(i).getTitle() + "\" $" + allBooks.get(i).getPrice());
        }
        return allBooks;
    }


}
