package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Arrays;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.printf("Enter file name: ");
        String fileName = reader.readLine();
        String str;
        try {
            FileWriter file = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            while (true) {
                str = reader.readLine();
                bufferedWriter.write(str + '\n');
                if (str.equalsIgnoreCase("exit")) break;
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

    }
}
