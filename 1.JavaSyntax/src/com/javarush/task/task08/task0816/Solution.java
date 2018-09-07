package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {     static   HashMap<String, Date> map = new HashMap<String, Date>();

    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        for (int i = 0; i < 9; i++) {
            map.put("name" + i, df.parse("SEPTEMBER 1 1980"));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws Exception {
        //напишите тут ваш код
        DateFormat df = new SimpleDateFormat("MMMMM d", Locale.ENGLISH);
        Iterator<Map.Entry<String, Date>> iter =  map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Date> elem = iter.next();
        if (elem.getValue().toString().contains("Jun") || elem.getValue().toString().contains("Jul") || elem.getValue().toString().contains("Aug") )
                iter.remove();
        }
    }

    public static void main(String[] args) throws Exception {
        createMap();
        removeAllSummerPeople(map);


    }
}
