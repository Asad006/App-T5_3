package org.example.Ex45.Base;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class SaveResultsInFile {

    public void save(String newWord, String fineName) {

        // open file txt
        try (Formatter output = new Formatter(fineName)) {

            output.format("%s%n", newWord);

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            System.out.println("?");
        }

    }
}
