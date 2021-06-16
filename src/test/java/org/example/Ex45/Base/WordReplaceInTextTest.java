package org.example.Ex45.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordReplaceInTextTest {

    @Test
    void is_replace_does_the_replacement_action() {
        ArrayList<String> wordsInList = new ArrayList<String>();
        wordsInList.add("Hello");
        wordsInList.add("world");
        wordsInList.add("utilize");
        wordsInList.add("UCF");
        wordsInList.add("knights");
        wordsInList.add("UTILIZE");

        String expectedWordsInList = "Hello world use UCF knights use";

        WordReplaceInText wordReplacement = new WordReplaceInText();
        String actualWord = wordReplacement.replace(wordsInList);

        assertEquals(expectedWordsInList, actualWord);
    }
    @Test
    void is_replace_does_the_replacement_action_set_2() {
        ArrayList<String> wordsInList = new ArrayList<String>();
        wordsInList.add("One");
        wordsInList.add("should");
        wordsInList.add("never");
        wordsInList.add("utilize");
        wordsInList.add("the");
        wordsInList.add("word");
        wordsInList.add("utilize");
        wordsInList.add("in");
        wordsInList.add("writing.");


        String expectedWordsInList = "One should never use the word use in writing.";

        WordReplaceInText wordReplacement = new WordReplaceInText();
        String actualWord = wordReplacement.replace(wordsInList);

        assertEquals(expectedWordsInList, actualWord);
    }
}