package test;

import main.Driver;
import models.Book;
import models.Inventory;
import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void addBook() {
        Inventory testInventory = new Inventory();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("1\n10001\nTest Book\n10.00".getBytes());
        System.setIn(byteArrayInputStream);

        String expected = "1,10001,Test Book,10.00";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        Driver.main(null);
        String[] lines = byteArrayOutputStream.toString().split(System.lineSeparator());
        String actual = lines[lines.length-1];


        assertEquals(expected, actual);
    }

    @Test
    void findBook() {
    }

    @Test
    void removeBook() {
    }

    @Test
    void displayAllBooks() {
    }
}