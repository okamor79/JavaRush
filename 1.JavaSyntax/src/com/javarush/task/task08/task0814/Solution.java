package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {

    static HashSet<Integer> set = new HashSet<>();

    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        for (int i = 0; i < 20; i++) {
            set.add(new Random().nextInt(20));
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
    return set;
    }

    public static void main(String[] args) {

        createSet();
//        set.forEach(System.out::println);
        removeAllNumbersMoreThan10(set);
//        System.out.println();
//        set.forEach(System.out::println);

    }
}
