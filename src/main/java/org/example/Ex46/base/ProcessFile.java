package org.example.Ex46.base;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProcessFile {
    private static ArrayList<String> wordsInList = new ArrayList<String>();

    String word;

    public ArrayList<String> read(String fileName) {

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNext()) {

                word = scanner.next();
                wordsInList.add(word);
            }

        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        return wordsInList;
    }



    // Check if
}
