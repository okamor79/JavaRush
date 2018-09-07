package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFatherF = new Human("John", true, 65 );
        Human grandMotherF = new Human("Marie", false, 55 );
        Human grandFatherM = new Human("Robert", true, 77 );
        Human grandMotherM = new Human("Samanta", false, 59 );

        Human mother = new Human("Liza", false,32,grandFatherF,grandMotherF);
        Human father = new Human("Peter", true,35,grandFatherM,grandMotherM);

        Human childOne = new Human("Bob", true,7, father,mother);
        Human childSecond = new Human("July", false,5, father,mother);
        Human childThrid = new Human("Max", true,1, father,mother);

        System.out.println(grandFatherF);
        System.out.println(grandMotherF);
        System.out.println(grandFatherM);
        System.out.println(grandMotherM);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(childOne);
        System.out.println(childSecond);
        System.out.println(childThrid);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















