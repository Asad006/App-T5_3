package org.example.Ex41.Base;

import java.io.FileNotFoundException;
import java.util.*;

public class SaveInFile {

    public void save(ArrayList<String> dataList, String fineName) {

        // open file txt
        try (Formatter output = new Formatter(fineName)) {
            output.format("Total of %d names%n", dataList.size());
            output.format("---------------------%n");
            for (int i = 0; i < dataList.size(); i++) {
                output.format("%s%n", dataList.get(i));

            }

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            System.out.println("?");
        }

    }
}
