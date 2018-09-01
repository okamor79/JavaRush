package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = inputFormat.parse(reader.readLine());
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
        System.out.println(sdf.format(date).toUpperCase());
    }
}
