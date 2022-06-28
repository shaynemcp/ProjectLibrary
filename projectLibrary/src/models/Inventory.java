package models;

import java.util.*;

public class Inventory {

    public  Inventory() {
    }

    public static List<Book> Books = new ArrayList<>();

    public static Scanner newBook = new Scanner(System.in);
    public static boolean isInteger(String value){
        if(value == null ) {
            return false;
        }
        if(value.length() == 5){
            try {
                int integer = Integer.parseInt(value);
            }
            catch (NumberFormatException exception){
                return false;
            }
        }

        return true;
    }

    public static Scanner newTitle = new Scanner(System.in);

    //TODO: fix Bug where invalid input hangs on exception; also bug where price shows as long instead of double
    public static Book addBook(Book book) {
        try {
            System.out.println("Please enter 5 digit id: ");
            int id = newBook.nextInt();
            if (isInteger(String.valueOf(id)) == true) { //Math.floor(id) == id

                System.out.println("Please enter Book Title: ");
                String title = newTitle.nextLine();

                System.out.println("Please enter Book Price: ");
                double price = newBook.nextFloat();

                System.out.println("Thank you for adding " + title  + " id: " + id + " priced at: $ " + price);
                Book book1 = new Book(id, title, price);
                Inventory.Books.add(book1);

                return book1;
            }
        }
        catch (InputMismatchException exception) {
            System.out.println("Try using an integer instead");
        }

       return null;
    }
    //TODO: fix Bug where last Book in list does not show
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

    //TODO: fix bug where first Book is always removed since id == 0
    public static void removeBook(int id) throws NoSuchElementException{

        try{
            displayAllBooks();
            findBook(id);

            System.out.println("Is this the book you would like to remove? Press 1 for (Y), press any other key for (N) \n" +
                    "(N) will return you to the Main Menu.");
            Scanner delete = new Scanner(System.in);
            int choice = delete.nextInt();
            if(choice == 1){
            newBook.close(); //closing scanner so that method does not infinitely invoke findBook

                Books.remove(Books.indexOf(Books.get(id))); //id: 0 at this point

                displayAllBooks();
                System.out.println("You have successfully removed: " + Books.get(id).getTitle());
            }
        }
        catch (NoSuchElementException exception) {

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
