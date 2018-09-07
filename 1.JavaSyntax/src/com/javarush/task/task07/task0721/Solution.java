package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int[] numArray = new int[20];
        //напишите тут ваш код
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(reader.readLine());
            if (numArray[i] > maximum) {
                maximum = numArray[i];
            }
            if (numArray[i]< minimum) {
                minimum = numArray[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
