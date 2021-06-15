package org.example.Cha15ReadFilesExample;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(Paths.get("client.txt"))){
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
            while (input.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10s%n",input.nextInt(),input.next(),input.next(),input.nextDouble());
            }
        }catch (IOException | NoSuchElementException| IllegalStateException  e){
            e.printStackTrace();
        }

    }
}
