package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> divThreeList = new ArrayList<>();
        ArrayList<Integer> divTwoList = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            mainList.add(number);

        }
        for (int i = 0; i < mainList.size(); i++) {
            if (mainList.get(i) % 3 == 0) {
                divThreeList.add(mainList.get(i));
            }
            if (mainList.get(i) % 2 == 0) {
                divTwoList.add(mainList.get(i));
            }
            if (mainList.get(i) % 3 != 0 && mainList.get(i) %2 != 0) {
                otherList.add(mainList.get(i));
            }
        }
        printList(divThreeList);
        System.out.println();
        printList(divTwoList);
        System.out.println();
        printList(otherList);

    }

    public static void printList(List<Integer> list) {

        for (Integer i : list) {
            System.out.println(i);
        }//напишите тут ваш код
    }
}
