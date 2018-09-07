package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int minLength = Integer.MAX_VALUE;
        int maxLength = 0;
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String str = reader.readLine();
            int strLength = str.length();
            if (maxLength < strLength) {
                maxLength = strLength;
            } else if (minLength > strLength) {
                minLength = strLength;
            }
            list.add(str);
        }
        for (String str : list) {
            if (str.length() == minLength) {
                System.out.println(str);
                break;
            } else if (str.length() == maxLength){
                System.out.println(str);
                break;
            }
        }
    }
}
