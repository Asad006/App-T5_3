package org.example.Ex46.base;

import java.util.ArrayList;

public class WordFrequency {
    private static ArrayList<ArrayList<String>> wordsCount = new ArrayList<ArrayList<String>>();


    public ArrayList<ArrayList<String>> calculateFrequency(ArrayList<String> wordsInFile) {

        for (int i = 0; i < wordsInFile.size(); i++) {
            if (!isWordCounted(wordsInFile, i, wordsInFile.get(i))) {
                wordsCount.add(getFrequency(wordsInFile.get(i), wordsInFile));
            }
        }

        return wordsCount;
    }

    private ArrayList<String> getFrequency(String currentWord, ArrayList<String> wordsInFile) {
        ArrayList<String> wordsAndCount = new ArrayList<String>();
        int count = 0;
        for (int j = 0; j < wordsInFile.size(); j++) {
            if (currentWord.equals(wordsInFile.get(j))) {
                count++;
            }

        }

        wordsAndCount.add(currentWord);
        wordsAndCount.add("" + count);
        return wordsAndCount;
    }

    public boolean isWordCounted(ArrayList<String> wordsInFile, int index, String currentWord) {
        boolean isCounted = false;
        for (int i = 0; i < index; i++) {
            if (wordsInFile.get(i).equals(currentWord)) {
                isCounted = true;
            }
        }
        return isCounted;
    }
}
