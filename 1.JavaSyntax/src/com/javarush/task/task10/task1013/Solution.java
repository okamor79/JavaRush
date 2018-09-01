package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private Date birthday;
        private String email;

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName, int age, boolean sex, Date birthday, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.birthday = birthday;
            this.email = email;
        }

        public Human(String firstName, String lastName, boolean sex, Date birthday) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.birthday = birthday;
        }

        public Human(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String lastName, String email) {
            this.lastName = lastName;
            this.email = email;
        }

        public Human(String firstName, int age, boolean sex, Date birthday) {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.birthday = birthday;
        }

        public Human(String lastName, boolean sex, Date birthday, String email) {
            this.lastName = lastName;
            this.sex = sex;
            this.birthday = birthday;
            this.email = email;
        }

        public Human() {
        }
    }
}
