package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, count = 0;

        while (true) {
            int i = Integer.parseInt(reader.readLine());
            if (i == -1) {
                break;
            }
            sum += i;
            i += 1;
            count += 1;
        }
        System.out.println(sum / (double)count);
    }
}

