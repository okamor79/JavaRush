package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String textString = reader.readLine();
        List<Character> arrayVowels = new ArrayList<>();
        List<Character> arrayUnVowels = new ArrayList<>();

        for (int i = 0; i < textString.length(); i++) {
            if (textString.charAt(i) != ' ')
                if (isVowel(textString.charAt(i))) {
                    arrayVowels.add(textString.charAt(i));
                } else {
                    arrayUnVowels.add(textString.charAt(i));
                }
        }

        for (char c : arrayVowels) {
            System.out.printf(c + " ");
        }
        System.out.printf("\n");
        for (char c : arrayUnVowels) {
            System.out.printf(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}