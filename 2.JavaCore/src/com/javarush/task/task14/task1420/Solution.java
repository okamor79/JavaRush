package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        String str = "";
        try {
            str = reader.readLine();
            if (Integer.parseInt(str) <= 0)
                throw new Exception();
            else
                a = Integer.parseInt(str);

            str = reader.readLine();
            if (Integer.parseInt(str) <= 0)
                throw new Exception();
            else
                b = Integer.parseInt(str);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;

        }
        System.out.println(nsd(a, b));
        reader.close();
    }

    static int nsd(int a, int b) {
        if (b == 0) return a;
        return nsd(b, a % b);
    }
}
