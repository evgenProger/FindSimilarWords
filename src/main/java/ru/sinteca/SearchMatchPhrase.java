package ru.sinteca;

import java.util.*;

public class SearchMatchPhrase {

    public String createMatches(List<String> stringList1, List<String> stringList2) {
        ReadFile readFile = new ReadFile();
        StringBuilder sb = new StringBuilder();
        readFile.readFile();
        for (String word : stringList1) {
            StringBuilder strB = new StringBuilder();
            for (String wordTwo2 : stringList2) {
                if (checkWords(word, wordTwo2)) {
                    strB.append(word).append(":").append(wordTwo2).append(System.lineSeparator());
                }
            }
            if (strB.isEmpty()) {
                strB.append(word).append(":").append("?").append(System.lineSeparator());
            }
            sb.append(strB);
        }
        return sb.toString();
    }

    private boolean checkWords(String phraseOne, String phraseTwo) {
        int count = 0;
        if (phraseOne.contains(phraseTwo) || phraseTwo.contains(phraseOne)) {
            return true;
        }
        String[] array = phraseOne.split(" ");
        if (array.length == 1) {
            return false;
        }
        for (String str : array) {
            if (phraseTwo.contains(str)) {
                count++;
            }
        }
        return count * 100.0 / array.length > 50;
    }
}
