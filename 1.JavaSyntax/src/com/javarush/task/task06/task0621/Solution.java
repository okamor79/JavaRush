package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandFather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, grandMother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daugtherName = reader.readLine();
        Cat daugther = new Cat(daugtherName, mother, father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daugther);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String fatherName = this.father == null ? "no father" : "father is " + this.father.name;
            String motherName = this.mother == null ? "no mother" : "mother is " + this.mother.name;
            return "Cat name is " + this.name + ", " + motherName + ", " + fatherName;
        }
    }

}
