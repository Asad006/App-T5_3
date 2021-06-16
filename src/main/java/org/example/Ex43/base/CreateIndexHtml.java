package org.example.Ex43.base;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class CreateIndexHtml {
    public void generateHtmalFile(String webSiteName, String authorsName, String webpath) {
        // open file txt
        try (Formatter output = new Formatter(webpath+"/index.html")) {

            // create HTML format
            // header
            output.format("%s%n", "<!DOCTYPE html>");
            output.format("%s%n", "<html>");
            output.format("%s%n", "<head>");
            output.format("%s%n", "<title>"+webSiteName+"</title>");
            //<meta name="author" content="John Doe">
            output.format("%s%n", "<meta name=\"author\" content=\""+authorsName+"\">");
            output.format("%s%n", "</head>");
            output.format("%s%n", "<body>\n" +
                    "<p>\n" +
                    "    this is part of the solution 46\n" +
                    "</p>\n" +
                    "<p>\n" +
                    "    <br> /*\n" +
                    "    <br>*  UCF COP3330 Summer 2021 Assignment 3 Solution\n" +
                    "    <br>*  Copyright 2021 Asad merouani\n" +
                    "    <br>*/\n" +
                    "</p>\n" +
                    "</body>");
            output.format("%s%n", "</html>");
            System.out.println("Created "+webpath+"/index.html");

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            System.out.println("?");
        }
    }
}
