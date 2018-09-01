package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> numbers = new ArrayList<>();
        while (true) {
            try {
                numbers.add(Double.parseDouble(reader.readLine()));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                numbers.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
