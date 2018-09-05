package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat catVaska = new Cat("Vaska", 2, 12, 15);
        Cat catBarsik = new Cat("Barsik", 1, 10, 15);
        Cat catMurzik = new Cat("Murzik", 5, 15, 15);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}