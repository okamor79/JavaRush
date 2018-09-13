package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte[] buffer1 = new byte[fis1.available()];
        byte[] buffer2 = new byte[fis2.available()];

        int count1 = 0;
        int count2 = 0;

        while (fis1.available() > 0) {
            count1 = fis1.read(buffer1);
        }
        fis1.close();
        FileOutputStream fos = new FileOutputStream(file1);
        while (fis2.available() > 0) {
            count2 = fis2.read(buffer2);
        }
        fos.write(buffer2,0, count2);
        fos.write(buffer1);
        fos.close();
        fis2.close();
    }
}
