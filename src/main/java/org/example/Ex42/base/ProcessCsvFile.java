package org.example.Ex42.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProcessCsvFile {
    private ArrayList<ArrayList<String>> dataList = new ArrayList<>();

    private static final String COMMA = ",";


    public ArrayList<ArrayList<String>> processCsv(String fileName) {

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                dataList.add(getDataFromRow(scanner.nextLine()));
            }
        } catch (IOException e) {
            System.out.println("file reading anomaly.");
        }

        return dataList;
    }


    public ArrayList<String> getDataFromRow(String nextLine) {
        ArrayList<String> rowDataList = new ArrayList<String>();

        //int index=;
        try (Scanner scanner = new Scanner(nextLine)) {
            scanner.useDelimiter(COMMA);
            while (scanner.hasNext()) {
                rowDataList.add(scanner.next());
            }

        }

        return rowDataList;


    }


}
