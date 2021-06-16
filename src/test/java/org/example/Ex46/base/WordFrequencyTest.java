package org.example.Ex46.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void is_calculateFrequency_returns_correct_values() {
        ArrayList<ArrayList<String>> actual = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> expected = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> wordsInFile = new ArrayList<String>();
        wordsInFile.add("badger");
        wordsInFile.add("badger");
        wordsInFile.add("badger");
        wordsInFile.add("badger");
        wordsInFile.add("mushroom");
        wordsInFile.add("mushroom");
        wordsInFile.add("snake");
        wordsInFile.add("badger");
        wordsInFile.add("badger");
        wordsInFile.add("badger");
        WordFrequency wordFrequency = new WordFrequency();
        actual = wordFrequency.calculateFrequency(wordsInFile);
        temp.add("badger");
        temp.add("7");
        expected.add(temp);
        ArrayList<String> temp1 = new ArrayList<>();
        temp1.add("mushroom");
        temp1.add("2");
        expected.add(temp1);
        ArrayList<String> temp2 = new ArrayList<>();
        temp2.add("snake");
        temp2.add("1");
        expected.add(temp2);
        assertEquals(expected,actual);
    }


}