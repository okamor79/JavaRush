package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            n *= 2;
            System.out.println(n);
        } else if (n < 0) {
            n += 1;
            System.out.println(n);
        } else {
            System.out.println(n);
        }

    }

}