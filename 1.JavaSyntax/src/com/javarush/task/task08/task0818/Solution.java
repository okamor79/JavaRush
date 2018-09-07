package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {

    static HashMap<String, Integer> map = new HashMap<>();

    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            map.put("lastName" + i, rnd.nextInt(1000));
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> elem = iter.next();
            if (Integer.valueOf(elem.getValue()) < 500) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        createMap();
    }
}