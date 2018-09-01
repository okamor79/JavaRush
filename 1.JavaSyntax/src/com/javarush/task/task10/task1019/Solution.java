package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        int id = 0;

        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }
            String name = reader.readLine();
//            if (name.isEmpty())  break;
            map.put(name, Integer.valueOf(id));
        }

        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            String key = String.valueOf(elem.getValue());
            String val = elem.getKey();
            System.out.println(key + " " + val);
        }
    }
}
