package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        FileInputStream fis2 = new FileInputStream(reader.readLine());
        FileInputStream fis3 = new FileInputStream(reader.readLine());
        try {
            while (fis2.available() > 0) {
                int read = fis2.read();
                fileOutputStream.write(read);
            }
            while (fis3.available() > 0) {
                int read = fis3.read();
                fileOutputStream.write(read);
            }
        } catch (Exception e) {

        }
        fileOutputStream.close();
        fis2.close();
        fis3.close();
    }
}
