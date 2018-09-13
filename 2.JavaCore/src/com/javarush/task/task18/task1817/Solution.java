package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int countAllChars = 0;
        int countSpace = 0;
        countAllChars = fis.available();
        while (fis.available() > 0) {
            int ch = fis.read();
            if (ch == 32) countSpace += 1;
        }
        fis.close();
        System.out.printf("%.2f", (double) countSpace / countAllChars * 100);
    }
}
