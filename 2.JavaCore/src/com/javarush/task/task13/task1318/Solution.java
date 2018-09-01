package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try {
            File file = new File(fileName);
            InputStream is = new FileInputStream(file);
            while (is.available()>0) {
                char ch = (char) is.read();
                System.out.print(ch);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}