package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            Cat.cats.add(cat);
        }

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        Cat.cats.forEach(System.out::println);
    }
}
