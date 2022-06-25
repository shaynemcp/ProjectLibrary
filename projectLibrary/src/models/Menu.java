package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static Book book;

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
