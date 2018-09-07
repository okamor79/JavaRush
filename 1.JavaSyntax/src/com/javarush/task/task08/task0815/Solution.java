package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {

    static HashMap<String, String> map = new HashMap<>();

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            map.put("firstName" + i, "lastName" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int firstNameCount = 0;
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            if (iter.next().getValue().equalsIgnoreCase(name)) {
                firstNameCount += 1;
            }
        }
        return firstNameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int lastNameCount = 0;
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            if (iter.next().getKey().equalsIgnoreCase(lastName)) {
                lastNameCount += 1;
            }
        }
        return lastNameCount;
    }

    public static void main(String[] args) {
        createMap();
        getCountTheSameFirstName(map, "firstName3");
        getCountTheSameLastName(map,"lastName4");

    }
}
