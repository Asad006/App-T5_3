package org.example.Ex46.base;

import java.util.ArrayList;

public class DisplayResults {

    public void print(ArrayList<ArrayList<String>> wordsCount) {
        ArrayList<String> arrayTemp = new ArrayList<String>();
        for (int i = 0; i < wordsCount.size(); i++) {
            arrayTemp=wordsCount.get(i);
            System.out.printf("%s: ",arrayTemp.get(0));
            for (int j = 0; j < Integer.parseInt(arrayTemp.get(1)); j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
