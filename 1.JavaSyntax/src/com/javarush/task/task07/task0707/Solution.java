package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("aaaa");
        strArr.add("bbbb");
        strArr.add("cccc");
        strArr.add("dddd");
        strArr.add("eeee");
        System.out.println(strArr.size());
        strArr.forEach(System.out::println);
    }
}
