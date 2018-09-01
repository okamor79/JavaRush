package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arraysList = new ArrayList<>();
        int[] arrSize = {5,2,4,7,0};
        Random rnd = new Random();
        for (int i = 0; i < arrSize.length; i++) {
            int[] array = new int[arrSize[i]];
            for (int j = 0; j < array.length; j++) {
                array[j] = rnd.nextInt(100);
            }
            arraysList.add(array);
        }
        return arraysList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
