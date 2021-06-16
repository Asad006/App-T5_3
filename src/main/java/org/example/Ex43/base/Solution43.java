package org.example.Ex43.base;

import java.util.Scanner;

public class Solution43 {
    // class that gets the user inputs. userReadInputs
    // class creates folder.
    // class creates Index.html. CreateIndexHtml
    // prompt the website name.

    private static final Scanner scanner = new Scanner(System.in);
    private static String webSiteName;
    private static String authorsName;
    private static boolean isJsFolder;
    private static boolean isCsFolder;

    public static void main(String[] args) {

        userReadInputs(scanner);
        String defaultPath = "./website/"+webSiteName;

        CreateFolders createFolders = new CreateFolders();

        // Create path for the website
        createFolders.createfolder(defaultPath);

        // Create Index HTML
        CreateIndexHtml createIndexHtml = new CreateIndexHtml();
        createIndexHtml.generateHtmalFile(webSiteName,authorsName,defaultPath);

        // Create path for js and css
        if (isJsFolder){
            createFolders.createfolder(defaultPath+"/js");
        }
        if (isCsFolder){
            createFolders.createfolder(defaultPath+"/css");

        }

    }

    private static void userReadInputs(Scanner scanner) {
        String response;

        System.out.println("Site name:");
        webSiteName = scanner.nextLine();

        System.out.println("Author");
        authorsName = scanner.nextLine();

        System.out.println("Do you want a folder for JavaScript?");
        response = scanner.next();

        if (response.equals("y")) {
            isJsFolder = true;
        } else {
            isJsFolder = false;
        }

        System.out.println("Do you want a folder for CSS?");
        response = scanner.next();

        if (response.equals("y")) {
            isCsFolder = true;
        } else {
            isCsFolder = false;
        }

    }


}
