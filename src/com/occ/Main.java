package com.occ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String fileName = args[0];
        List<String> names = new ArrayList<>();
        try {
            Scanner read = new Scanner(new File(fileName));
            read.useDelimiter(",");
            while (read.hasNext()){
                String word = read.next();
                word = word.replace("\n", "");
                names.add(word);
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("please check file path provided in command line argument");
        }
        Collections.sort(names);
        NamesScoreCalculator namesScoreCalculator = new NamesScoreCalculator();
            namesScoreCalculator.calculateScores(names);

    }
}
