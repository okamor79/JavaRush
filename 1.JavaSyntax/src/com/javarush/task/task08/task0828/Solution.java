package com.javarush.task.task08.task0828;

import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        Date date = new Date();
        System.out.println(sdf.format(date));

        System.out.println(month + "  is the " + 0 + "month");
    }
}
