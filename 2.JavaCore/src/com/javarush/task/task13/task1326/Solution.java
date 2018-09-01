package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNme = reader.readLine();

        ArrayList<Integer> intArray = new ArrayList<>();

        try {
            InputStream is = new FileInputStream(fileNme);
            String tmpStr = "";
            while (is.available() > 0) {
                char elem = (char) is.read();
                if (elem != '\n') {
                    tmpStr += elem;
                } else {
                    if (Integer.parseInt(tmpStr) % 2 == 0)
                        intArray.add(Integer.parseInt(tmpStr));
                    tmpStr = "";
                }
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

        Collections.sort(intArray);
        intArray.forEach(System.out::println);


    }
}
