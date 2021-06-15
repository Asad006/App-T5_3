package org.example.Ex45.Base;

import java.io.IOException;
import java.nio.file.Paths;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
    public void read(String fileName) {
        String newPhrases = "";
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNext()) {
                //System.out.println("hello");
                String word = scanner.next();

                if (word.equals("utilize")) {
                    newPhrases += " use";
                } else if (word.equals("\"utilize\"")) {
                    newPhrases += " use";
                } else if (word.equals("Utilize")) {
                    newPhrases += " use";
                } else if (word.equals("UTILIZE")) {
                    newPhrases += " use";
                } else {
                    newPhrases += " " + word;
                }

            }

        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
        System.out.println(newPhrases);
    }

    // Check if
}
