package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        byte maxByte = Byte.MIN_VALUE;
        while (fis.available() > 0) {
            byte byteValue = (byte) fis.read();
            if (byteValue > maxByte) {
                maxByte = byteValue;
            }
        }
        fis.close();
        System.out.println(maxByte);
    }
}
