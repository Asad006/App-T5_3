package org.example.Ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Asad merouani
 */

import java.util.ArrayList;
import java.util.List;

public class Solution42 {

    public static ArrayList<ArrayList<String>> dataList = new ArrayList<>();

    public static void main(String[] args) {

        ProcessCsvFile processFile = new ProcessCsvFile();
        dataList = processFile.processCsv("ex42CsvFile.csv");

        PrintResults printResults = new PrintResults();
        printResults.print(dataList);

    }
}
