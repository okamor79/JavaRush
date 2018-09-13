package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(args[0]);
        Map<Integer, Integer> map = new HashMap<>();
        while (fis.available() > 0) {
            int ch = fis.read();
            System.out.println(ch);
        }

        fis.close();
    }
}
