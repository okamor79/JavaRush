package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    private FileInputStream component;


    public TxtInputStream(String fileName) throws UnsupportedFileNameException, FileNotFoundException, Exception {
        super(fileName);

        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        } else {
            FileInputStream fis = new FileInputStream(fileName);
            fis.close();
        }
    }

    public static void main(String[] args) {
    }
}

