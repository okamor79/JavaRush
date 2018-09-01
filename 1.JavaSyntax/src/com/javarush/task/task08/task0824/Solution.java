package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Human child1 = new Human("Carmen", false, 15);
        Human child2 = new Human("Teddy", true, 10);
        Human child3 = new Human("Max", true, 5);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("John",true,55, children);
        Human mother = new Human("Mary",false,45, children);
        ArrayList<Human> grandsF = new ArrayList<>();
        grandsF.add(father);
        ArrayList<Human> grandsM = new ArrayList<>();
        grandsM.add(mother);
        Human grandFatherM = new Human("Tomas", true, 77, grandsM);
        Human grandMotherM = new Human("July", false, 74, grandsM);

        Human grandFatherF = new Human("Andre", true, 70, grandsF);
        Human grandMotherF = new Human("Sally", false, 60, grandsF);

        System.out.println(grandMotherF);
        System.out.println(grandFatherF);
        System.out.println(grandMotherM);
        System.out.println(grandFatherM);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
