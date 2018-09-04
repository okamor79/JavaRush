package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        Map<Integer, Integer> byteMap = new HashMap<>();
        while (fis.available() > 0) {
            int byteValue = fis.read();
            if (!byteMap.containsKey(byteValue)) {
                byteMap.put(byteValue, 1);
            } else {
                byteMap.replace(byteValue, byteMap.get(byteValue).intValue() + 1);
            }
        }
        fis.close();
        int maxVal = Collections.max(byteMap.values());
        for (Map.Entry<Integer, Integer> pair : byteMap.entrySet()) {
            if (pair.getValue() == maxVal) {
                char c = (char) pair.getKey().intValue();
                System.out.printf(c + " ");
            }
        }
    }
}
