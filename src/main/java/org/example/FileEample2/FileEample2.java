package org.example.FileEample2;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileEample2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // open file txt
        try (Formatter output = new Formatter("client.txt")) {
            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.", "Enter end-of-file indicator to end");
            while (scanner.hasNext()) {
                try {
                    // output new record to file; assumes valid input
                    output.format("%d %s %s %.2f%n",scanner.nextInt(),scanner.next(),scanner.next(),
                            scanner.nextDouble());
                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    scanner.nextLine();
                }
            }

        } catch (SecurityException | FileNotFoundException| FormatterClosedException e) {
            System.out.println("?");
        }
    }
}
