package org.example.Chap15Example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileExample {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter the file or directory?");

        //  Create Path object based on user input
        Path path = Paths.get(scanner.nextLine());

        if(Files.exists(path)){
            System.out.printf("%n%s exists %n",path.getFileName());
            System.out.printf("%s a direcory %s");
        }else {
            System.out.println("file does not exist.");
        }
    }
}
