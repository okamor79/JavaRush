package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            URL url = new URL(str);
            String urlParam = url.getQuery();
            String[] param;
            for (String s : urlParam.split("&")) {
                String[] map = s.split("=");
                System.out.printf(map[0] + " ");
            }
            System.out.println();
            for (String s : urlParam.split("&")) {
                String[] map = s.split("=");
                if (map[0].equals("obj"))
                    try {
                        double val = Double.parseDouble(map[1]);
                        alert(val);
                    } catch (Exception e) {
                        alert(map[1]);
                    }
//                System.out.printf(map[1] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
