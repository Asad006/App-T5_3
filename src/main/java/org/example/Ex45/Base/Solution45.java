package org.example.Ex45.Base;

import java.util.Scanner;

public class Solution45 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String newPhrases="";
        System.out.println("Enter the file name.");
        String fileName = scanner.next();

       ReadFile read = new ReadFile();
       read.read("phrases.txt");

    }
}
