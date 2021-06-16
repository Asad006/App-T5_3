package org.example.Ex45.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProcessFileTest {

    @Test
    void Is_read_process_file_correctly() {
        ArrayList<String> expectedWordToList = new ArrayList<String>();
        expectedWordToList.add("Hello");
        expectedWordToList.add("world");
        expectedWordToList.add("utilize");
        expectedWordToList.add("UCF");
        expectedWordToList.add("knights");
        expectedWordToList.add("UTILIZE.");
        ArrayList<String> wordsToList = new ArrayList<String>();
        
        ProcessFile processFile = new ProcessFile();
        wordsToList= processFile.read("ex45_testFile_1.txt");

        for (int i = 0; i < wordsToList.size(); i++) {
            assertEquals(wordsToList.get(i),expectedWordToList.get(i));
        }
    }
}