package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    static HashMap<String, String> map = new HashMap<>();

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            map.put("LastName" + i, "FirstName" + i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> temp = new HashMap<>(map);
        ArrayList<String> list = new ArrayList<>(map.values());
        for (Map.Entry<String, String> pair: temp.entrySet()) {
            if (Collections.frequency(list, pair.getValue()) > 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        createMap();
        removeTheFirstNameDuplicates(map);
    }
}
