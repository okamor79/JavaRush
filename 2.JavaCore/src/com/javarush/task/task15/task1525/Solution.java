package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String stringRead;
        try {
            FileReader fr = new FileReader(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(fr);
            while ((stringRead = br.readLine()) != null) {

                Solution.lines.add(stringRead);
            }

            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        System.out.println(lines);
    }
}
