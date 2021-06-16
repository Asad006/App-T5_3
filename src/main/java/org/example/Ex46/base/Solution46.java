package org.example.Ex46.base;

import java.util.ArrayList;

public class Solution46 {
    private static ArrayList<String> wordsInFile = new ArrayList<String>();
    private static ArrayList<ArrayList<String>> wordsCount = new ArrayList<ArrayList<String>>();

    public static void main(String[] args) {
        String fileName= "exercise46_input.txt";
        ProcessFile readFile = new ProcessFile();
        wordsInFile = readFile.read(fileName);

        WordFrequency wordFrequency = new WordFrequency();
        wordsCount = wordFrequency.calculateFrequency(wordsInFile);

        DisplayResults displayResults = new DisplayResults();
        displayResults.print(wordsCount);


    }
}
