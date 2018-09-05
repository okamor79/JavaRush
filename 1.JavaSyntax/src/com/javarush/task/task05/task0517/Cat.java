package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private static final int DEFAULT_WEIGHT = 1;
    private static final int DEFAULT_AGE = 1;
    private static final String DEFAULT_COLOR = "black";

    private String name;
    private int weight;
    private int age;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.weight = DEFAULT_WEIGHT;
        this.age = DEFAULT_AGE;
        this.color = DEFAULT_COLOR;
    }

    public Cat(String name, int weight, int age) {
        this.name= name;
        this.weight = weight;
        this.age = age;
        this.color = DEFAULT_COLOR;
    }

    public Cat(String name, int age) {
        this.name= name;
        this.weight = DEFAULT_WEIGHT;
        this.age = age;
        this.color = DEFAULT_COLOR;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.age = DEFAULT_AGE;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = DEFAULT_AGE;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
