package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        SimpleDateFormat sdf = new SimpleDateFormat("D");
        if (Integer.parseInt(sdf.format(date1)) % 2 != 0) {return true;} else {
            return false;
        }
//        System.out.println(sdf.format(date1));
//  return true;
    }
}
