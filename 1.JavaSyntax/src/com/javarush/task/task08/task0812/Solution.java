package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> numList =  new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int maxLength = 1;
        for (int i = 0; i < 10; i++) {
            numList.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < numList.size() -1; i++) {
            if (Integer.valueOf(numList.get(i)).equals(Integer.valueOf(numList.get(i+1))) ) {
                count += 1;
                if ( maxLength < count) {maxLength = count;}
            } else {
                
                count = 1;
            }
        }
        System.out.println(maxLength);
    }
}