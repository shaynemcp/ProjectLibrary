package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static Book book;

    public static void prompt() {
        System.out.println("Welcome to Project Library. Enter the integer corresponding to the action you would like to take.");
        System.out.print(" Enter 1 to add a book \n Enter 2 to remove a book \n Enter 3 to find a book by id \n Enter 4 to View all books \n");
    }
    public static void ask() {
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        do {
            switch (choice) {
                case 1:
                    Inventory.addBook(book);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 9:
                    break;
            }
        } while (choice > 0);
    }

}
