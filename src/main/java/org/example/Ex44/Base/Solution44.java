package org.example.Ex44.Base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Asad merouani
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution44 {
    private static ArrayList<String> gsonArray = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static String productName;

    public static void main(String[] args) {

        boolean isNameFound = false;
        DataProcess dataProcess = new DataProcess();
        readUserInput();

        while (!isNameFound){
            String response = dataProcess.productNameCheck(productName);
            if (response.equals("not found")){
                isNameFound= false;
                System.out.println("Sorry, that product was not found in our inventory.");
                readUserInput();
            }else{
                System.out.printf(response);
                isNameFound=true;
            }
        }
    }
    private static void readUserInput() {
        System.out.println("What is the product name?");
        productName = scanner.nextLine();
    }



}
