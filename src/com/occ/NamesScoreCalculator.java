package com.occ;

import java.util.List;

public class NamesScoreCalculator {

    public void calculateScores(List<String> names){
        int currentPosition = 1;
        long wordSumValue = 0l;
        for(String name: names){
            int charSumValue = 0;
            char[] chars = name.toCharArray();
            for(char ch: chars){
                int charValue = ch -64;
                charSumValue += charValue;
            }
            wordSumValue += charSumValue * currentPosition;
            currentPosition++;
//            System.out.println(name);
        }
        System.out.println(wordSumValue);
    }

}
