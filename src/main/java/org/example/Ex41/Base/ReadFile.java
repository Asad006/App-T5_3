package org.example.Ex41.Base;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {

    public ArrayList<String> getFileDataInArray(String fileName, ArrayList<String> dataList) {

        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while (scanner.hasNext()){
                String name = scanner.next()+scanner.next();
                dataList.add(name);

            }

        }catch (IOException | NoSuchElementException | IllegalStateException e){
            e.printStackTrace();
        }
        return dataList;
    }
}
