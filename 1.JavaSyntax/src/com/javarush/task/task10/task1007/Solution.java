package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l = (byte) 1234_564_890L;
        int x = (byte) 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = (byte) l++ + 10 + ++x - (float) m;
        l = (byte) f / 1000;
        l = 1234567;
        System.out.println(l);
    }
}