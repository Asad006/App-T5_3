package org.example.Ex45.Base;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class SaveInFile {

    public void save(String newPhrases, String fineName) {

        // open file txt
        try (Formatter output = new Formatter(fineName)) {
            output.format("%s%n", newPhrases);

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            System.out.println("?");
        }

    }
}
