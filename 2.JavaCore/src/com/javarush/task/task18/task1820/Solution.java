package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileWriter fos = new FileWriter(reader.readLine());
        reader.close();
        String number = "";
        while (fis.available() > 0) {
            char ch =(char) fis.read();
            if (ch != ' ') {
                number = number + ch;
            } else {
                fos.write(Integer.toString((int) Math.round(Double.parseDouble(number))));
                number = "";
                fos.write(ch);
            }
        }

        fis.close();
        fos.close();

    }
}
