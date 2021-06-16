package org.example.Ex45.Base;

import java.util.ArrayList;

public class WordReplaceInText {

    String newPhrases = "";


    public String replace(ArrayList<String> words) {


        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("utilize")) {
                newPhrases += " use";
            } else if (words.get(i).equals("\"utilize\"")) {
                newPhrases += " use";
            } else if (words.get(i).equals("Utilize")) {
                newPhrases += " use";
            } else if (words.get(i).equals("UTILIZE")) {
                newPhrases += " use";
            } else {
                if (i==0){
                    newPhrases += words.get(i);
                }else {
                    newPhrases += " " + words.get(i);
                }
            }
        }

        return newPhrases;
    }
}
