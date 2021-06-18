package org.example.Ex41.Base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Asad merouani
 */

import java.util.ArrayList;


public class Solution41 {
    private static ArrayList<String> dataList = new ArrayList<String>();

    public static void main(String[] args) {


        // read data from the file and place them in the memory in a arrayList.
        ReadFile readFile = new ReadFile();

        dataList = readFile.getFileDataInArray("client.txt", dataList);

        // Sort the Array list
        SortDataList sortlist = new SortDataList();
        dataList = sortlist.sort(dataList);

        // save the sorted data in a file.
        SaveInFile saveInFile = new SaveInFile();
        saveInFile.save(dataList,"names_sorted.txt");


    }

}
