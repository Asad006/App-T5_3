package org.example.Ex45.Base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution45 {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> wordsInList = new ArrayList<String>();

    public static void main(String[] args) {
        String fileName;
        String newFileName;
        String newPhrases ;

        System.out.println("Enter the file name.");
        fileName = scanner.next();

        ProcessFile read = new ProcessFile();
        wordsInList = read.read("phrases.txt");

        WordReplaceInText wordReplacement = new WordReplaceInText();
        newPhrases = wordReplacement.replace(wordsInList);

        SaveResultsInFile saveFile = new SaveResultsInFile();

        System.out.println("Enter the new file name.");
        newFileName = scanner.next();
        saveFile.save(newPhrases, newFileName);

        System.out.println(newPhrases);


    }
}
