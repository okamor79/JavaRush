package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        int i = 0;
        while (i < 40) {
            for (int j = i; j < s.length(); j++) {
                System.out.printf(s.charAt(j)+"");
            }
            i++;
            System.out.println();
        }
    }

}

