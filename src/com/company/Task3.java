package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public void task3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String a = in.nextLine();
        String[] wordArray = a.split(" ");
        vowelsNumber(wordArray[0]);
        bigVowel(wordArray);
        vowelsSort(vowelsNumber(wordArray[0]), vowelsNumber(wordArray[wordArray.length-1]), wordArray);
    }

    public static int vowelsNumber(String word) {
        Pattern vowels = Pattern.compile("(?iu)[аеёиоуыэюяє]");
        Matcher m = vowels.matcher(word);
        int vowelsCounter = 0;
        while (m.find()) {
            vowelsCounter++;
        }
        System.out.println("В слове " + word + " " + vowelsCounter + " гласных");
        return vowelsCounter;
    }

    protected void bigVowel(String[] words) {
        for (int i = 0; i < words.length; i++) {
            Pattern vowels = Pattern.compile("(?iu)[аеёиоуыэюяє]");
            Matcher m = vowels.matcher(words[i]);
            m.find();
            if (m.start() == 0) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
            }
            System.out.print(words[i] + " ");
        }
    }

    public static void vowelsSort(int leftBorder, int rightBorder, String[] words) {
        int[] source = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            source[i]=vowelsNumber(words[i]);
        }
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                    String tmp2 = words[leftMarker];
                    words[leftMarker] = words[rightMarker];
                    words[rightMarker] = tmp2;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            vowelsSort(leftMarker, rightBorder, words);
        }
        if (leftBorder < rightMarker) {
            vowelsSort(leftBorder, rightMarker, words);
        }
    }
}


