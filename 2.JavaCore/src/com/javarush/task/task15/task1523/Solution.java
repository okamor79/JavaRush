package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    private int number;
    private boolean bool;
    private short aShort;

    public static void main(String[] args) {

    }

    public Solution() {

    }

    protected Solution(int number) {
        this.number = number;
    }

    private Solution(boolean bool) {
        this.bool = bool;
    }

    Solution(int number, boolean bool, short aShort) {
        this.number = number;
        this.bool = bool;
        this.aShort = aShort;
    }
}

