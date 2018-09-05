package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.DoubleBinaryOperator;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double summa = 0.0;
        while (true) {
            String str = reader.readLine();
            if (!str.equals("сумма")) {
                summa += Double.parseDouble(str);
            } else {
                break;
            }
        }
        System.out.println(summa);
    }
}
