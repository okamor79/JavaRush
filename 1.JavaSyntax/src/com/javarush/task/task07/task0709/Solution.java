package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            if (str.length() < minLength) {
                minLength = str.length();
            }
            strings.add(str);
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minLength)
            {
                System.out.println(strings.get(i));
            }
        }

    }
}
