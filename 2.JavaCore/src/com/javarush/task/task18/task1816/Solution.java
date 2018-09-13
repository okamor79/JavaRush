package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {

        String englishLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] chars = englishLetters.toCharArray();

        String fileName = args[0];
        FileInputStream fis = new FileInputStream(fileName);
        int count = 0;
        while (fis.available() > 0) {
            char ch = (char) fis.read();
            for (int i = 0; i < chars.length; i++) {
                if (ch == chars[i]) {
                    count += 1;
                }
            }
        }
        fis.close();
        System.out.println(count);

    }
}
