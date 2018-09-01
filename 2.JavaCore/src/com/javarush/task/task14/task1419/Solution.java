package com.javarush.task.task14.task1419;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new java.lang.NullPointerException());
            exceptions.add(new java.lang.NoSuchFieldException());
            exceptions.add(new java.lang.ReflectiveOperationException());
            exceptions.add(new java.lang.StringIndexOutOfBoundsException());
            exceptions.add(new java.lang.ClassNotFoundException());
        }
        try {
            float i = Float.parseFloat("fsdsdf");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            ArrayList<Object> obj = new ArrayList<>();
            obj.add(-1, new Object());
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[-5];

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
