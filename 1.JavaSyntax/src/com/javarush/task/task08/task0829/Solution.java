package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
//        List<String> addresses = new ArrayList<String>();
        Map<String, String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;


            addresses.put(city, family);
        }

        //read home number
        String city = reader.readLine();

        if (!city.isEmpty()) {
            Iterator<Map.Entry<String, String>> iter = addresses.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> elem = iter.next();
                if (elem.getKey().equalsIgnoreCase(city)) {
                    System.out.println(elem.getValue());
                }
            }
        }
    }
}
