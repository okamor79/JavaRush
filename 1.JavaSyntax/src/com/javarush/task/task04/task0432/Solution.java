package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        int i = 0;
        while (i < n) {
            i++;
            System.out.println(str);

        }

    }
}
