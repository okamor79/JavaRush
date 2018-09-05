package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle { //напишите тут ваш код
    int top = 4;
    int left = 4;
    int width = 5;
    int height = 6;
    Rectangle anotherRectangle = new Rectangle();
    Rectangle rectangle = new Rectangle();

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }

    public void initialize() {
        this.anotherRectangle = rectangle;
    }

    public static void main(String[] args) {

    }
}
