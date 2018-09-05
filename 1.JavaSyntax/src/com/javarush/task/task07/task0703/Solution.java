package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];
        int[] arrLen = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
            arrLen[i] = arr[i].length();
            System.out.println(arrLen[i]);
        }
    }
}
