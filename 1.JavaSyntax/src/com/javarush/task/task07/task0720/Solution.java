package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        int numN = Integer.parseInt(reader.readLine());
        int numM = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numN; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < numM; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        list.forEach(System.out::println);
        //напишите тут ваш код
}
}
